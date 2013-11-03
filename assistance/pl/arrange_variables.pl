#!/usr/bin/perl
#Content taken from http://learn.perl.org/docs/keywords.html#barewords

use strict;
use warnings;

open INPUT, "<", "../data/variables.txt" or die "Can't open input file: $1\n";
open OUTPUT, ">", "variables.txt" or die "Can't open input file: $1\n";
my @lines = <INPUT>;
my @words;
foreach (@lines) {
   chomp;
   my @row = split /\s+/;
   @words = (@words, @row);
}
my @sorted_rows = sort @words;
foreach (@sorted_rows) {
    print OUTPUT $_ . "\n";
}

close INPUT;
close OUTPUT;