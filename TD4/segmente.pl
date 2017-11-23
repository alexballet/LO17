#!/usr/bin/perl
use strict;
use warnings;

use feature 'say';

{
    local $/ = ' ';

    while (<>) {
        replace_symbols(say);
    }
}

sub replace_symbols {

	my $accentsTxt = $_[0];

	$accentsTxt =~ s/[[:punct:]]/ /g;

	$accentsTxt =~ s/\d/ /g;

	$accentsTxt =~ s/(\s\S\s){1}/ /g;

	$accentsTxt =~ s/(\s\S\s){1}/ /g;

	$accentsTxt =~ s/(^\S\s){1}/ /g;

	$accentsTxt =~ s/(\s\S$){1}/ /g;

	return $accentsTxt;
}