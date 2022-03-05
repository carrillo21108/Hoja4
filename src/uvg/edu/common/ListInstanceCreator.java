/**
 * 
 */
package uvg.edu.common;

import uvg.edu.structures.Stack;
import uvg.edu.structures.StackUsingDoubleLinkedList;
import uvg.edu.structures.StackUsingSingleLinkedList;

/**
 * @author Brian Carrillo
 *
 */
public class ListInstanceCreator {
	
	public Stack getInstace(String typeStack) {
		
		Stack myStack;
		
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
