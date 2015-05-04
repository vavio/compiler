package lexer;
import static lexer.JFlexToken.*;

%%

%unicode 7.0.0 
%16bit
%ignorecase
%line
%column

%class Lexer
%type JFlexToken
CHAR = [[A-Za-z][\u0430\u0410][\u0431\u0411][\u0432\u0412][\u0433\u0413][\u0434\u0414][\u0453\u0403][\u0435\u0415][\u0436\u0416][\u0437\u0417][\u0455\u0405][\u0438\u0418][\u0458\u0408jJ][\u043A\u041A][\u043B\u041B][\u0459\u0409][\u043C\u041C][\u043D\u041D][\u045A\u040A][\u043E\u041E][\u043F\u041F][\u0440\u0420][\u0441\u0421][\u0442\u0422][\u045C\u040C][\u0443\u0423][\u0444\u0424][\u0445\u0425][\u0446\u0426][\u0447\u0427][\u045F\u040F][\u0448\u0428]]
SPECIAL = [._]
DIGIT = [0-9]
BLANK=[ \t\r\n\s]

%{
public String leksema;
public int line;
public int column;

public void updateValues(){
leksema = yytext();
line = yyline;
column = yycolumn;
}
%}

%%

[\u043E\u041E][\u043A\u041A][\u043E\u041E][\u043B\u041B][\u0438\u0418][\u043D\u041D][\u0430\u0410] { updateValues(); return KW_OKOLINA; }
[\u0455\u0405][\u0438\u0418][\u0434\u0414][\u043E\u041E][\u0432\u0412][\u0438\u0418] { updateValues(); return KW_OKOLINA_DZID; }
[\u043F\u041F][\u043E\u041E][\u0447\u0427][\u0435\u0415][\u0442\u0422][\u043E\u041E][\u043A\u041A] { updateValues(); return KW_POCHETOK; }
[\u043A\u041A][\u0440\u0420][\u0430\u0410][jJ\u0458\u0408] { updateValues(); return KW_KRAJ; }
[\u0436\u0416][\u0435\u0415][\u0442\u0422][\u043E\u041E][\u043D\u041D][\u0438\u0418] { updateValues(); return  KW_OKOLINA_ZHETON; }
[\u0440\u0420][\u043E\u041E][\u0431\u0411][\u043E\u041E][\u0442\u0422] { updateValues(); return KW_ROBOT; }
[\u043F\u041F][\u0440\u0420][\u043E\u041E][\u0446\u0426][\u0435\u0415][\u0434\u0414][\u0443\u0423][\u0440\u0420][\u0430\u0410] { updateValues(); return KW_PROCEDURA; }

[\u0431\u0411][\u0440\u0420][\u043E\u041E][jJ\u0458\u0408] { updateValues(); return KW_BROJ; }
[\u043D\u041D][\u0430\u0410][\u0441\u0421][\u043E\u041E][\u043A\u041A][\u0430\u0410] { updateValues(); return KW_NASOKA; }

[\u043E\u041E][\u0434\u0414][\u0438\u0418] { updateValues(); return KW_ODI; }
[\u0441\u0421][\u0432\u0412][\u0440\u0420][\u0442\u0422][\u0438\u0418][\u043B\u041B][\u0435\u0415][\u0432\u0412][\u043E\u041E] { updateValues(); return KW_LEVO; }
[\u0441\u0421][\u0432\u0412][\u0440\u0420][\u0442\u0422][\u0438\u0418][\u0434\u0414][\u0435\u0415][\u0441\u0421][\u043D\u041D][\u043E\u041E] { updateValues(); return KW_DESNO; }
[\u0437\u0417][\u0435\u0415][\u043C\u041C][\u0438\u0418] { updateValues(); return KW_ZEMI; }
[\u043E\u041E][\u0441\u0421][\u0442\u0422][\u0430\u0410][\u0432\u0412][\u0438\u0418] { updateValues(); return KW_OSTAVI; }

[\u0430\u0410][\u043A\u041A][\u043E\u041E] { updateValues(); return KW_AKO; }
[\u0436\u0416][\u0435\u0415][\u0442\u0422][\u043E\u041E][\u043D\u041D] { updateValues(); return KW_ZHETON; }
[\u0455\u0405][\u0438\u0418][\u0434\u0414] { updateValues(); return KW_DZID; }

[\u043F\u041F][\u043E\u041E][\u0432\u0412][\u0442\u0422][\u043E\u041E][\u0440\u0420][\u0443\u0423][\u0432\u0412][\u0430\u0410][jJ\u0458\u0408] { updateValues(); return KW_POVTORUVAJ; }
[\u0434\u0414][\u043E\u041E] { updateValues(); return KW_DO; }
[\u043F\u041F][\u0430\u0410][\u0442\u0422][\u0438\u0418] { updateValues(); return KW_PATI; }

[\u043F\u041F][\u0440\u0420][\u043E\u041E][\u043C\u041C][\u0435\u0415][\u043D\u041D][\u043B\u041B][\u0438\u0418][\u0432\u0412][\u0430\u0410] { updateValues(); return KW_PROMENLIVA; }

= { updateValues(); return OP_ASSIGN; }
\+ { updateValues(); return OP_ADD; }
- { updateValues(); return OP_MINUS; }
\* { updateValues(); return OP_MULTIPLY; }
\/ { updateValues(); return OP_DIVIDE; }
== { updateValues(); return OP_EQUAL; }
\<\> { updateValues(); return OP_NOTEQUAL; }
\> { updateValues(); return OP_GREATER; }
\< { updateValues(); return OP_LESS; }
\>= { updateValues(); return OP_GREATEREQUAL; }
\<= { updateValues(); return OP_LESSEQUAL; }

[\u0438\u0418][\u0437\u0417][\u0441\u0421][jJ\u0458\u0408] { updateValues(); return NASOKA; }
("(-"{DIGIT}+")")|{DIGIT}+ { updateValues(); return BROJ; }
{SPECIAL} | {CHAR} ({SPECIAL}|{CHAR}|{DIGIT})* { updateValues(); return ID; }

\! { updateValues(); return EXCLAMATION; }
, { updateValues(); return COMMA; }
\( { updateValues(); return LPAREN; }
\) { updateValues(); return RPAREN; }
: { updateValues(); return COLON; }

{BLANK} {/*Ignore*/}
{DIGIT}({SPECIAL}|{CHAR}|{DIGIT})* { updateValues(); return ID_ERROR; }
. { updateValues(); return ERROR; }