#!/usr/bin/perl -w
use File::Basename;
use utf8;

my $output_file = "corpus_filtre.txt";

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

# print join(" ", @significant_words);

my %signif_words = map { $_ => 1 } @significant_words;

# Write some text to the file.
open (FILE, "$ARGV[0]") or die "Can't open '$ARGV[0]': $!";

	while($line= <FILE> ) {

			@mots = split(/ /, $line);

			my @del_words = ();

			my @mots_copie = @mots;

			foreach $mot (@mots_copie) {

				if(exists($signif_words{"$mot"})) {

					@mots = grep {$_ ne $mot} @mots;
				}
			}

			print OUTPUT_FILE  "@mots";

	}

sub replace_symbols {

	$accentsTxt = $_[0];

	$accentsTxt =~ s/[[:punct:]]/ /g;

	$accentsTxt =~ s/\d/ /g;

	$accentsTxt =~ s/(\s\S\s){1}/ /g;

	$accentsTxt =~ s/(\s\S\s){1}/ /g;

	$accentsTxt =~ s/(^\S\s){1}/ /g;

	$accentsTxt =~ s/(\s\S$){1}/ /g;

	return $accentsTxt;
}