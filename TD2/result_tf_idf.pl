#!/usr/bin/perl -w
use File::Basename;
use utf8;

my $output_file = "last_file.txt";

# Use the open() function to create the file.
unless(open OUTPUT_FILE, '>'.$output_file) {
    # Die with error message 
    # if we can't open it.
    die "\nUnable to create $output_file\n";
}

