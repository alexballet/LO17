#!/usr/bin/perl -w
use File::Basename;
use utf8;

my $output_file = "corpus.xml";

# Use the open() function to create the file.
unless(open OUTPUT_FILE, '>'.$output_file) {
    # Die with error message 
    # if we can't open it.
    die "\nUnable to create $file\n";
}

# Write some text to the file.

print OUTPUT_FILE "<corpus>\n";

opendir(DIR, "BULLETINS") or die "cannot open directory BULLETINS";

@docs = grep(/\.htm$/, readdir(DIR));
foreach $file (@docs) {

	$nb_images = 0;

	$is_reading_text_image_paragraph = 0;

	$is_reading_legende_image = 0;

	$text = "";

	$legende = "";

	print OUTPUT_FILE "<bulletin>\n";

	# ------ Name of file ------

	print OUTPUT_FILE "<fichier>";

	$name = basename($file);

	$name = replace_accents($name);

	print OUTPUT_FILE "$name";

	print OUTPUT_FILE "</fichier>\n";

	# ------ Name of file ------

	open (FILE, "BULLETINS/".$file) or die "Can't open '$file': $!";

	while($line= <FILE> ) {

		if ($line =~ /<title>/) {

			$line =~ qr/\A<title>(?'date'\d{4}\/\d{2}\/\d{2})&nbsp;&gt; \w{2} \w+&nbsp;(?'numero'\d+)&nbsp;&gt; (?'title'.*)<\/title>$/;

        		# ------ Numero bulletin ------

				print OUTPUT_FILE "<numero>";

				print OUTPUT_FILE "$+{numero}";

				print OUTPUT_FILE "</numero>\n";

				# ------ Numero bulletin ------

				# ------ Date ------

				print OUTPUT_FILE "<date>";

				my @values = split('/', $+{date});

				print OUTPUT_FILE "$values[-1]/$values[-2]/$values[-3]";

				print OUTPUT_FILE "</date>\n";

				# ------ Date ------

				# ------ Date ------

				print OUTPUT_FILE "<titre>";

				$title = replace_accents("$+{title}");

				print OUTPUT_FILE "$title";

				print OUTPUT_FILE "</titre>\n";

				# ------ Date ------

		} elsif ($line =~ /<p class="style96"><span class="style42">/) {

			$line =~ qr/<p class="style96"><span class="style42">(?'rubrique'.*)<br>/;

			# ------ Rubrique ------

			print OUTPUT_FILE "<rubrique>";

			$rubrique = replace_accents("$+{rubrique}");

			print OUTPUT_FILE "$rubrique";

			print OUTPUT_FILE "</rubrique>\n";

			# ------ Rubrique ------

		} elsif ($line =~ /<p class="style96"><span class="style95">/) {


			$line =~ qr/<p class="style96"><span class="style95">(?'texte'.*)<\/span><\/p><\/td>/;

			# ------ Text ------

			if ($+{texte}) {

				$text = $text . "$+{texte}";

			} else {

				$line =~ qr/<p class="style96"><span class="style95">(?'texte'.*)<br \/>/;

				$text = $text . "$+{texte}";

				$is_reading_text_image_paragraph = 1;
			}

			# ------ Texte ------

		} elsif ($line =~ /<\/span><div.*><img src="/) {

			if ($has_found_image) {
				$nb_images = $nb_images + 1;
			}

			$line =~ qr/<\/span><div.*><img src="(?'url'.+)" border.*<br \/>/;

			$images_url[$nb_images] = $+{url};

			$has_found_image = 1;

		} elsif ($line =~ /<span class="style21"><strong>/) {

			if ($has_found_image) {

				if ($line =~ qr/<span class="style21"><strong>(?'legende'.*)<\/strong>.*$/) {

					$images_legende[$nb_images] = $+{legende};

					$has_found_image = 0;
					$nb_images = $nb_images + 1;

				} elsif ($line =~ qr/<span class="style21"><strong>(?'legende'.*)<br \/>$/) {

					$legende = "";

					$legende = $legende . "$+{legende}";

					$is_reading_legende_image = 1;
				}

			} else {

				print("Has found legende but has not found image : $name");
			}
		} elsif ($line =~ qr/.*<\/p>.*$/ && $is_reading_text_image_paragraph) {

				$is_reading_text_image_paragraph = 0;

		} elsif ($line =~ qr/(?'legende'.*)<\/strong><br \/><\/span>$/ && $is_reading_legende_image) {

				$legende = $legende . "$+{legende}";

				$images_legende[$nb_images] = $legende;

				$has_found_image = 0;
				$nb_images = $nb_images + 1;

				$is_reading_legende_image = 0;

		} elsif ($line =~ qr/<span class="style88">(?'credits'.*)<\/span><\/div><span class="style95">.*$/) {


		} elsif ($line =~ qr/<p class="style44"><span class="style85">(?'name'.*)<a href="mailto:.*">(?'mail'.*)<\/a><\/span>.*$/) {

			# ------ Contact ------

			print OUTPUT_FILE "<contact>";

			$string = "$+{name}" . "$+{mail}";

			$string = replace_accents("$string");

			print OUTPUT_FILE "$string";

			print OUTPUT_FILE "</contact>\n";

			# ------ Contact ------

		} elsif ($is_reading_text_image_paragraph) {

			if ($is_reading_legende_image) {

				$line =~ qr/(?'legende'.*)$/;

				$legende = $legende . "$+{legende}";

			} else {

				$line =~ qr/(?'texte'.*)$/;

				$text = $text . "$+{texte}";
			}
		}
}

# ------ Text ------

print OUTPUT_FILE "<texte>";

$text =~ s/<br \/>//g;
$text =~ s/<\/strong>//g;
$text =~ s/<strong \/>//g;
$text =~ s/<strong>//g;

$text = replace_accents("$text");

print OUTPUT_FILE "$text";

print OUTPUT_FILE "</texte>\n";

# ------ Texte ------

# ------ Images ------

print OUTPUT_FILE "<images>\n";

if ($nb_images >= 1) {

	for (my $i=0; $i < $nb_images; $i++) {

	print OUTPUT_FILE "<image>\n";

	print OUTPUT_FILE "<urlImage>";

	print OUTPUT_FILE "$images_url[$i]";

	print OUTPUT_FILE "</urlImage>\n";

	print OUTPUT_FILE "<legendeImage>";

	if (scalar($images_legende[$i])) {

		$legende = replace_accents("$images_legende[$i]");

		print OUTPUT_FILE "$legende";
	}

	print OUTPUT_FILE "</legendeImage>\n";
   
    print OUTPUT_FILE "</image>\n";

	}
}

print OUTPUT_FILE "</images>\n";

# ------ Images ------

print OUTPUT_FILE "</bulletin>\n";

}

print OUTPUT_FILE "</corpus>\n";

close OUTPUT_FILE;

sub replace_accents {

	$accentsTxt = $_[0];

	$accentsTxt =~ s/&nbsp;/ /g;
	$accentsTxt =~ s/&ecirc;/ê/g;
	$accentsTxt =~ s/&ouml;/ö/g;
	$accentsTxt =~ s/&ucirc;/û/g;
	$accentsTxt =~ s/&egrave;/è/g;
	$accentsTxt =~ s/&icirc;/î/g;
	$accentsTxt =~ s/&eacute;/é/g;
    $accentsTxt =~ s/&quot;/'/g;
    $accentsTxt =~ s/&agrave;/à/g;
    $accentsTxt =~ s/&acirc;/â/g;
    $accentsTxt =~ s/&iuml;/ï/g;
    $accentsTxt =~ s/&ocirc;/ô/g;
    $accentsTxt =~ s/&ccedil;/ç/g;
    $accentsTxt =~ s/&euml;/ë/g;
    $accentsTxt =~ s/&ugrave;/ù/g;
    $accentsTxt =~ s/&szlig;/ß/g;
    $accentsTxt =~ s/&uuml;/ü/g;
    $accentsTxt =~ s/&amp;/et/g;
    $accentsTxt =~ s/&deg;/°/g;
    $accentsTxt =~ s/&ograve;/ò/g;
    $accentsTxt =~ s/&ecirc;/ê/g;
    $accentsTxt =~ s/&#338;/Œ/g;
    $accentsTxt =~ s/&#8211/—/g;
    $accentsTxt =~ s/&#21;/--/g;
	$accentsTxt =~ s/&nbsp;/ /g;
	$accentsTxt =~ s/&nbsp;/ /g;
	$accentsTxt =~ s/&nbsp;/ /g;
	$accentsTxt =~ s/<.+?>/ /g;

	return $accentsTxt;
}