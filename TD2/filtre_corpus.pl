#!/usr/bin/perl -w
use File::Basename;
use utf8;

my $output_file = "corpus_filtre.xml";

# Use the open() function to create the file.
unless(open OUTPUT_FILE, '>'.$output_file) {
    # Die with error message 
    # if we can't open it.
    die "\nUnable to create $output_file\n";
}

open(FILE2, "<", "$ARGV[1]") or die("Can't open file");
@significant_words = <FILE2>;
close(FILE2);
chomp(@significant_words);

print join(" ", @significant_words);

my %signif_words = map { $_ => 1 } @significant_words;

print $signif_words{"acteurs"};

# Write some text to the file.
open (FILE, "$ARGV[0]") or die "Can't open '$ARGV[0]': $!";

	while($line= <FILE> ) {

		if ($line =~ /<texte>/ or $line =~ /<titre>/) {

			$txt = "";

			if ($line =~ /<texte>/) {

				$line =~ qr/\A<texte>(?'contenu_texte'.*)<\/texte>$/;

				$txt = replace_symbols("$+{contenu_texte}");

			} else {

				$line =~ qr/\A<titre>(?'contenu_titre'.*)<\/titre>$/;

				$txt = replace_symbols("$+{contenu_titre}");
			}

			@mots = split(/ /, $txt);

			my @del_words = ();

			foreach $mot (@mots) {

				if(!exists($signif_words{"$mot"})) {

					my @del_words = grep { $mots[$_] eq "$mot" } 0..$#mots;
				}
			}

			if ($line =~ /<texte>/) {

				print OUTPUT_FILE  "<texte>" . "@mots" . "</texte>\n";

			} else {

				print OUTPUT_FILE  "<titre>" . "@mots" . "</titre>\n";
			}
		} else {

			print OUTPUT_FILE $line;
		}
	}

sub replace_symbols {

	$accentsTxt = $_[0];

	$accentsTxt =~ s/[[:punct:]]/ /g;

	$accentsTxt =~ s/\d/ /g;

	# $accentsTxt =~ s/(\b[[:alpha:]]\b){1}/ /g;

	return $accentsTxt;
}