package lexer;

public enum Token {
	KW_OKOLINA, /*околина*/
	KW_OKOLINA_DZID, /*ѕидови*/
	KW_POCHETOK, /*почеток*/
	KW_KRAJ, /*крај*/
	KW_OKOLINA_ZHETON, /*жетони*/
	KW_ROBOT, /*робот*/
	KW_PROCEDURA, /*процедура*/

	KW_BROJ, /*број*/
	KW_NASOKA, /*насока*/

	KW_ODI, /*оди*/
	KW_LEVO, /*свртилево*/
	KW_DESNO, /*свртидесно*/
	KW_ZEMI, /*земи*/
	KW_OSTAVI, /*остави*/

	KW_AKO, /*ако*/
	KW_ZHETON, /*жетон*/
	KW_DZID, /*ѕид*/

	KW_POVTORUVAJ, /*повторувај*/
	KW_DO, /*до*/
	KW_PATI, /*пати*/

	KW_PROMENLIVA, /*променлива*/

	OP_ASSIGN, /*=*/
	OP_ADD, /*+*/
	OP_MINUS, /*-*/
	OP_MULTIPLY, /***/
	OP_DIVIDE, /*/*/
	OP_EQUAL, /*==*/
	OP_NOTEQUAL, /*<>*/
	OP_GREATER, /*>*/
	OP_LESS, /*<*/
	OP_GREATEREQUAL, /*>=*/
	OP_LESSEQUAL, /*<=*/

	NASOKA, /*[И З С Ј]*/
	BROJ, /**/

	ID, /**/

	EXCLAMATION, /*!*/
	COMMA, /*,*/
	LPAREN, /*(*/
	RPAREN, /*)*/
	COLON, /*:*/
	ID_ERROR,
	ERROR
}
