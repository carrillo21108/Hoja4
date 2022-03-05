/**
 * 
 */
package uvg.edu.common;
import uvg.edu.structures.Stack;
import uvg.edu.structures.StackUsingArrayList;
import uvg.edu.structures.StackUsingDoubleLinkedList;
import uvg.edu.structures.StackUsingSingleLinkedList;
import uvg.edu.structures.StackUsingVector;

/**
 * @author Brian Carrillo
 *
 */
public class StackInstanceCreator {
	
	public ListInstanceCreator listFactory = new ListInstanceCreator();
	
	public Stack getInstance(String typeStack) {
		Stack myStack;
		
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
