/**
 * 
 */
package uvg.edu.structures;

import java.util.ArrayList;

import uvg.edu.common.IStack;

/**
 * @author Brian Carrillo
 *
 */
public class StackUsingArrayList<T> extends Stack<T> {

	private ArrayList<T> miListaInterna;
	
	/**
     * Metodo Constructor
     * 
     */
	public StackUsingArrayList() {
		miListaInterna = new ArrayList<T>(); 
	}
	
	/**
     * Metodo count
     * 
     * @see ArrayList#size()
     * 
     */
	@Override
	public int count() {
		return miListaInterna.size();
	}

	/**
     * Metodo isEmpty
     * 
     * @see ArrayList#isEmpty()
     * 
     */
	@Override
	public boolean isEmpty() {
		return miListaInterna.isEmpty();
	}

	/**
     * Metodo push
     * 
     * @see ArrayList#add(int, Object)
     * @param value (T)
     * 
     */
	@Override
	public void push(T value) {
		miListaInterna.add(0, value);
	}

	/**
     * Metodo pull
     * 
     * @see ArrayList#remove(int)
     * 
     */
	@Override
	public T pull() {
		return miListaInterna.remove(0);
	}

	/**
     * Metodo peek
     * 
     * @see ArrayList#get(int)
     * 
     */
	@Override
	public T peek() {		
		return miListaInterna.get(0);
	}
}
