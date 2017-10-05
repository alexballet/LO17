#!/usr/bin/perl -w
use File::Basename;
use utf8;

my $output_file = "result_moy_tf_idf.txt";

my $output_file2 = "selection_moy_tf_idf.txt";

# Use the open() function to create the file.
unless(open OUTPUT_FILE, '>'.$output_file) {
    # Die with error message 
    # if we can't open it.
    die "\nUnable to create $output_file\n";
}

unless(open OUTPUT_FILE2, '>'.$output_file2) {
    # Die with error message 
    # if we can't open it.
    die "\nUnable to create $output_file\n";
}

my %coeffs = ();

my %occurence_mot = ();

# Write some text to the file.
open (FILE, "@ARGV") or die "Can't open '@ARGV': $!";

	while($line= <FILE> ) {

		@sp = split(/ /, $line);

			if ($coeffs{"$sp[1]"}) {

				$coeffs{"$sp[1]"} = $coeffs{"$sp[1]"} + $sp[2];

			} else {

				$coeffs{"$sp[1]"} = $sp[2];
			}

			if ($occurence_mot{"$sp[1]"}) {

				$occurence_mot{"$sp[1]"} = $occurence_mot{"$sp[1]"} + 1;

			} else {

				$occurence_mot{"$sp[1]"} = 1;
			}
		}

		foreach my $mot (sort { ($coeffs{$a} / $occurence_mot{$a}) <=> ($coeffs{$b} / $occurence_mot{$b}) } keys %coeffs) {

				$moy = $coeffs{"$mot"} / $occurence_mot{"$mot"};

				print OUTPUT_FILE $mot . " " . $moy . "\n";
	}

	foreach my $mot (sort { ($coeffs{$a} / $occurence_mot{$a}) <=> ($coeffs{$b} / $occurence_mot{$b}) } keys %coeffs) {

				$moy = $coeffs{"$mot"} / $occurence_mot{"$mot"};

				if ($moy >= 1.12 && $moy <= 2.5) {

					print OUTPUT_FILE2 $mot . "\n";
				}
	}