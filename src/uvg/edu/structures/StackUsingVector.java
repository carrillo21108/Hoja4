/**
 * 
 */
package uvg.edu.structures;

import java.util.Vector;

import uvg.edu.common.IStack;

/**
 * @author Brian Carrillo
 *
 */
public class StackUsingVector<T> extends Stack<T> {

	private Vector<T> miListaInterna;
	
	public StackUsingVector() {
		miListaInterna = new Vector<T>(); 
	}
	
	@Override
	public int count() {
		return miListaInterna.size();
	}

	@Override
	public boolean isEmpty() {
		return miListaInterna.isEmpty();
	}

	@Override
	public void push(T value) {
		miListaInterna.add(0, value);
	}

	@Override
	public T pull() {
		return miListaInterna.remove(0);
	}

	@Override
	public T peek() {		
		return miListaInterna.get(0);
	}

}
