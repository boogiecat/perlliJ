// This is a generated file. Not intended for manual editing.
package com.intellij.lang.perl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.intellij.lang.perl.psi.PerlTypes.*;
import static com.intellij.lang.perl.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PerlParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.intellij.lang.perl.parser.PerlParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    int level_ = 0;
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    if (root_ == ANY_COMMENT) {
      result_ = any_comment(builder_, level_ + 1);
    }
    else if (root_ == FUNCTION) {
      result_ = function(builder_, level_ + 1);
    }
    else if (root_ == ITEM) {
      result_ = item(builder_, level_ + 1);
    }
    else if (root_ == KEYWORD) {
      result_ = keyword(builder_, level_ + 1);
    }
    else if (root_ == STRING_LITERAL) {
      result_ = stringLiteral(builder_, level_ + 1);
    }
    else {
      Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
      result_ = parse_root_(root_, builder_, level_);
      exit_section_(builder_, level_, marker_, root_, result_, true, TOKEN_ADVANCER);
    }
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return perlFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // COMMENT
  public static boolean any_comment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "any_comment")) return false;
    if (!nextTokenIs(builder_, COMMENT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMENT);
    exit_section_(builder_, marker_, ANY_COMMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // AA_ |
  //             BB_ |
  //             CC_|
  //             MM_|
  //             OO_|
  //             RR_|
  //             SS_|
  //             TT_|
  //             WW_|
  //             XX_|
  //             B_|
  //             C_|
  //             D_|
  //             E_|
  //             F_|
  //             G_|
  //             K_|
  //             L_|
  //             O_|
  //             P_|
  //             R_|
  //             S_|
  //             T_|
  //             U_|
  //             W_|
  //             X_|
  //             Z_|
  //             AUTOLOAD|
  //             BEGIN|
  //             CHECK|
  //             DESTROY|
  //             END|
  //             INIT|
  //             UNITCHECK|
  //             ABS|
  //             ACCEPT|
  //             ALARM|
  //             ATAN2|
  //             BIND|
  //             BINMODE|
  //             BLESS|
  //             BREAK|
  //             CALLER|
  //             CHDIR|
  //             CHMOD|
  //             CHOMP|
  //             CHOP|
  //             CHOWN|
  //             CHR|
  //             CHROOT|
  //             CLOSE|
  //             CLOSEDIR|
  //             CONNECT|
  //             COS|
  //             CRYPT|
  //             DBMCLOSE|
  //             DBMOPEN|
  //             DEFINED|
  //             DELETE|
  //             DIE|
  //             DUMP|
  //             EACH|
  //             ENDGRENT|
  //             ENDHOSTENT|
  //             ENDNETENT|
  //             ENDPROTOENT|
  //             ENDPWENT|
  //             ENDSERVENT|
  //             EOF|
  //             EVAL|
  //             EXEC|
  //             EXISTS|
  //             EXIT|
  //             FCNTL|
  //             FILENO|
  //             FLOCK|
  //             FORK|
  //             FORMAT|
  //             FORMLINE|
  //             GETC|
  //             GETGRENT|
  //             GETGRGID|
  //             GETGRNAM|
  //             GETHOSTBYADDR|
  //             GETHOSTBYNAME|
  //             GETHOSTENT|
  //             GETLOGIN|
  //             GETNETBYADDR|
  //             GETNETBYNAME|
  //             GETNETENT|
  //             GETPEERNAME|
  //             GETPGRP|
  //             GETPPID|
  //             GETPRIORITY|
  //             GETPROTOBYNAME|
  //             GETPROTOBYNUMBER|
  //             GETPROTOENT|
  //             GETPWENT|
  //             GETPWNAM|
  //             GETPWUID|
  //             GETSERVBYNAME|
  //             GETSERVBYPORT|
  //             GETSERVENT|
  //             GETSOCKNAME|
  //             GETSOCKOPT|
  //             GLOB|
  //             GMTIME|
  //             GOTO|
  //             GREP|
  //             HEX|
  //             INDEX|
  //             INT|
  //             IOCTL|
  //             JOIN|
  //             KEYS|
  //             KILL|
  //             LAST|
  //             LC|
  //             LCFIRST|
  //             LENGTH|
  //             LINK|
  //             LISTEN|
  //             LOCAL|
  //             LOCALTIME|
  //             LOG|
  //             LSTAT|
  //             MAP|
  //             MKDIR|
  //             MSGCTL|
  //             MSGGET|
  //             MSGRCV|
  //             MSGSND|
  //             MY|
  //             NEXT|
  //             NOT|
  //             OCT|
  //             OPEN|
  //             OPENDIR|
  //             ORD|
  //             OUR|
  //             PACK|
  //             PIPE|
  //             POP|
  //             POS|
  //             PRINT|
  //             PRINTF|
  //             PROTOTYPE|
  //             PUSH|
  //             QUOTEMETA|
  //             RAND|
  //             READ|
  //             READDIR|
  //             READLINE|
  //             READLINK|
  //             READPIPE|
  //             RECV|
  //             REDO|
  //             REF|
  //             RENAME|
  //             REQUIRE|
  //             RESET|
  //             RETURN|
  //             REVERSE|
  //             REWINDDIR|
  //             RINDEX|
  //             RMDIR|
  //             SAY|
  //             SCALAR|
  //             SEEK|
  //             SEEKDIR|
  //             SELECT|
  //             SEMCTL|
  //             SEMGET|
  //             SEMOP|
  //             SEND|
  //             SETGRENT|
  //             SETHOSTENT|
  //             SETNETENT|
  //             SETPGRP|
  //             SETPRIORITY|
  //             SETPROTOENT|
  //             SETPWENT|
  //             SETSERVENT|
  //             SETSOCKOPT|
  //             SHIFT|
  //             SHMCTL|
  //             SHMGET|
  //             SHMREAD|
  //             SHMWRITE|
  //             SHUTDOWN|
  //             SIN|
  //             SLEEP|
  //             SOCKET|
  //             SOCKETPAIR|
  //             SORT|
  //             SPLICE|
  //             SPLIT|
  //             SPRINTF|
  //             SQRT|
  //             SRAND|
  //             STAT|
  //             STATE|
  //             STUDY|
  //             SUBSTR|
  //             SYMLINK|
  //             SYSCALL|
  //             SYSOPEN|
  //             SYSREAD|
  //             SYSSEEK|
  //             SYSTEM|
  //             SYSWRITE|
  //             TELL|
  //             TELLDIR|
  //             TIE|
  //             TIED|
  //             TIME|
  //             TIMES|
  //             TRUNCATE|
  //             UC|
  //             UCFIRST|
  //             UMASK|
  //             UNDEF|
  //             UNLINK|
  //             UNPACK|
  //             UNSHIFT|
  //             UNTIE|
  //             USE|
  //             UTIME|
  //             VALUES|
  //             VEC|
  //             WAIT|
  //             WAITPID|
  //             WANTARRAY|
  //             WARN|
  //             WRITE
  public static boolean function(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<function>");
    result_ = consumeToken(builder_, AA_);
    if (!result_) result_ = consumeToken(builder_, BB_);
    if (!result_) result_ = consumeToken(builder_, CC_);
    if (!result_) result_ = consumeToken(builder_, MM_);
    if (!result_) result_ = consumeToken(builder_, OO_);
    if (!result_) result_ = consumeToken(builder_, RR_);
    if (!result_) result_ = consumeToken(builder_, SS_);
    if (!result_) result_ = consumeToken(builder_, TT_);
    if (!result_) result_ = consumeToken(builder_, WW_);
    if (!result_) result_ = consumeToken(builder_, XX_);
    if (!result_) result_ = consumeToken(builder_, B_);
    if (!result_) result_ = consumeToken(builder_, C_);
    if (!result_) result_ = consumeToken(builder_, D_);
    if (!result_) result_ = consumeToken(builder_, E_);
    if (!result_) result_ = consumeToken(builder_, F_);
    if (!result_) result_ = consumeToken(builder_, G_);
    if (!result_) result_ = consumeToken(builder_, K_);
    if (!result_) result_ = consumeToken(builder_, L_);
    if (!result_) result_ = consumeToken(builder_, O_);
    if (!result_) result_ = consumeToken(builder_, P_);
    if (!result_) result_ = consumeToken(builder_, R_);
    if (!result_) result_ = consumeToken(builder_, S_);
    if (!result_) result_ = consumeToken(builder_, T_);
    if (!result_) result_ = consumeToken(builder_, U_);
    if (!result_) result_ = consumeToken(builder_, W_);
    if (!result_) result_ = consumeToken(builder_, X_);
    if (!result_) result_ = consumeToken(builder_, Z_);
    if (!result_) result_ = consumeToken(builder_, AUTOLOAD);
    if (!result_) result_ = consumeToken(builder_, BEGIN);
    if (!result_) result_ = consumeToken(builder_, CHECK);
    if (!result_) result_ = consumeToken(builder_, DESTROY);
    if (!result_) result_ = consumeToken(builder_, END);
    if (!result_) result_ = consumeToken(builder_, INIT);
    if (!result_) result_ = consumeToken(builder_, UNITCHECK);
    if (!result_) result_ = consumeToken(builder_, ABS);
    if (!result_) result_ = consumeToken(builder_, ACCEPT);
    if (!result_) result_ = consumeToken(builder_, ALARM);
    if (!result_) result_ = consumeToken(builder_, ATAN2);
    if (!result_) result_ = consumeToken(builder_, BIND);
    if (!result_) result_ = consumeToken(builder_, BINMODE);
    if (!result_) result_ = consumeToken(builder_, BLESS);
    if (!result_) result_ = consumeToken(builder_, BREAK);
    if (!result_) result_ = consumeToken(builder_, CALLER);
    if (!result_) result_ = consumeToken(builder_, CHDIR);
    if (!result_) result_ = consumeToken(builder_, CHMOD);
    if (!result_) result_ = consumeToken(builder_, CHOMP);
    if (!result_) result_ = consumeToken(builder_, CHOP);
    if (!result_) result_ = consumeToken(builder_, CHOWN);
    if (!result_) result_ = consumeToken(builder_, CHR);
    if (!result_) result_ = consumeToken(builder_, CHROOT);
    if (!result_) result_ = consumeToken(builder_, CLOSE);
    if (!result_) result_ = consumeToken(builder_, CLOSEDIR);
    if (!result_) result_ = consumeToken(builder_, CONNECT);
    if (!result_) result_ = consumeToken(builder_, COS);
    if (!result_) result_ = consumeToken(builder_, CRYPT);
    if (!result_) result_ = consumeToken(builder_, DBMCLOSE);
    if (!result_) result_ = consumeToken(builder_, DBMOPEN);
    if (!result_) result_ = consumeToken(builder_, DEFINED);
    if (!result_) result_ = consumeToken(builder_, DELETE);
    if (!result_) result_ = consumeToken(builder_, DIE);
    if (!result_) result_ = consumeToken(builder_, DUMP);
    if (!result_) result_ = consumeToken(builder_, EACH);
    if (!result_) result_ = consumeToken(builder_, ENDGRENT);
    if (!result_) result_ = consumeToken(builder_, ENDHOSTENT);
    if (!result_) result_ = consumeToken(builder_, ENDNETENT);
    if (!result_) result_ = consumeToken(builder_, ENDPROTOENT);
    if (!result_) result_ = consumeToken(builder_, ENDPWENT);
    if (!result_) result_ = consumeToken(builder_, ENDSERVENT);
    if (!result_) result_ = consumeToken(builder_, EOF);
    if (!result_) result_ = consumeToken(builder_, EVAL);
    if (!result_) result_ = consumeToken(builder_, EXEC);
    if (!result_) result_ = consumeToken(builder_, EXISTS);
    if (!result_) result_ = consumeToken(builder_, EXIT);
    if (!result_) result_ = consumeToken(builder_, FCNTL);
    if (!result_) result_ = consumeToken(builder_, FILENO);
    if (!result_) result_ = consumeToken(builder_, FLOCK);
    if (!result_) result_ = consumeToken(builder_, FORK);
    if (!result_) result_ = consumeToken(builder_, FORMAT);
    if (!result_) result_ = consumeToken(builder_, FORMLINE);
    if (!result_) result_ = consumeToken(builder_, GETC);
    if (!result_) result_ = consumeToken(builder_, GETGRENT);
    if (!result_) result_ = consumeToken(builder_, GETGRGID);
    if (!result_) result_ = consumeToken(builder_, GETGRNAM);
    if (!result_) result_ = consumeToken(builder_, GETHOSTBYADDR);
    if (!result_) result_ = consumeToken(builder_, GETHOSTBYNAME);
    if (!result_) result_ = consumeToken(builder_, GETHOSTENT);
    if (!result_) result_ = consumeToken(builder_, GETLOGIN);
    if (!result_) result_ = consumeToken(builder_, GETNETBYADDR);
    if (!result_) result_ = consumeToken(builder_, GETNETBYNAME);
    if (!result_) result_ = consumeToken(builder_, GETNETENT);
    if (!result_) result_ = consumeToken(builder_, GETPEERNAME);
    if (!result_) result_ = consumeToken(builder_, GETPGRP);
    if (!result_) result_ = consumeToken(builder_, GETPPID);
    if (!result_) result_ = consumeToken(builder_, GETPRIORITY);
    if (!result_) result_ = consumeToken(builder_, GETPROTOBYNAME);
    if (!result_) result_ = consumeToken(builder_, GETPROTOBYNUMBER);
    if (!result_) result_ = consumeToken(builder_, GETPROTOENT);
    if (!result_) result_ = consumeToken(builder_, GETPWENT);
    if (!result_) result_ = consumeToken(builder_, GETPWNAM);
    if (!result_) result_ = consumeToken(builder_, GETPWUID);
    if (!result_) result_ = consumeToken(builder_, GETSERVBYNAME);
    if (!result_) result_ = consumeToken(builder_, GETSERVBYPORT);
    if (!result_) result_ = consumeToken(builder_, GETSERVENT);
    if (!result_) result_ = consumeToken(builder_, GETSOCKNAME);
    if (!result_) result_ = consumeToken(builder_, GETSOCKOPT);
    if (!result_) result_ = consumeToken(builder_, GLOB);
    if (!result_) result_ = consumeToken(builder_, GMTIME);
    if (!result_) result_ = consumeToken(builder_, GOTO);
    if (!result_) result_ = consumeToken(builder_, GREP);
    if (!result_) result_ = consumeToken(builder_, HEX);
    if (!result_) result_ = consumeToken(builder_, INDEX);
    if (!result_) result_ = consumeToken(builder_, INT);
    if (!result_) result_ = consumeToken(builder_, IOCTL);
    if (!result_) result_ = consumeToken(builder_, JOIN);
    if (!result_) result_ = consumeToken(builder_, KEYS);
    if (!result_) result_ = consumeToken(builder_, KILL);
    if (!result_) result_ = consumeToken(builder_, LAST);
    if (!result_) result_ = consumeToken(builder_, LC);
    if (!result_) result_ = consumeToken(builder_, LCFIRST);
    if (!result_) result_ = consumeToken(builder_, LENGTH);
    if (!result_) result_ = consumeToken(builder_, LINK);
    if (!result_) result_ = consumeToken(builder_, LISTEN);
    if (!result_) result_ = consumeToken(builder_, LOCAL);
    if (!result_) result_ = consumeToken(builder_, LOCALTIME);
    if (!result_) result_ = consumeToken(builder_, LOG);
    if (!result_) result_ = consumeToken(builder_, LSTAT);
    if (!result_) result_ = consumeToken(builder_, MAP);
    if (!result_) result_ = consumeToken(builder_, MKDIR);
    if (!result_) result_ = consumeToken(builder_, MSGCTL);
    if (!result_) result_ = consumeToken(builder_, MSGGET);
    if (!result_) result_ = consumeToken(builder_, MSGRCV);
    if (!result_) result_ = consumeToken(builder_, MSGSND);
    if (!result_) result_ = consumeToken(builder_, MY);
    if (!result_) result_ = consumeToken(builder_, NEXT);
    if (!result_) result_ = consumeToken(builder_, NOT);
    if (!result_) result_ = consumeToken(builder_, OCT);
    if (!result_) result_ = consumeToken(builder_, OPEN);
    if (!result_) result_ = consumeToken(builder_, OPENDIR);
    if (!result_) result_ = consumeToken(builder_, ORD);
    if (!result_) result_ = consumeToken(builder_, OUR);
    if (!result_) result_ = consumeToken(builder_, PACK);
    if (!result_) result_ = consumeToken(builder_, PIPE);
    if (!result_) result_ = consumeToken(builder_, POP);
    if (!result_) result_ = consumeToken(builder_, POS);
    if (!result_) result_ = consumeToken(builder_, PRINT);
    if (!result_) result_ = consumeToken(builder_, PRINTF);
    if (!result_) result_ = consumeToken(builder_, PROTOTYPE);
    if (!result_) result_ = consumeToken(builder_, PUSH);
    if (!result_) result_ = consumeToken(builder_, QUOTEMETA);
    if (!result_) result_ = consumeToken(builder_, RAND);
    if (!result_) result_ = consumeToken(builder_, READ);
    if (!result_) result_ = consumeToken(builder_, READDIR);
    if (!result_) result_ = consumeToken(builder_, READLINE);
    if (!result_) result_ = consumeToken(builder_, READLINK);
    if (!result_) result_ = consumeToken(builder_, READPIPE);
    if (!result_) result_ = consumeToken(builder_, RECV);
    if (!result_) result_ = consumeToken(builder_, REDO);
    if (!result_) result_ = consumeToken(builder_, REF);
    if (!result_) result_ = consumeToken(builder_, RENAME);
    if (!result_) result_ = consumeToken(builder_, REQUIRE);
    if (!result_) result_ = consumeToken(builder_, RESET);
    if (!result_) result_ = consumeToken(builder_, RETURN);
    if (!result_) result_ = consumeToken(builder_, REVERSE);
    if (!result_) result_ = consumeToken(builder_, REWINDDIR);
    if (!result_) result_ = consumeToken(builder_, RINDEX);
    if (!result_) result_ = consumeToken(builder_, RMDIR);
    if (!result_) result_ = consumeToken(builder_, SAY);
    if (!result_) result_ = consumeToken(builder_, SCALAR);
    if (!result_) result_ = consumeToken(builder_, SEEK);
    if (!result_) result_ = consumeToken(builder_, SEEKDIR);
    if (!result_) result_ = consumeToken(builder_, SELECT);
    if (!result_) result_ = consumeToken(builder_, SEMCTL);
    if (!result_) result_ = consumeToken(builder_, SEMGET);
    if (!result_) result_ = consumeToken(builder_, SEMOP);
    if (!result_) result_ = consumeToken(builder_, SEND);
    if (!result_) result_ = consumeToken(builder_, SETGRENT);
    if (!result_) result_ = consumeToken(builder_, SETHOSTENT);
    if (!result_) result_ = consumeToken(builder_, SETNETENT);
    if (!result_) result_ = consumeToken(builder_, SETPGRP);
    if (!result_) result_ = consumeToken(builder_, SETPRIORITY);
    if (!result_) result_ = consumeToken(builder_, SETPROTOENT);
    if (!result_) result_ = consumeToken(builder_, SETPWENT);
    if (!result_) result_ = consumeToken(builder_, SETSERVENT);
    if (!result_) result_ = consumeToken(builder_, SETSOCKOPT);
    if (!result_) result_ = consumeToken(builder_, SHIFT);
    if (!result_) result_ = consumeToken(builder_, SHMCTL);
    if (!result_) result_ = consumeToken(builder_, SHMGET);
    if (!result_) result_ = consumeToken(builder_, SHMREAD);
    if (!result_) result_ = consumeToken(builder_, SHMWRITE);
    if (!result_) result_ = consumeToken(builder_, SHUTDOWN);
    if (!result_) result_ = consumeToken(builder_, SIN);
    if (!result_) result_ = consumeToken(builder_, SLEEP);
    if (!result_) result_ = consumeToken(builder_, SOCKET);
    if (!result_) result_ = consumeToken(builder_, SOCKETPAIR);
    if (!result_) result_ = consumeToken(builder_, SORT);
    if (!result_) result_ = consumeToken(builder_, SPLICE);
    if (!result_) result_ = consumeToken(builder_, SPLIT);
    if (!result_) result_ = consumeToken(builder_, SPRINTF);
    if (!result_) result_ = consumeToken(builder_, SQRT);
    if (!result_) result_ = consumeToken(builder_, SRAND);
    if (!result_) result_ = consumeToken(builder_, STAT);
    if (!result_) result_ = consumeToken(builder_, STATE);
    if (!result_) result_ = consumeToken(builder_, STUDY);
    if (!result_) result_ = consumeToken(builder_, SUBSTR);
    if (!result_) result_ = consumeToken(builder_, SYMLINK);
    if (!result_) result_ = consumeToken(builder_, SYSCALL);
    if (!result_) result_ = consumeToken(builder_, SYSOPEN);
    if (!result_) result_ = consumeToken(builder_, SYSREAD);
    if (!result_) result_ = consumeToken(builder_, SYSSEEK);
    if (!result_) result_ = consumeToken(builder_, SYSTEM);
    if (!result_) result_ = consumeToken(builder_, SYSWRITE);
    if (!result_) result_ = consumeToken(builder_, TELL);
    if (!result_) result_ = consumeToken(builder_, TELLDIR);
    if (!result_) result_ = consumeToken(builder_, TIE);
    if (!result_) result_ = consumeToken(builder_, TIED);
    if (!result_) result_ = consumeToken(builder_, TIME);
    if (!result_) result_ = consumeToken(builder_, TIMES);
    if (!result_) result_ = consumeToken(builder_, TRUNCATE);
    if (!result_) result_ = consumeToken(builder_, UC);
    if (!result_) result_ = consumeToken(builder_, UCFIRST);
    if (!result_) result_ = consumeToken(builder_, UMASK);
    if (!result_) result_ = consumeToken(builder_, UNDEF);
    if (!result_) result_ = consumeToken(builder_, UNLINK);
    if (!result_) result_ = consumeToken(builder_, UNPACK);
    if (!result_) result_ = consumeToken(builder_, UNSHIFT);
    if (!result_) result_ = consumeToken(builder_, UNTIE);
    if (!result_) result_ = consumeToken(builder_, USE);
    if (!result_) result_ = consumeToken(builder_, UTIME);
    if (!result_) result_ = consumeToken(builder_, VALUES);
    if (!result_) result_ = consumeToken(builder_, VEC);
    if (!result_) result_ = consumeToken(builder_, WAIT);
    if (!result_) result_ = consumeToken(builder_, WAITPID);
    if (!result_) result_ = consumeToken(builder_, WANTARRAY);
    if (!result_) result_ = consumeToken(builder_, WARN);
    if (!result_) result_ = consumeToken(builder_, WRITE);
    exit_section_(builder_, level_, marker_, FUNCTION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  static boolean identifier(PsiBuilder builder_, int level_) {
    return consumeToken(builder_, IDENTIFIER);
  }

  /* ********************************************************** */
  // keyword | function | identifier | stringLiteral | any_comment | ANY_CHAR
  public static boolean item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<item>");
    result_ = keyword(builder_, level_ + 1);
    if (!result_) result_ = function(builder_, level_ + 1);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    if (!result_) result_ = stringLiteral(builder_, level_ + 1);
    if (!result_) result_ = any_comment(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ANY_CHAR);
    exit_section_(builder_, level_, marker_, ITEM, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // DATA__ |
  //                        END__ |
  //                        FILE__ |
  //                        LINE__ |
  //                        PACKAGE__ |
  //                        AND |
  //                        CMP |
  //                        CONTINUE |
  //                        CORE |
  //                        DO |
  //                        ELSE |
  //                        ELSIF |
  //                        EQ |
  //                        EXP |
  //                        FOR |
  //                        FOREACH |
  //                        GE |
  //                        GT |
  //                        IF |
  //                        LE |
  //                        LOCK |
  //                        LT |
  //                        M |
  //                        NE |
  //                        NO |
  //                        OR |
  //                        PACKAGE |
  //                        Q |
  //                        QQ |
  //                        QR |
  //                        QW |
  //                        QX |
  //                        X |
  //                        SUB |
  //                        TR |
  //                        UNLESS |
  //                        UNTIL |
  //                        WHILE |
  //                        XOR |
  //                        Y
  public static boolean keyword(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keyword")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<keyword>");
    result_ = consumeToken(builder_, DATA__);
    if (!result_) result_ = consumeToken(builder_, END__);
    if (!result_) result_ = consumeToken(builder_, FILE__);
    if (!result_) result_ = consumeToken(builder_, LINE__);
    if (!result_) result_ = consumeToken(builder_, PACKAGE__);
    if (!result_) result_ = consumeToken(builder_, AND);
    if (!result_) result_ = consumeToken(builder_, CMP);
    if (!result_) result_ = consumeToken(builder_, CONTINUE);
    if (!result_) result_ = consumeToken(builder_, CORE);
    if (!result_) result_ = consumeToken(builder_, DO);
    if (!result_) result_ = consumeToken(builder_, ELSE);
    if (!result_) result_ = consumeToken(builder_, ELSIF);
    if (!result_) result_ = consumeToken(builder_, EQ);
    if (!result_) result_ = consumeToken(builder_, EXP);
    if (!result_) result_ = consumeToken(builder_, FOR);
    if (!result_) result_ = consumeToken(builder_, FOREACH);
    if (!result_) result_ = consumeToken(builder_, GE);
    if (!result_) result_ = consumeToken(builder_, GT);
    if (!result_) result_ = consumeToken(builder_, IF);
    if (!result_) result_ = consumeToken(builder_, LE);
    if (!result_) result_ = consumeToken(builder_, LOCK);
    if (!result_) result_ = consumeToken(builder_, LT);
    if (!result_) result_ = consumeToken(builder_, M);
    if (!result_) result_ = consumeToken(builder_, NE);
    if (!result_) result_ = consumeToken(builder_, NO);
    if (!result_) result_ = consumeToken(builder_, OR);
    if (!result_) result_ = consumeToken(builder_, PACKAGE);
    if (!result_) result_ = consumeToken(builder_, Q);
    if (!result_) result_ = consumeToken(builder_, QQ);
    if (!result_) result_ = consumeToken(builder_, QR);
    if (!result_) result_ = consumeToken(builder_, QW);
    if (!result_) result_ = consumeToken(builder_, QX);
    if (!result_) result_ = consumeToken(builder_, X);
    if (!result_) result_ = consumeToken(builder_, SUB);
    if (!result_) result_ = consumeToken(builder_, TR);
    if (!result_) result_ = consumeToken(builder_, UNLESS);
    if (!result_) result_ = consumeToken(builder_, UNTIL);
    if (!result_) result_ = consumeToken(builder_, WHILE);
    if (!result_) result_ = consumeToken(builder_, XOR);
    if (!result_) result_ = consumeToken(builder_, Y);
    exit_section_(builder_, level_, marker_, KEYWORD, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // item*
  static boolean perlFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "perlFile")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!item(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "perlFile");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // DOUBLE_QUOTED_STRING | SINGLE_QUOTED_STRING
  public static boolean stringLiteral(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stringLiteral")) return false;
    if (!nextTokenIs(builder_, DOUBLE_QUOTED_STRING) && !nextTokenIs(builder_, SINGLE_QUOTED_STRING)
        && replaceVariants(builder_, 2, "<string literal>")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<string literal>");
    result_ = consumeToken(builder_, DOUBLE_QUOTED_STRING);
    if (!result_) result_ = consumeToken(builder_, SINGLE_QUOTED_STRING);
    exit_section_(builder_, level_, marker_, STRING_LITERAL, result_, false, null);
    return result_;
  }

}
