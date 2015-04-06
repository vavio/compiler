package analyzer;
import static analyzer.Token.*;
%%
%unicode 7.0.0 
%16bit
%ignorecase
%class Lexer
%type Token

L = [\u0430\u0410][\u043A\u041A][\u043E\u041E]
D = [0-9]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
{L}({L}|{D})* {lexeme=yytext(); return ID;}
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}