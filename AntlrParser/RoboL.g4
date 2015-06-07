/**
 * Define a grammar called Hello
 */
grammar RoboL;

tokens {
KW_OKOLINA,
KW_OKOLINA_DZID,
KW_POCHETOK,
KW_KRAJ,
KW_OKOLINA_ZHETON,
KW_ROBOT,
KW_PROCEDURA,
KW_BROJ,
KW_NASOKA,
KW_ODI,
KW_LEVO,
KW_DESNO,
KW_ZEMI,
KW_OSTAVI,
KW_AKO,
KW_ZHETON,
KW_DZID,
KW_POVTORUVAJ,
KW_DO,
KW_PATI,
KW_PROMENLIVA,
OP_ASSIGN,
OP_ADD,
OP_MINUS,
OP_MULTIPLY,
OP_DIVIDE,
OP_EQUAL,
OP_NOTEQUAL,
OP_GREATER,
OP_LESS,
OP_GREATEREQUAL,
OP_LESSEQUAL,
NASOKA,
BROJ,
ID,
EXCLAMATION,
COMMA,
LPAREN,
RPAREN,
COLON,
ID_ERROR,
ERROR,
PRAVEC
}

//-----------------------start-----------------------------------
start: programa ;
programa : definiranje_okolina_block  (potprocedura_block)* glavna_procedura_block ;
definiranje_okolina_block : okolina_block (zidovi_block)? (zetoni_block)? nasoka_block ; 
//---------------------------------------------------------------

//---------------------okolina-----------------------------------
okolina_block: KW_OKOLINA LPAREN BROJ COMMA BROJ RPAREN ;
zidovi_block: KW_OKOLINA_DZID KW_POCHETOK (zid)* KW_KRAJ ;
zid: PRAVEC BROJ BROJ OP_MINUS BROJ ; 
zetoni_block: KW_OKOLINA_ZHETON KW_POCHETOK (zeton)* KW_KRAJ ;
zeton: LPAREN BROJ COMMA BROJ RPAREN ;  
nasoka_block: KW_ROBOT NASOKA LPAREN BROJ COMMA BROJ RPAREN ;
//---------------------------------------------------------------


// ---------------------potprocedura block-----------------------
potprocedura_block: KW_PROCEDURA ID LPAREN (argumenti)? RPAREN KW_POCHETOK (komanda_site)* KW_KRAJ ;
argumenti: argument (COMMA argument)* ;
argument: tip ID ;
tip: KW_NASOKA | KW_BROJ ;
// --------------------------------------------------------------


// ---------------------glavna procedura --------------------------------
glavna_procedura_block: KW_PROCEDURA LPAREN RPAREN KW_POCHETOK (komanda_site)* KW_KRAJ ;

broj_promenliva: BROJ | ID ;
nasoka_promenliva: NASOKA | ID ;

//izraz: term  ( (OP_ADD | OP_MINUS ) term)* ;
//term: factor ( (OP_MULTIPLY | OP_DIVIDE) factor)* ; 
//factor: (LPAREN izraz RPAREN) | broj_promenliva ;
izraz: broj_promenliva operator broj_promenliva ;

deklariranje_promenliva: KW_PROMENLIVA ID (COMMA ID)* ;
inicijaliziranje_promenliva: ID OP_ASSIGN broj_promenliva | ID OP_ASSIGN nasoka_promenliva ;
azururanje_promenliva: ID OP_ASSIGN izraz ; 


//uslov: LPAREN izraz komparator izraz RPAREN ; //| LPAREN nasoka_promenliva OP_EQUAL nasoka_promenliva RPAREN  ; // dali mozes da se sporeduev nasoke
uslov: LPAREN broj_promenliva komparator broj_promenliva RPAREN ;
komparator: OP_EQUAL | OP_NOTEQUAL | OP_LESS | OP_LESSEQUAL | OP_GREATER | OP_GREATEREQUAL ;
operator: OP_ADD | OP_MINUS | OP_MULTIPLY | OP_DIVIDE ;
 
komanda: komanda_kontrola | komanda_povtoruvaj | povik_procedura | KW_ODI | KW_LEVO | KW_DESNO | KW_ZEMI | KW_OSTAVI;
komanda_site: komanda | deklariranje_promenliva | inicijaliziranje_promenliva | azururanje_promenliva;
komanda_vgnezdena: komanda |  inicijaliziranje_promenliva | azururanje_promenliva;

komanda_kontrola: ako_zeton_block | ako_zid_block | ako_nasoka_block | ako_uslov_block ;
ako_zeton_block: KW_AKO KW_ZHETON EXCLAMATION (komanda_vgnezdena)* EXCLAMATION ;
ako_zid_block: KW_AKO KW_DZID EXCLAMATION (komanda_vgnezdena)* EXCLAMATION ;
ako_nasoka_block: KW_AKO nasoka_promenliva EXCLAMATION (komanda_vgnezdena)* EXCLAMATION ;
ako_uslov_block: KW_AKO uslov EXCLAMATION (komanda_vgnezdena)* EXCLAMATION ;

komanda_povtoruvaj: povtoruvaj_broj_pati_block | povtoruvaj_do_zeton_block | povtoruvaj_do_zid_block |
povtoruvaj_do_nasoka_block | povtoruvaj_do_uslov_block ;
povtoruvaj_broj_pati_block: KW_POVTORUVAJ broj_promenliva KW_PATI COLON EXCLAMATION (komanda_vgnezdena)* EXCLAMATION ;
povtoruvaj_do_zeton_block: KW_POVTORUVAJ KW_DO KW_ZHETON COLON EXCLAMATION (komanda_vgnezdena)* EXCLAMATION ;
povtoruvaj_do_zid_block: KW_POVTORUVAJ KW_DO KW_DZID COLON EXCLAMATION (komanda_vgnezdena)* EXCLAMATION ;
povtoruvaj_do_nasoka_block: KW_POVTORUVAJ KW_DO nasoka_promenliva COLON EXCLAMATION (komanda_vgnezdena)* EXCLAMATION ;
povtoruvaj_do_uslov_block: KW_POVTORUVAJ KW_DO uslov COLON EXCLAMATION (komanda_vgnezdena)* EXCLAMATION ;

povik_procedura: ID LPAREN (parametri)? RPAREN ;
parametri: parametar (COMMA parametar)* ;
//parametar: izraz | nasoka_promenliva ;
parametar: nasoka_promenliva | nasoka_promenliva ;
// --------------------------------------------------------------------


// 1.
// povtoruvaj do NASOKA da se razgleda
// ako NASOKA da se razglrda
// dali se misli na nasoka na robot ili na nekoja promenliva nasoka
// 2.
// ako uslov
// dali uslov moze da bide (nasoka1 == nasoka2)

//WS : [ \t\r\n]+ -> skip ;
