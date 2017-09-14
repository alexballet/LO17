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

			print OUTPUT_FILE '$+{texte}';

			print OUTPUT_FILE "</texte>\n";

			# ------ Texte ------
		}


    print OUTPUT_FILE "</bulletin>\n";
}
}

print OUTPUT_FILE "</corpus>\n";

close OUTPUT_FILE