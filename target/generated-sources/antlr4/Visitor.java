import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;





public class Visitor extends DogeScriptBaseVisitor<Value>{

	Map<Variable,Value> symbolTable;
	
	public Visitor(){
		symbolTable = new LinkedHashMap<Variable,Value>();
	}
	
	
	@Override
	public Value visitConditionB(DogeScriptParser.ConditionBContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConditionB(ctx);
	}

	@Override
	public Value visitFunction_block(DogeScriptParser.Function_blockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_block(ctx);
	}

	@Override
	public Value visitFunction_call(DogeScriptParser.Function_callContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_call(ctx);
	}

	@Override
	public Value visitContinue_condition(DogeScriptParser.Continue_conditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitContinue_condition(ctx);
	}

	
	
	@Override
	public Value visitConstant_declaration(DogeScriptParser.Constant_declarationContext ctx) {
		// TODO Auto-generated method stub
		//add constant to table
		Variable v = new Variable (ctx.datatype().getText(),ctx.VarIdentifier().getText());
		if(CheckST(v, ctx.literal().getText()))
		{
			System.out.println("Error: " + v.getIdentifier() + " has been declared already" );
		}
		else addtoST(v, ctx.literal().getText());
		
		return super.visitConstant_declaration(ctx);
	}


	@Override
	public Value visitReturns_array_value(DogeScriptParser.Returns_array_valueContext ctx) {
		// TODO Auto-generated method stub
		Value v = new Value(ctx.getText());
		return v;
	}


	@Override
	public Value visitVardec2(DogeScriptParser.Vardec2Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("in var dec 2");
		String d = ctx.datatype().getText();
		Value val = this.visit(ctx.returns_value());
		String rv = val.asString();
		String ide = ctx.VarIdentifier().getText();
		if(d.equalsIgnoreCase("int"))
		{
			if(rv.matches("([0-9]+|null)"))
			{
				//check symbol table if declared already
				Variable v = new Variable(d,ide); 
				if(CheckST(v,rv))
					System.out.println("Error: " + ide + " has been declared already");
				//add to symbol table
				else symbolTable.put(v, new Value (rv));
			}
				
			else System.out.println("Error: " +rv + " is not of int datatype");
		}
		else if(d.equalsIgnoreCase("char"))
		{
			if(rv.matches("('[A-Za-z0-9]'|null)"))
			{
				//check symbol table if declared already
				Variable v = new Variable(d,ide); 
				if(CheckST(v,rv))
					System.out.println("Error: " +ide + " has been declared already");
				//add to symbol table
				else symbolTable.put(v, new Value (rv));
			}
				
			else System.out.println("Error: " +rv + " is not of char datatype");
		}
		else if(d.equalsIgnoreCase("string"))
		{
			if(rv.matches("(\"[A-Za-z0-9]*\"|null)"))
			{
				//check symbol table if declared already
				Variable v = new Variable(d,ide); 
				if(CheckST(v,rv))
					System.out.println("Error: " +ide + " has been declared already");
				//add to symbol table
				else symbolTable.put(v, new Value (rv));
			}
				
			else System.out.println("Error: " +rv + " is not of string datatype");
		}
		else if(d.equalsIgnoreCase("boolean"))
		{
			if(rv.matches("yiz|nawp|null"))
			{
				//check symbol table if declared already
				Variable v = new Variable(d,ide); 
				if(CheckST(v,rv))
					System.out.println("Error: " +ide + " has been declared already");
				//add to symbol table
				else symbolTable.put(v, new Value (rv));
			}
				
			else System.out.println("Error: " +rv + " is not of boolean datatype");
		}
		//for arrays go to vardec3
		return super.visitVardec2(ctx);
	}
	
	@Override
	public Value visitVardec3(DogeScriptParser.Vardec3Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("in var dec 3");
		String d = ctx.datatype_array().datatype().getText();
		String arrlength = ctx.datatype_array().Array().getText();
		Value val = this.visit(ctx.returns_array_value());
		String rv = val.asString();
		String ide = ctx.VarIdentifier().getText();
		System.out.println("Array name: "+ide);
		
		
		if(d.equalsIgnoreCase("int"))
		{
			rv = rv.replace("{", "");
			rv = rv.replace("}", "");
			if(rv.matches("(,?[0-9]+)+"))
			{
				String temp[] = rv.split(",");
				arrlength = arrlength.replace("[","");
				int arrsize = Integer.valueOf(arrlength.replace("]","")) ; 
				System.out.println("Array size: "+arrsize);
				if(temp.length == arrsize)
				{
					//check symbol table if declared already
					Variable v = new Variable(d,ide); 
					if(CheckST(v,rv))
					System.out.println("Error: " +ide + " has been declared already");
					//add to symbol table
					else symbolTable.put(v, new Value (rv));
				}
				else System.out.println("Error: " +ide + " array length does not match its elements");
			}
				
			else System.out.println("Error: " +rv + " is not of int array datatype");
		}
		else if(d.equalsIgnoreCase("char"))
		{
			rv = rv.replace("{", "");
			rv = rv.replace("}", "");
			if(rv.matches("(,?'[A-Za-z0-9]')+"))
			{
				String temp[] = rv.split(",");
				arrlength = arrlength.replace("[","");
				int arrsize = Integer.valueOf(arrlength.replace("]","")) ; 
				System.out.println(arrsize);
				if(temp.length == arrsize)
				{
					//check symbol table if declared already
					Variable v = new Variable(d,ide); 
					if(CheckST(v,rv))
					System.out.println("Error: " + ide + " has been declared already");
					//add to symbol table
					else symbolTable.put(v, new Value (rv));
				}
				else System.out.println("Error: " +ide + " array length does not match its elements");
			}
				
			else System.out.println("Error: " +rv + " is not of char array datatype");
		}
		else if(d.equalsIgnoreCase("string"))
		{
			rv = rv.replace("{", "");
			rv = rv.replace("}", "");
			if(rv.matches("(,?\"[A-Za-z0-9]*\")+"))
			{
				String temp[] = rv.split(",");
				arrlength = arrlength.replace("[","");
				int arrsize = Integer.valueOf(arrlength.replace("]","")) ; 
				System.out.println(arrsize);
				if(temp.length == arrsize)
				{
					//check symbol table if declared already
					Variable v = new Variable(d,ide); 
					if(CheckST(v,rv))
					System.out.println("Error: " +ide + " has been declared already");
					//add to symbol table
					else symbolTable.put(v, new Value (rv));
				}
				else System.out.println("Error: " + ide + " array length does not match its elements");
			}
				
			else System.out.println("Error: " + rv + " is not of string array datatype");
		}
		else if(d.equalsIgnoreCase("boolean"))
		{
			rv = rv.replace("{", "");
			rv = rv.replace("}", "");
			if(rv.matches("(,?(yiz|nawp))+"))
			{
				String temp[] = rv.split(",");
				arrlength = arrlength.replace("[","");
				int arrsize = Integer.valueOf(arrlength.replace("]","")) ; 
				System.out.println(arrsize);
				if(temp.length == arrsize)
				{
					//check symbol table if declared already
					Variable v = new Variable(d,ide); 
					if(CheckST(v,rv))
					System.out.println("Error: " + ide + " has been declared already");
					//add to symbol table
					else symbolTable.put(v, new Value (rv));
				}
				else System.out.println("Error: " + ide + " array length does not match its elements");
			}
				
			else System.out.println("Error: " + rv + " is not of boolean array datatype");
		}
		
		return super.visitVardec3(ctx);
	}


	@Override
	public Value visitDatatype_array(DogeScriptParser.Datatype_arrayContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDatatype_array(ctx);
	}


	@Override
	public Value visitArray_literal(DogeScriptParser.Array_literalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArray_literal(ctx);
	}


	@Override
	public Value visitConditionE(DogeScriptParser.ConditionEContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConditionE(ctx);
	}

	@Override
	public Value visitLiteral(DogeScriptParser.LiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLiteral(ctx);
	}

	@Override
	public Value visitConditionF(DogeScriptParser.ConditionFContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConditionF(ctx);
	}

	@Override
	public Value visitComparison_bool_lit(DogeScriptParser.Comparison_bool_litContext ctx) {
		// TODO Auto-generated method stub
		return super.visitComparison_bool_lit(ctx);
	}

	@Override
	public Value visitVardec(DogeScriptParser.VardecContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("in var dec");
		
		//String d
		System.out.println(ctx.datatype().getText());
		return super.visitVardec(ctx);
	}

	@Override
	public Value visitFunction_call_parameters(DogeScriptParser.Function_call_parametersContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_call_parameters(ctx);
	}

	@Override
	public Value visitDatatype(DogeScriptParser.DatatypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDatatype(ctx);
	}

	@Override
	public Value visitCount_loop_statement(DogeScriptParser.Count_loop_statementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCount_loop_statement(ctx);
	}

	@Override
	public Value visitLogical_operator(DogeScriptParser.Logical_operatorContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLogical_operator(ctx);
	}

	@Override
	public Value visitRepeatuntil_loop_statement(DogeScriptParser.Repeatuntil_loop_statementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRepeatuntil_loop_statement(ctx);
	}


	@Override
	public Value visitFunction_declaration(DogeScriptParser.Function_declarationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_declaration(ctx);
	}

	@Override
	public Value visitReturn_statement(DogeScriptParser.Return_statementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReturn_statement(ctx);
	}

	@Override
	public Value visitConditionV(DogeScriptParser.ConditionVContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConditionV(ctx);
	}
	
	

	@Override
	public Value visitReturnLit(DogeScriptParser.ReturnLitContext ctx) {
		// TODO Auto-generated method stub
		Value v = new Value (ctx.literal().getText());
		return v;
	}


	@Override
	public Value visitReturnVar(DogeScriptParser.ReturnVarContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReturnVar(ctx);
	}

	@Override
	public Value visitReturnFuncCall(DogeScriptParser.ReturnFuncCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReturnFuncCall(ctx);
	}


	@Override
	public Value visitReturnNull(DogeScriptParser.ReturnNullContext ctx) {
		// TODO Auto-generated method stub
		Value v = new Value("null");
		return v;
	}


	@Override
	public Value visitReturnExpr(DogeScriptParser.ReturnExprContext ctx) {
		// TODO Auto-generated method stub
		Value v = this.visit(ctx.expression());
		System.out.println("Returned: " + v);
		
		return v;
	}


	@Override
	public Value visitExpression(DogeScriptParser.ExpressionContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("expression");
		Value v = this.visit(ctx.low_prior());
		System.out.println("Value: "+v);
		return v;
	}
	
	@Override
	public Value visitLpExpr(DogeScriptParser.LpExprContext ctx) {
		// TODO Auto-generated method stub
		Value left = this.visit(ctx.high_prior());
		Value right = this.visit(ctx.low_prior());
		if(ctx.AddOp() != null)
			return new Value ((left.asInteger() + right.asInteger()));
		else if(ctx.SubOp() != null)
			return new Value ((left.asInteger() - right.asInteger()));
		return null;
	}

	@Override
	public Value visitLow_prior2(DogeScriptParser.Low_prior2Context ctx) {
		// TODO Auto-generated method stub
		Value v = this.visit(ctx.high_prior());
		return v;
	}
	
	@Override
	public Value visitHpExpr(DogeScriptParser.HpExprContext ctx) {
		// TODO Auto-generated method stub
		Value left = this.visit(ctx.signint());
		Value right = this.visit(ctx.high_prior());
		if(ctx.MulOp() != null)
			return new Value ((left.asInteger()*right.asInteger()));
		else if(ctx.DivOp() != null)
			return new Value ((left.asInteger()/right.asInteger()));
		else if(ctx.ModOp() != null)
			return new Value ((left.asInteger()%right.asInteger()));
		return null;
	}


	@Override
	public Value visitHigh_prior2(DogeScriptParser.High_prior2Context ctx) {
		// TODO Auto-generated method stub
		return new Value (Integer.valueOf(ctx.getText()));
	}

@Override
	public Value visitNegSignInt(DogeScriptParser.NegSignIntContext ctx) {
		// TODO Auto-generated method stub
		System.out.println(" neg sign int");
		return new Value (Integer.valueOf(ctx.getText())*-1);
	}
	@Override
	public Value visitPosSignInt(DogeScriptParser.PosSignIntContext ctx) {
		// TODO Auto-generated method stub
		System.out.println(" pos sign int");
		return new Value (Integer.valueOf(ctx.getText()));
	}


	@Override
	public Value visitTpIntLit(DogeScriptParser.TpIntLitContext ctx) {
		// TODO Auto-generated method stub
		return  new Value (Integer.valueOf(ctx.getText()));
				
	}

	@Override
	public Value visitTpParenthesis(DogeScriptParser.TpParenthesisContext ctx) {
		// TODO Auto-generated method stub
		Value v = this.visit(ctx.expression());
		return v;
	}


	@Override
	public Value visitTpVarIdentifier(DogeScriptParser.TpVarIdentifierContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTpVarIdentifier(ctx);
	}




	@Override
	public Value visitComparison(DogeScriptParser.ComparisonContext ctx) {
		// TODO Auto-generated method stub
		return super.visitComparison(ctx);
	}



	@Override
	public Value visitStart(DogeScriptParser.StartContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStart(ctx);
	}

	@Override
	public Value visitAll_possible_statements(DogeScriptParser.All_possible_statementsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAll_possible_statements(ctx);
	}

	@Override
	public Value visitFunction_declaration_paramaters(DogeScriptParser.Function_declaration_paramatersContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_declaration_paramaters(ctx);
	}


	@Override
	public Value visitAssignDec(DogeScriptParser.AssignDecContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignDec(ctx);
	}


	@Override
	public Value visitAssignVar(DogeScriptParser.AssignVarContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignVar(ctx);
	}


	@Override
	public Value visitAssignInc(DogeScriptParser.AssignIncContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignInc(ctx);
	}


	@Override
	public Value visitCondition(DogeScriptParser.ConditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCondition(ctx);
	}

	@Override
	public Value visitAll_possible_single_statements(DogeScriptParser.All_possible_single_statementsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAll_possible_single_statements(ctx);
	}

	@Override
	public Value visitConditional_statement(DogeScriptParser.Conditional_statementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConditional_statement(ctx);
	}

	@Override
	public Value visitAfterthought_statement(DogeScriptParser.Afterthought_statementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAfterthought_statement(ctx);
	}

	@Override
	public Value visitMain_function(DogeScriptParser.Main_functionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMain_function(ctx);
	}

	@Override
	public Value visitEvent_loop_statement(DogeScriptParser.Event_loop_statementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitEvent_loop_statement(ctx);
	}

	@Override
	public Value visitCodeblock(DogeScriptParser.CodeblockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCodeblock(ctx);
	}

	@Override
	public Value visitLoop_statement(DogeScriptParser.Loop_statementContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("loop statement");
		return super.visitLoop_statement(ctx);
	}

    @Override
public Value visitPrintExpr(DogeScriptParser.PrintExprContext ctx) {
    //NOT DONE?
  System.out.println(ctx.expression().getText());
  return super.visitPrintExpr(ctx);
}


@Override
public Value visitPrint_statement(DogeScriptParser.Print_statementContext ctx) {
  // TODO Auto-generated method stub
  return super.visitPrint_statement(ctx);
}


@Override
public Value visitPrintVar(DogeScriptParser.PrintVarContext ctx) {
  //System.out.println(ctx.VarIdentifier().getText());
  System.out.println("printing " +  ctx.VarIdentifier().getText() + ":" + getValue(ctx.VarIdentifier().getText()).asString());
  return super.visitPrintVar(ctx);
}


@Override
public Value visitPrintLit(DogeScriptParser.PrintLitContext ctx) {
  System.out.println("in print Lit");
  
  if(ctx.literal().StringLit()!=null)
  {
    System.out.println(ctx.literal().StringLit().getText().replace("\"", ""));
  }
  else if(ctx.literal().IntLit()!=null)
  {
    System.out.println(ctx.literal().IntLit().getText());
  }
  else if(ctx.literal().FloatLit()!=null)
  {
    System.out.println(ctx.literal().FloatLit().getText());
  }
  else if(ctx.literal().CharLit() !=null)
  {
    System.out.println(ctx.literal().CharLit().getText().replace("'", ""));
  }
  else if(ctx.literal().BoolLit() !=null)
  {
    System.out.println(ctx.literal().BoolLit().getText());
  }
  return null;
}


@Override
public Value visitPrintFunction(DogeScriptParser.PrintFunctionContext ctx) {
  // TODO Auto-generated method stub
  return super.visitPrintFunction(ctx);
}

	@Override
	public Value visitSource_code(DogeScriptParser.Source_codeContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\n\nsource code");
		return super.visitSource_code(ctx);
	}
	
	public boolean CheckST(Variable v, String value)
	{
		for (Variable key : symbolTable.keySet()) {
		    if(key.getIdentifier().equals(v.getIdentifier()))
		    	return true;
		}
		return false;
	}
	
	  public Value getValue(String varname){
		   for (Variable key : symbolTable.keySet()) {
		       if(key.getIdentifier().equals(varname))
		         return symbolTable.get(key);
		   }
		   return null;
	}
	  
   public void addtoST(Variable v, Object val)
   {
	  symbolTable.put(v, new Value(val));
   }
   
   
	public void PrintST(){
		
		System.out.println("Symbol Table: ");
		for (Variable key : symbolTable.keySet()) {
		    System.out.println(key + " -- " + symbolTable.get(key));
		}
	}
	
	

}
