#!/usr/bin/perl

use strict;
use warnings;

open INPUT, "<", "../data/keywords.txt" or die "Can't open input file: $1\n";
open OUTPUT, ">>", "output_keywords.txt"   or die "Can't open output file: $1\n";
my @lines = <INPUT>;
foreach (@lines) {
   chomp;
   print OUTPUT ( "\"" . $_. "\" {return " . (uc($_)) .";}\n" );
}
close OUTPUT or die "Can't close output: $1\n";
close INPUT or die "Can't close input\n";
