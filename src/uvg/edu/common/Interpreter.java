/**
 * Clase Interpreter
 * @author Carlos Lopez
 * @version 1.0
 *
 * En esta clase se castean las operaciones en notacion
 * infija del archivo a postfija .txt. Implementa la interfaz IInterpreter.
 */

package uvg.edu.common;
import uvg.edu.structures.Stack;

public class Interpreter implements IInterpreter {
	
	private static Interpreter instance;
	
	/**
	 * Constructor sin parametros privado
	 */
	private Interpreter() {}
	
	/**
	 * Patron singleton
	 * @return Interpreter: instancia del interprete
	 */
	public synchronized static Interpreter getInstance() {
		if(instance==null) {
			instance = new Interpreter();
		}
		
		return instance;
	}

	@Override
	/**
	 * Evalua la expresion y retorna su equivalente postfijo
	 * @param expresion: Expresion en notacion infija (String)
	 * @param typeStack: Stack utilizado
	 * @see Stack#pull()
	 * @see Stack#push(Object)
	 * @see Stack#count()
	 * @see Stack#peek()
	 * @see Stack#isEmpty()
	 */
	public String Evaluate(String expresion, String typeStack) {
		
		//Patron Factory
		StackInstanceCreator stackFactory = new StackInstanceCreator();
		Stack stack = stackFactory.getInstance(typeStack);
		
		
		String result = new String("");
         
		//Algoritmo conservion de infija a postfija
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
            	return "Expresion invalida";
            }
            result += stack.pull();
         }
        return result;

	}
	
	/**
	 * Define los operadores considerados
	 * @param ch: char a evaluar
	 * @return int: numero de resultado segun operador identificado
	 */
	private int detOperation(char ch){

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
