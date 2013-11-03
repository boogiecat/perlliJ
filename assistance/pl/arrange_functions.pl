#!/usr/bin/perl
#Content taken from http://learn.perl.org/docs/keywords.html#barewords

use strict;
use warnings;

open INPUT, "<", "../data/functions.txt" or die "Can't open input file: $1\n";
open LEXER, ">", "lexer_functions.txt"   or die "Can't open output file: $1\n";
open BNF, ">", "bnf_functions.txt"   or die "Can't open output file: $1\n";
open BNF_JOIN, ">", "joined_tokens_functions.txt"   or die "Can't open output file: $1\n";
open COMMA_TOKENS, ">", "comma_token_functions.txt"   or die "Can't open output file: $1\n";
my @lines = <INPUT>;
my @words;
foreach (@lines) {
   chomp;
   my @row = split /\s+/;
   @words = (@words, @row);
}
my @sorted_rows = sort @words;
  foreach (@sorted_rows) {
    print LEXER ( "\"" . $_. "\" {return " . (uc($_)) .";}\n" );
    print BNF ( (uc($_)) ."=\"".$_."\"\n" );
    print BNF_JOIN uc $_."\|"." \n";
    print COMMA_TOKENS uc $_ . ",\n";
  }
close LEXER or die "Can't close output: $1\n";
close BNF or die "Can't close output: $1\n";
close BNF_JOIN or die "Can't close input\n";
close INPUT or die "Can't close input\n";
close COMMA_TOKENS or die "Can't close input\n";




