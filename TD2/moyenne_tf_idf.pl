#!/usr/bin/perl -w
use File::Basename;
use utf8;
use Statistics::Descriptive;

my $output_file = "result_moy_tf_idf.txt";

my $output_file2 = "selection_moy_tf_idf_manual.txt";

my $output_file3 = "selection_moy_tf_idf_quantile.txt";

my $debut_intervale = 1.12;
my $fin_intervale = 2.5;

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

unless(open OUTPUT_FILE3, '>'.$output_file3) {
    # Die with error message 
    # if we can't open it.
    die "\nUnable to create $output_file\n";
}

my %coeffs = ();

my %occurence_mot = ();

my @moy_occurence_mot = ();

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

		my $i = 0;

		foreach my $mot (sort { ($coeffs{$a} / $occurence_mot{$a}) <=> ($coeffs{$b} / $occurence_mot{$b}) } keys %coeffs) {

				$moy = $coeffs{"$mot"} / $occurence_mot{"$mot"};

				@moy_occurence_mot[$i] = $moy;

				$i = $i + 1;

				print OUTPUT_FILE $mot . " " . $moy . "\n";
	}

	$stat = Statistics::Descriptive::Full->new();

	$stat->add_data(@moy_occurence_mot);

	print $stat->quantile(0) . "\n";
  	print $stat->quantile(1) . "\n";
  	print $stat->quantile(2) . "\n";
  	print $stat->quantile(3) . "\n";
  	print $stat->quantile(4) . "\n";

	foreach my $mot (sort { ($coeffs{$a} / $occurence_mot{$a}) <=> ($coeffs{$b} / $occurence_mot{$b}) } keys %coeffs) {

				$moy = $coeffs{"$mot"} / $occurence_mot{"$mot"};

				if ($moy < $debut_intervale || $moy > $fin_intervale) {

					print OUTPUT_FILE2 $mot . "\n";
				}

				if ($moy < $stat->quantile(1) || $moy > $stat->quantile(3)) {

					print OUTPUT_FILE3 $mot . "\n";
				}
	}