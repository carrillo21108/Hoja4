/**
 * Clase ListInstanceCreator
 * @author Carlos Lopez
 * @version 1.0
 *
 * En esta clase se utiliza el patron Factory para las instancias
 * de los tipos de listas.
 */
package uvg.edu.common;

import uvg.edu.structures.Stack;
import uvg.edu.structures.StackUsingDoubleLinkedList;
import uvg.edu.structures.StackUsingSingleLinkedList;

public class ListInstanceCreator {
	
	/**
	 * @param typeStack: Expresion del tipo de stack (String)
	 * @see StackUsingSingleLinkedList#StackUsingSingleLinkedList()
	 * @see StackUsingDoubleLinkedList#StackUsingDoubleLinkedList()
	 * @return Stack: instancia de Stack
	 */
	public Stack getInstace(String typeStack) {
		
		Stack myStack;
		
		//Switch de tipos de stack segun lista
		switch(typeStack) {
		
		case "SingleLinkedList":
			myStack = new StackUsingSingleLinkedList<Integer>();
			break;
			
		case "DoubleLinkedList":
			myStack = new StackUsingDoubleLinkedList<Integer>();
			break;
			
		default:
			myStack = null;
			break;
		}
		return myStack;
		
	}

}
