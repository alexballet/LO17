#!/usr/bin/perl -w
use File::Basename;

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

	print OUTPUT_FILE "<bulletin>\n";

	# ------ Name of file ------

	print OUTPUT_FILE "<fichier>";

	$name = basename($file);

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

				print OUTPUT_FILE "$+{title}";

				print OUTPUT_FILE "</titre>\n";

				# ------ Date ------

		} elsif ($line =~ /<p class="style96"><span class="style42">/) {

			$line =~ qr/<p class="style96"><span class="style42">(?'rubrique'.*)<br>/;

			# ------ Rubrique ------

			print OUTPUT_FILE "<rubrique>";

			print OUTPUT_FILE "$+{rubrique}";

			print OUTPUT_FILE "</rubrique>\n";

			# ------ Rubrique ------

		} elsif ($line =~ /<p class="style96"><span class="style95">/) {

			$line =~ qr/<p class="style96"><span class="style95">(?'texte'.*)<\/span><\/p><\/td>/;

			# ------ Text ------

			print OUTPUT_FILE "<texte>";

			if ($+{texte}) {

				print OUTPUT_FILE "$+{texte}";

			} else {

				$line =~ qr/<p class="style96"><span class="style95">(?'texte'.*)<br \/>/;

				print OUTPUT_FILE "$+{texte}";
			}

			print OUTPUT_FILE "</texte>\n";

			# ------ Texte ------

		} elsif ($line =~ /<\/span><div style="text-align: center"><img src="/) {

			$line =~ qr/<\/span><div style="text-align: center"><img src="(?'url'.+)" border.*<br \/>/;

			$images_url[$nb_images] = $+{url};

			$has_found_image = 1;

			next;

		} elsif ($has_found_image && $line =~ /<span class="style21"><strong>/) {

			$line =~ qr/<span class="style21"><strong>(?'legende'.*)<\/strong>.*$/;

			$images_legende[$nb_images] = $+{legende};
		}

		if ($has_found_image) {

			$has_found_image = 0;
			$nb_images = $nb_images + 1;
		}
}

# ------ Images ------

print OUTPUT_FILE "<images>\n";

if ($nb_images >= 1) {

	for (my $i=0; $i <= $nb_images; $i++) {

	print OUTPUT_FILE "<image>\n";

	print OUTPUT_FILE "<urlImage>";

	print OUTPUT_FILE "$images_url[$i]";

	print OUTPUT_FILE "</urlImage>\n";

	print OUTPUT_FILE "<legendeImage>";

	print OUTPUT_FILE "$images_legende[$i]";

	print OUTPUT_FILE "</legendeImage>\n";
   
    print OUTPUT_FILE "</image>\n";

	}
}

print OUTPUT_FILE "</images>\n";

# ------ Images ------

print OUTPUT_FILE "</bulletin>\n";
}

print OUTPUT_FILE "</corpus>\n";

close OUTPUT_FILE