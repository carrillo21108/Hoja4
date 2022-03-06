/**
 * 
 */
package uvg.edu.common;

import uvg.edu.structures.Stack;

/**
 * @author Brian Carrillo
 *
 */
public class PosfixCalc implements IPosfixCalc {
	//Stack del sistema
	private Stack pila;
	private static PosfixCalc instance;
	
	/**
	 * Constructor sin parametros privado
	 */
	private PosfixCalc() {}
	
	//Patron singleton
	public synchronized static PosfixCalc getInstance() {
		if(instance==null) {
			instance = new PosfixCalc();
		}
		
		return instance;
	}
	
	@Override
	/**
	 * Evalua la expresion y retorna el resultado de la misma
	 * @param expresion: Expresion en notacion postfija (String)
	 * @see Character#isDigit(char)
	 * @see String#toCharArray()
	 * @see Stack#pull()
	 * @see Stack#push(Object)
	 * @see Character#getNumericValue(char)
	 * @see Stack#count()
	 * @see Character#isSpace(char)
	 * @see Stack#peek()
	 */
	public int Evaluate(String expresion, String typeStack){
		//Nueva instancia por cada expresion de linea en el archivo
		StackInstanceCreator stackFactory = new StackInstanceCreator();
		pila = stackFactory.getInstance(typeStack);
		
		//Ciclo for por cada caracter en la expresion
		for(char i: expresion.toCharArray()) {
			
			//En caso sea un digito
			if(Character.isDigit(i)) {
				
				//Push del valor numerico en la pila
				pila.push(Character.getNumericValue(i));
			
			//En caso sea un operador valido
			}else if(i=='+' || i=='-' || i=='*' || i=='/') {
				
				//Operacion valida solo si hay 2 operandos previos
				if(pila.count()>=2) {
					
					//Pull de los operandos
					int b = (int) pila.pull();
					int a = (int) pila.pull();
					
					//Validacion para division por cero
					if(i=='/' && b==0) {
						System.out.println("Expresion no valida. Division entre cero.");
						return 0;
					}
					
					//Push del resultado de la operacion en la pila
					pila.push(this.Operate(a, b, i));
					
				}else {
					//En caso la expresion posea insuficiente cantidad de operandos
					System.out.println("Expresion no valida. Insuficiente cantidad de operandos.");
					return 0;
				}
				
			}else if(!Character.isSpaceChar(i)){
				//En caso alguno de los caracteres no sea valido.
				System.out.println("Expresion no valida. Caracter no reconocible en la expresion.");
				return 0;
			}
		}
		
		//Validacion en caso la cantidad de operandos sea excesiva
		if(pila.count()>1) {
			System.out.println("Expresion no valida. Excesiva cantidad de operandos.");
			return 0;
		}
		
		//Retorno top de la pila
		return (int) pila.peek();
		
	}
	
	/**
	 * Realiza operaciones a partir de dos operandos enviados
	 * @param a: operando inicial (int)
	 * @param b: operando final (int)
	 * @param c: caracter de operador (char)
	 * @return int: resultado de la operacion
	 */
	private int Operate(int a, int b, char c) {
		int result=0;
		
		switch(c) {
			//Suma
			case '+':
				result = a+b;
				break;
			//Resta
			case '-':
				result = a-b;
				break;
			//Multiplicacion
			case '*':
				result = a*b;
				break;
			//Division
			case '/':
				result = a/b;
				break;
		}
		
		return result;
	}

}
