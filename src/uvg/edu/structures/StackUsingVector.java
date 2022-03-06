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
	
	/**
     * Constructor
     * 
     */
	public StackUsingVector() {
		miListaInterna = new Vector<T>(); 
	}
	
	/**
     * Metodo count
     * 
     * @see Vector#size()
     * 
     */
	@Override
	public int count() {
		return miListaInterna.size();
	}

	/**
     * Metodo isEmpty
     * 
     * @see Vector#isEmpty()
     * 
     */
	@Override
	public boolean isEmpty() {
		return miListaInterna.isEmpty();
	}

	/**
     * Metodo push
     * 
     * @see Vector#add(Object)
     * @param value(T)
     * 
     */
	@Override
	public void push(T value) {
		miListaInterna.add(0, value);
	}

	/**
     * Metodo pull
     * 
     * @see Vector#remove(int)
     * 
     */
	@Override
	public T pull() {
		return miListaInterna.remove(0);
	}

	/**
     * Metodo peek
     * 
     * @see Vector#get(int)
     * 
     */
	@Override
	public T peek() {		
		return miListaInterna.get(0);
	}

}
