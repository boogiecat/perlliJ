package com.intellij.lang.perl.lexer;
import com.intellij.lexer.*;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.intellij.lang.perl.psi.PerlTypes.*;

%%

%{
  public _PerlLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _PerlLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

//COMMENTS TABS AND EOLS
EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+
ANY_CHAR =                          .
LINE =                              {ANY_CHAR}*
LINE_COMMENT =                      "#"{LINE}
BLOCK_COMMENT =                     ("=for comment" {COMMENT_TAIL})|"=cut"
COMMENT_TAIL =                      ([^"*"]*("*"+[^"*""/"])?)*("*"+"/")?
COMMENT =                           {LINE_COMMENT} | {BLOCK_COMMENT}

//STRING LITERALS
ESCAPE_SEQUENCE=\\[^\r\n]
CHARACTER_LITERAL="'"([^\\\'\r\n]|{ESCAPE_SEQUENCE})*("'"|\\)?
DOUBLE_QUOTED_STRING=\"([^\\\"\r\n]|{ESCAPE_SEQUENCE})*(\"|\\)?
SINGLE_QUOTED_STRING=\'([^\\\'\r\n]|{ESCAPE_SEQUENCE} | [\\\n])*(\'|\\)?
IDENTIFIER=[a-zA-Z][\_a-zA-Z0-9_]*

%%
<YYINITIAL> {
  {WHITE_SPACE} { return com.intellij.psi.TokenType.WHITE_SPACE; }
  {DOUBLE_QUOTED_STRING} {return DOUBLE_QUOTED_STRING;}
  {SINGLE_QUOTED_STRING} {return SINGLE_QUOTED_STRING;}
  {COMMENT} {return COMMENT; }
//  KEYWORDS
  "__DATA__" {return DATA__;}
  "__END__" {return END__;}
  "__FILE__" {return FILE__;}
  "__LINE__" {return LINE__;}
  "__PACKAGE__" {return PACKAGE__;}
  "and" {return AND;}
  "cmp" {return CMP;}
  "continue" {return CONTINUE;}
  "CORE" {return CORE;}
  "do" {return DO;}
  "else" {return ELSE;}
  "elsif" {return ELSIF;}
  "eq" {return EQ;}
  "exp" {return EXP;}
  "for" {return FOR;}
  "foreach" {return FOREACH;}
  "ge" {return GE;}
  "gt" {return GT;}
  "if" {return IF;}
  "le" {return LE;}
  "lock" {return LOCK;}
  "lt" {return LT;}
  "m" {return M;}
  "ne" {return NE;}
  "no" {return NO;}
  "or" {return OR;}
  "package" {return PACKAGE;}
  "q" {return Q;}
  "qq" {return QQ;}
  "qr" {return QR;}
  "qw" {return QW;}
  "qx" {return QX;}
  "x" {return X;}
  "sub" {return SUB;}
  "tr" {return TR;}
  "unless" {return UNLESS;}
  "until" {return UNTIL;}
  "while" {return WHILE;}
  "xor" {return XOR;}
  "y" {return Y;}
//  FUNCTIONS
  "-A" {return AA_;}
  "-B" {return BB_;}
  "-C" {return CC_;}
  "-M" {return MM_;}
  "-O" {return OO_;}
  "-R" {return RR_;}
  "-S" {return SS_;}
  "-T" {return TT_;}
  "-W" {return WW_;}
  "-X" {return XX_;}
  "-b" {return B_;}
  "-c" {return C_;}
  "-d" {return D_;}
  "-e" {return E_;}
  "-f" {return F_;}
  "-g" {return G_;}
  "-k" {return K_;}
  "-l" {return L_;}
  "-o" {return O_;}
  "-p" {return P_;}
  "-r" {return R_;}
  "-s" {return S_;}
  "-t" {return T_;}
  "-u" {return U_;}
  "-w" {return W_;}
  "-x" {return X_;}
  "-z" {return Z_;}
  "AUTOLOAD" {return AUTOLOAD;}
  "BEGIN" {return BEGIN;}
  "CHECK" {return CHECK;}
  "DESTROY" {return DESTROY;}
  "END" {return END;}
  "INIT" {return INIT;}
  "UNITCHECK" {return UNITCHECK;}
  "abs" {return ABS;}
  "accept" {return ACCEPT;}
  "alarm" {return ALARM;}
  "atan2" {return ATAN2;}
  "bind" {return BIND;}
  "binmode" {return BINMODE;}
  "bless" {return BLESS;}
  "break" {return BREAK;}
  "caller" {return CALLER;}
  "chdir" {return CHDIR;}
  "chmod" {return CHMOD;}
  "chomp" {return CHOMP;}
  "chop" {return CHOP;}
  "chown" {return CHOWN;}
  "chr" {return CHR;}
  "chroot" {return CHROOT;}
  "close" {return CLOSE;}
  "closedir" {return CLOSEDIR;}
  "connect" {return CONNECT;}
  "cos" {return COS;}
  "crypt" {return CRYPT;}
  "dbmclose" {return DBMCLOSE;}
  "dbmopen" {return DBMOPEN;}
  "defined" {return DEFINED;}
  "delete" {return DELETE;}
  "die" {return DIE;}
  "dump" {return DUMP;}
  "each" {return EACH;}
  "endgrent" {return ENDGRENT;}
  "endhostent" {return ENDHOSTENT;}
  "endnetent" {return ENDNETENT;}
  "endprotoent" {return ENDPROTOENT;}
  "endpwent" {return ENDPWENT;}
  "endservent" {return ENDSERVENT;}
  "eof" {return EOF;}
  "eval" {return EVAL;}
  "exec" {return EXEC;}
  "exists" {return EXISTS;}
  "exit" {return EXIT;}
  "fcntl" {return FCNTL;}
  "fileno" {return FILENO;}
  "flock" {return FLOCK;}
  "fork" {return FORK;}
  "format" {return FORMAT;}
  "formline" {return FORMLINE;}
  "getc" {return GETC;}
  "getgrent" {return GETGRENT;}
  "getgrgid" {return GETGRGID;}
  "getgrnam" {return GETGRNAM;}
  "gethostbyaddr" {return GETHOSTBYADDR;}
  "gethostbyname" {return GETHOSTBYNAME;}
  "gethostent" {return GETHOSTENT;}
  "getlogin" {return GETLOGIN;}
  "getnetbyaddr" {return GETNETBYADDR;}
  "getnetbyname" {return GETNETBYNAME;}
  "getnetent" {return GETNETENT;}
  "getpeername" {return GETPEERNAME;}
  "getpgrp" {return GETPGRP;}
  "getppid" {return GETPPID;}
  "getpriority" {return GETPRIORITY;}
  "getprotobyname" {return GETPROTOBYNAME;}
  "getprotobynumber" {return GETPROTOBYNUMBER;}
  "getprotoent" {return GETPROTOENT;}
  "getpwent" {return GETPWENT;}
  "getpwnam" {return GETPWNAM;}
  "getpwuid" {return GETPWUID;}
  "getservbyname" {return GETSERVBYNAME;}
  "getservbyport" {return GETSERVBYPORT;}
  "getservent" {return GETSERVENT;}
  "getsockname" {return GETSOCKNAME;}
  "getsockopt" {return GETSOCKOPT;}
  "glob" {return GLOB;}
  "gmtime" {return GMTIME;}
  "goto" {return GOTO;}
  "grep" {return GREP;}
  "hex" {return HEX;}
  "index" {return INDEX;}
  "int" {return INT;}
  "ioctl" {return IOCTL;}
  "join" {return JOIN;}
  "keys" {return KEYS;}
  "kill" {return KILL;}
  "last" {return LAST;}
  "lc" {return LC;}
  "lcfirst" {return LCFIRST;}
  "length" {return LENGTH;}
  "link" {return LINK;}
  "listen" {return LISTEN;}
  "local" {return LOCAL;}
  "localtime" {return LOCALTIME;}
  "log" {return LOG;}
  "lstat" {return LSTAT;}
  "map" {return MAP;}
  "mkdir" {return MKDIR;}
  "msgctl" {return MSGCTL;}
  "msgget" {return MSGGET;}
  "msgrcv" {return MSGRCV;}
  "msgsnd" {return MSGSND;}
  "my" {return MY;}
  "next" {return NEXT;}
  "not" {return NOT;}
  "oct" {return OCT;}
  "open" {return OPEN;}
  "opendir" {return OPENDIR;}
  "ord" {return ORD;}
  "our" {return OUR;}
  "pack" {return PACK;}
  "pipe" {return PIPE;}
  "pop" {return POP;}
  "pos" {return POS;}
  "print" {return PRINT;}
  "printf" {return PRINTF;}
  "prototype" {return PROTOTYPE;}
  "push" {return PUSH;}
  "quotemeta" {return QUOTEMETA;}
  "rand" {return RAND;}
  "read" {return READ;}
  "readdir" {return READDIR;}
  "readline" {return READLINE;}
  "readlink" {return READLINK;}
  "readpipe" {return READPIPE;}
  "recv" {return RECV;}
  "redo" {return REDO;}
  "ref" {return REF;}
  "rename" {return RENAME;}
  "require" {return REQUIRE;}
  "reset" {return RESET;}
  "return" {return RETURN;}
  "reverse" {return REVERSE;}
  "rewinddir" {return REWINDDIR;}
  "rindex" {return RINDEX;}
  "rmdir" {return RMDIR;}
  "say" {return SAY;}
  "scalar" {return SCALAR;}
  "seek" {return SEEK;}
  "seekdir" {return SEEKDIR;}
  "select" {return SELECT;}
  "semctl" {return SEMCTL;}
  "semget" {return SEMGET;}
  "semop" {return SEMOP;}
  "send" {return SEND;}
  "setgrent" {return SETGRENT;}
  "sethostent" {return SETHOSTENT;}
  "setnetent" {return SETNETENT;}
  "setpgrp" {return SETPGRP;}
  "setpriority" {return SETPRIORITY;}
  "setprotoent" {return SETPROTOENT;}
  "setpwent" {return SETPWENT;}
  "setservent" {return SETSERVENT;}
  "setsockopt" {return SETSOCKOPT;}
  "shift" {return SHIFT;}
  "shmctl" {return SHMCTL;}
  "shmget" {return SHMGET;}
  "shmread" {return SHMREAD;}
  "shmwrite" {return SHMWRITE;}
  "shutdown" {return SHUTDOWN;}
  "sin" {return SIN;}
  "sleep" {return SLEEP;}
  "socket" {return SOCKET;}
  "socketpair" {return SOCKETPAIR;}
  "sort" {return SORT;}
  "splice" {return SPLICE;}
  "split" {return SPLIT;}
  "sprintf" {return SPRINTF;}
  "sqrt" {return SQRT;}
  "srand" {return SRAND;}
  "stat" {return STAT;}
  "state" {return STATE;}
  "study" {return STUDY;}
  "substr" {return SUBSTR;}
  "symlink" {return SYMLINK;}
  "syscall" {return SYSCALL;}
  "sysopen" {return SYSOPEN;}
  "sysread" {return SYSREAD;}
  "sysseek" {return SYSSEEK;}
  "system" {return SYSTEM;}
  "syswrite" {return SYSWRITE;}
  "tell" {return TELL;}
  "telldir" {return TELLDIR;}
  "tie" {return TIE;}
  "tied" {return TIED;}
  "time" {return TIME;}
  "times" {return TIMES;}
  "truncate" {return TRUNCATE;}
  "uc" {return UC;}
  "ucfirst" {return UCFIRST;}
  "umask" {return UMASK;}
  "undef" {return UNDEF;}
  "unlink" {return UNLINK;}
  "unpack" {return UNPACK;}
  "unshift" {return UNSHIFT;}
  "untie" {return UNTIE;}
  "use" {return USE;}
  "utime" {return UTIME;}
  "values" {return VALUES;}
  "vec" {return VEC;}
  "wait" {return WAIT;}
  "waitpid" {return WAITPID;}
  "wantarray" {return WANTARRAY;}
  "warn" {return WARN;}
  "write" {return WRITE;}
  {IDENTIFIER} {return IDENTIFIER; }

  .
    { return ANY_CHAR; }


//  [^] {return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
