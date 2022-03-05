/**
 * 
 */
package uvg.edu.common;
import uvg.edu.structures.Stack;

/**
 * @author Brian Carrillo
 *
 */
public class Interpreter implements IInterpreter {

	@Override
	public String Evaluate(String expresion, String typeStack) {
		
		StackInstanceCreator stackFactory = new StackInstanceCreator();
		Stack stack = stackFactory.getInstance(typeStack);
		
		
		String result = new String("");
         
        for (int i = 0; i<expresion.length(); ++i){
            char c = expresion.charAt(i);
             
            if (Character.isLetterOrDigit(c)) {            	
            	result += c;
            }else if (c == '(') {            	
            	stack.push(c);
            }else if (c == ')'){
                while (!stack.isEmpty() && (char) stack.peek() != '(')
                    result += stack.pull();
                 
                    stack.pull();
            }else{
                while (!stack.isEmpty() && detOperation(c) <= detOperation((char) stack.peek())){
                   
                    result += stack.pull();
             }
                stack.push(c);
            }
      
        }
      
        while (!stack.isEmpty()){
            if((char)stack.peek() == '(') {            	
            	return "Invalid Expression";
            }
            result += stack.pull();
         }
        return result;

	}
	
	private static int detOperation(char ch){

		switch (ch){
			case '+':
			case '-':
				return 1;
		      
			case '*':
			case '/':
				return 2;
		      
			case '^':
				return 3;
		}
		        return -1;
	
	}	    

}
