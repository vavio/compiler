package mk.edu.finki.compiler.lexer;

public enum Token {
	KW_OKOLINA, /*околина*/
	KW_OKOLINA_DZID, /*ѕидови*/
	KW_POCHETOK, /*почеток*/
	KW_KRAJ, /*крај*/
	KW_OKOLINA_ZHETON, /*жетони*/
	KW_ROBOT, /*робот*/
	KW_PROCEDURA, /*процедура*/

	KW_BROJ, /*број*/
	KW_NASOKA, /*на�?ока*/

	KW_ODI, /*оди*/
	KW_LEVO, /*�?вртилево*/
	KW_DESNO, /*�?вртиде�?но*/
	KW_ZEMI, /*земи*/
	KW_OSTAVI, /*о�?тави*/

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
