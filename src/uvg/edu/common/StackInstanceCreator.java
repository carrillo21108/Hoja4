/**
 * Clase StackInstanceCreator
 * @author Carlos Lopez
 * @version 1.0
 *
 * En esta clase se utiliza el patron Factory para las instancias
 * de los tipos de stacks.
 */

package uvg.edu.common;
import uvg.edu.structures.Stack;
import uvg.edu.structures.StackUsingArrayList;
import uvg.edu.structures.StackUsingDoubleLinkedList;
import uvg.edu.structures.StackUsingSingleLinkedList;
import uvg.edu.structures.StackUsingVector;

public class StackInstanceCreator {
	
	//Uso del factory de instancias de listas
	private ListInstanceCreator listFactory = new ListInstanceCreator();
	
	/**
	 * Retorna la instancia segun el tipo ingresado
	 * @param typeStack: Expresion del tipo de stack (String)
	 * @see StackUsingArrayList#StackUsingArrayList()
	 * @see StackUsingVector#StackUsingVector()
	 * @see ListInstanceCreator#getInstance()
	 * @return Stack: instancia de Stack
	 */
	public Stack getInstance(String typeStack) {
		Stack myStack;
		
		//Switch sobre tipos de stack
		switch(typeStack) {
		case "ArrayList":
			myStack = new StackUsingArrayList<Integer>();
			break;
		
		case "Vector":
			myStack = new StackUsingVector<Integer>();
			break;
		
		case "SingleLinkedList":
			myStack = listFactory.getInstace(typeStack);
			break;
			
		case "DoubleLinkedList":
			myStack = listFactory.getInstace(typeStack);
			break;
			
		default:
			myStack = null;
			break;
		}
		return myStack;
	}

}
