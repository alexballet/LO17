#!/usr/bin/perl -w
use File::Basename;
use utf8;

my $output_file = "columns.txt";

my $output_file2 = "coeffs.txt";

my $output_file3 = "last_file.txt";

# Use the open() function to create the file.
unless(open OUTPUT_FILE, '>'.$output_file) {
    # Die with error message 
    # if we can't open it.
    die "\nUnable to create $output_file\n";
}

# Use the open() function to create the file.
unless(open OUTPUT_FILE2, '>'.$output_file2) {
    # Die with error message 
    # if we can't open it.
    die "\nUnable to create $output_file\n";
}

# Use the open() function to create the file.
unless(open OUTPUT_FILE3, '>'.$output_file3) {
    # Die with error message 
    # if we can't open it.
    die "\nUnable to create $output_file\n";
}

my %coeffs = ();

my %found_word = ();

my $nb_docs = 0;

my @files_word_count = ();

my $i = 0;

# Write some text to the file.
open (FILE, "@ARGV") or die "Can't open '@ARGV': $!";

	while($line= <FILE> ) {

		if ($line =~ /<fichier>/) {

			$line =~ qr/\A<fichier>(?'nom_fichier'.*)<\/fichier>$/;

			$fichier = "$+{nom_fichier}";

			%found_word = ();

			$nb_docs = $nb_docs + 1;

		} elsif ($line =~ /<texte>/ or $line =~ /<titre>/) {

			$txt = "";

			if ($line =~ /<texte>/) {

				$line =~ qr/\A<texte>(?'contenu_texte'.*)<\/texte>$/;

				$txt = replace_symbols("$+{contenu_texte}");

			} else {

				$line =~ qr/\A<titre>(?'contenu_titre'.*)<\/titre>$/;

				$txt = replace_symbols("$+{contenu_titre}");
			}

			@mots = split(/ /, $txt);

			my %ind_mots = ();

			foreach $mot (@mots) {

				if ($found_word{"$mot"}) {

					} else {

						$found_word{"$mot"} = 1;

						if ($coeffs{"$mot"}) {

							$coeffs{"$mot"} = $coeffs{"$mot"} + 1;

						} else {

							$coeffs{"$mot"} = 1;
						}
					}

				if ($ind_mots{"$mot"}) {

					$ind_mots{"$mot"} = $ind_mots{"$mot"} + 1;

				} else {

					$ind_mots{"$mot"} = 1;
				}

			}

			foreach $mot (keys %ind_mots) {

				# print OUTPUT_FILE $fichier . " " . $mot . " " . $ind_mots{"$mot"} . "\n";

				$files_word_count[$i] = $fichier . " " . $mot . " " . $ind_mots{"$mot"};

				$i = $i + 1;

			}
		}
	}

	foreach $mot (keys %coeffs) {

				$idf = log($nb_docs / $coeffs{"$mot"})/log(10);

				print OUTPUT_FILE2 $mot . " " . $idf . "\n";
	}

	foreach $file_word_count (@files_word_count) {

				@sp = split(/ /, $file_word_count);

				$res = $sp[2] * log($nb_docs / $coeffs{"$sp[1]"})/log(10);

				# if ($res <= 2) {

					print OUTPUT_FILE3 $sp[0] . " " . $sp[1] . " " . $res . "\n";
				# }
	}



sub replace_symbols {

	$accentsTxt = $_[0];

	$accentsTxt =~ s/[[:punct:]]/ /g;

	$accentsTxt =~ s/\d/ /g;

	# $accentsTxt =~ s/(\b[[:alpha:]]\b){1}/ /g;

	return $accentsTxt;
}