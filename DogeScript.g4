grammar DogeScript;

/* CFG */
//start with main
start : source_code EOF;

source_code : function_block main_function function_block;
//source_code :function_block main_function;    

main_function : {System.out.println("in main_function");} 
			   FuncStarter VoidKeyword MainKeyword OpenParenthesis CloseParenthesis OpenBrace codeblock CloseBrace
    		   ;

function_block : {System.out.println("in function_block");}
				 function_declaration function_block
			  	 | // epsilon
			 	 ;

codeblock : {System.out.println("in code_block");}
			all_possible_statements codeblock
          | all_possible_statements
          ;
      
// all possible code blocks
all_possible_statements : {System.out.println("in all_possible");}
			   variable_declaration Terminator  
             | assignment_statement Terminator
             | function_call Terminator
             | conditional_statement 
             | loop_statement
             | print_statement Terminator
             | scan_statement Terminator
             | Terminator
             ;
             
//single all possible 
all_possible_single_statements :{System.out.println("in single_all_possible");} 
			   variable_declaration Terminator
             | assignment_statement Terminator
             | function_call Terminator
             | conditional_statement
             | loop_statement
             | Terminator
             ;
  
// used mainly for counter controlled loops
afterthought_statement : {System.out.println("in afterthought_statement");}
						  assignment_statement
                        | function_call
                        ;
  
// TODO: function_declaration
function_declaration : {System.out.println("in function_declaration");}
						FuncStarter datatype VarIdentifier OpenParenthesis function_declaration_paramaters CloseParenthesis 
                       OpenBrace codeblock return_statement CloseBrace
                       ;
  
function_declaration_paramaters : {System.out.println("in function_declaration_paramaters");}
						   datatype VarIdentifier
                         | datatype VarIdentifier Comma function_declaration_paramaters
                         ;
                        
return_statement : ReturnKeyword returns_value Terminator;

print_statement : PrintStarter all_possible_print ;

all_possible_print : literal
				   | VarIdentifier
				   | function_call
				   | expression
				   ;
				   
scan_statement : ScanStarter datatype VarIdentifier;
  
// TODO: a function with a void return type
  

variable_declaration : {System.out.println("in variable_declaration");}
					   VarDecStarter datatype variable_instance 				# vardec
                     | VarDecStarter datatype VarIdentifier AssOp returns_value	# vardec2
                     | VarDecStarter datatype_array VarIdentifier AssOp returns_value #vardec3
                     ;
 
//CONSTANT_DECLARATION : ConDecStarter ConstantVarIdentifier AssignOp literal
//                     ;
  
// TODO: literal
literal : {System.out.println("in literal");}
		  IntLit
        | FloatLit
        | StringLit
        | CharLit
        | BoolLit
        ;
        
array_literal : {System.out.println("in array literal");}
			  Comma literal array_literal
			  | //epsilon
			  ;        
datatype : {System.out.println("in datatype");}
		   IntDataType
         | CharDataType
         | BoolDataType
         | StringDataType
         ;
         
datatype_array : {System.out.println("in datatype array");}
			     datatype Array
         	   ;
         
// VarIdentifier : ([a-zA-Z][a-zA-Z0-9]*); 

variable_instance : {System.out.println("in variable_instance");}
					VarIdentifier Comma variable_instance
				  | VarIdentifier
                  ; 
 

// TODO: returns_value  
returns_value : {System.out.println("in returns_value");}
				literal
			  | OpenBrace literal array_literal CloseBrace	
			  | VarIdentifier
              | expression
              | function_call
              | NullKeyword
              ;
  
// TODO: expression
expression : //return result
    low_prior
    {System.out.println("in expression");}
    ;

low_prior :
    high_prior op= (AddOp | SubOp) 	high_prior	#lpExpr
   	| high_prior  		#low_prior2
    ;

high_prior :
    signint (MulOp | DivOp | ModOp) signint #hpExpr
    | signint #high_prior2
    ;
    
signint :
    '-' top_prior #negSignInt
    //{System.out.println("signed(-): " + $res);}
    //| '+' temp = topPrior {$res = $temp.res;}
    //{System.out.println("signed(+): " + $res);}
    | top_prior #posSignInt
    //{System.out.println("unsigned: " + $res);}
    ;
    
top_prior:
    IntLit #tpIntLit
    //{System.out.println("returned from bottom: " + $res);}
    | OpenParenthesis expression CloseParenthesis #tpParenthesis
    | VarIdentifier #tpVarIdentifier
    ;
  
  
assignment_statement : {System.out.println("in assignment_statement");}  
                     | VarIdentifier AssOp returns_value 
//                     | VarIdentifier IncrementOp Terminator
					 | VarIdentifier IncrementOp // this is actually the correct one, but wrong for non-for loops
                     | VarIdentifier DecrementOp 
                     ;

conditional_statement : {System.out.println("in conditional_statement");}
						start_condition
                      | start_condition end_condition
                      | start_condition continue_condition 
                      | start_condition continue_condition end_condition
                     ;
  
  //TODO: single_all_possible
  
start_condition : {System.out.println("in start_condition");}
					IfKeyword OpenParenthesis condition CloseParenthesis all_possible_single_statements
                | IfKeyword OpenParenthesis condition CloseParenthesis OpenBrace all_possible_single_statements CloseBrace
               | IfKeyword OpenParenthesis condition CloseParenthesis OpenBrace codeblock CloseBrace
                ;
                
// to be changed - no need for condition on else statement
end_condition : {System.out.println("in end_condition");}
				ElseKeyword OpenParenthesis condition CloseParenthesis all_possible_single_statements
              | ElseKeyword OpenParenthesis condition CloseParenthesis OpenBrace all_possible_single_statements CloseBrace
              | ElseKeyword OpenParenthesis condition CloseParenthesis OpenBrace codeblock CloseBrace
              | ElseKeyword all_possible_single_statements
              ;

continue_condition : {System.out.println("in continue_condition");}
					ElseIfKeyword OpenParenthesis condition CloseParenthesis all_possible_single_statements
                   | ElseIfKeyword OpenParenthesis condition CloseParenthesis all_possible_single_statements CloseBrace
                   | ElseIfKeyword OpenParenthesis condition CloseParenthesis OpenBrace codeblock CloseBrace
                   ;

// TODO LOOPS BAYBH
// loop_statement
loop_statement :
    {System.out.println("in LOOPS");} 
				event_loop_statement
               | count_loop_statement
               | repeatuntil_loop_statement
               ;

event_loop_statement : {System.out.println("in event_loop_statement");}
						EventLoopKeyword OpenParenthesis condition CloseParenthesis OpenBrace codeblock CloseBrace
					 | EventLoopKeyword OpenParenthesis condition CloseParenthesis all_possible_single_statements
                     ;

count_loop_statement : {System.out.println("in count_loop_statement");}
						CountLoopKeyword OpenParenthesis variable_declaration Terminator condition Terminator afterthought_statement  CloseParenthesis OpenBrace codeblock CloseBrace
                     | CountLoopKeyword OpenParenthesis assignment_statement Terminator condition Terminator afterthought_statement  CloseParenthesis OpenBrace codeblock CloseBrace
//CountLoopKeyword OpenParenthesis variable_declaration condition Terminator afterthought_statement  CloseParenthesis OpenBrace codeblock CloseBrace
                     ;

repeatuntil_loop_statement : {System.out.println("in repeatuntil_loop_statement");}
							RepeatUntilLoopKeyword OpenBrace codeblock CloseBrace EventLoopKeyword OpenParenthesis condition CloseParenthesis Terminator
                           ;

condition  : conditionV
           | conditionE
           | conditionF
           | conditionB
           | OpenParenthesis condition CloseParenthesis
           | conditionV logical_operator condition
           | conditionE logical_operator condition
           | conditionF logical_operator condition
           | conditionB logical_operator condition
           ;
        
        
conditionB : BoolLit comparison_bool_lit function_call
		   | BoolLit
		   ;

conditionV : VarIdentifier comparison VarIdentifier 
           | VarIdentifier comparison expression 
           | VarIdentifier comparison function_call
           | VarIdentifier
           ;
conditionE : expression comparison VarIdentifier
           | expression comparison expression
           | expression comparison function_call 
           ;
conditionF : function_call comparison function_call
		   | function_call comparison VarIdentifier
		   | function_call comparison expression
		   | function_call comparison BoolLit
           | function_call 
           ;

comparison_bool_lit : {System.out.println("in comparison bool lit");}
				   EquaOp
		           | NotEqualToOp
		           ;

comparison : {System.out.println("in comparison");}
			EquaOp
           | GreaterThanOp
           | LessThanOp
           | GreaterThanEqualTo
           | LessThanEqualTo
           | NotEqualToOp
           ;

logical_operator : {System.out.println("in logical_operator");}
					AndOp
                 | OrOp
                 ;
 

 
  
function_call : {System.out.println("in function_call");}
				VarIdentifier OpenParenthesis function_call_parameters CloseParenthesis  ;
  
//TODO function_call_parameters
function_call_parameters : {System.out.println("in function_call_parameters");}
							returns_value
                         | returns_value Comma function_call_parameters
                         ;

 /* Lexical Specs */
//white space
WS: [ |\t |\r |\n]+ -> skip;
CommentBlock : 'very cmt'[ A-Za-z0-9]*'very cmt' -> skip;

//WS: [ \n\t\r]+ -> channel(HIDDEN);

// Datatypes
IntDataType : 'int' ;
CharDataType : 'char' ;
BoolDataType : 'boolean' ;
StringDataType : 'string' ;


// Delimiters so fancy
Terminator : {System.out.println("in terminator");} 
			'wow' ;
VarDecStarter : 'such' ;
FuncStarter : 'much' ;
ConstantStarter : 'very' ;

AssOp : 'as' ;

PrintStarter : 'print' ;
ScanStarter  : 'scan'  ;

IfKeyword : 'rily' ;
ElseKeyword : 'but' ;
ElseIfKeyword : 'but rily' ;

// TODO loops
EventLoopKeyword : 'so' ;
CountLoopKeyword : 'many' ;
RepeatUntilLoopKeyword : 'nice' ;

//extra
VoidKeyword : 'void' ; 
MainKeyword : 'dogeIntensifies' ;
Comma : ',' ;
NullKeyword: 'null' ;
ReturnKeyword : 'bow' ;

//boolean priority
BoolLit : 'yiz' 
        | 'nawp' ;

//operators
AddOp : '+' ;
SubOp : '-' ;
MulOp : '*' ;
DivOp : '/' ;
ModOp : '%' ;

// Conditions
EquaOp : 'is' ;
GreaterThanOp : '>' ;
LessThanOp : '<' ;
GreaterThanEqualTo : '>=' ;
LessThanEqualTo : '<=' ;
NotEqualToOp : '!=' ;
AndOp : 'and' ;
OrOp : 'or' ;



// Increment
IncrementOp : '++' ;
DecrementOp : '--' ;

// Grouping symbols
OpenBrace : '{' ;
CloseBrace : '}' ;
OpenParenthesis : '(' ;
CloseParenthesis : ')' ;



// Literals
IntLit : [0-9]+ ;
FloatLit : ['-'|'+']?[0-9]*['\.'][0-9]+(['e']?[0-9]+)? ;
StringLit : '"'[A-Za-z0-9]*'"' ;
CharLit : '\''[A-Za-z0-9]'\'' ;

// Naming rules
Array : '['[0-9]+']' ; // sketchy
//ConstantVarIdentfier : [A-Z0-9]+ ;
VarIdentifier : [a-zA-Z][a-zA-Z0-9]*;
//FuncIdentifier : [a-zA-Z][a-zA-Z0-9]* ;


//end of file
EndOfFile: '$' ; 
 