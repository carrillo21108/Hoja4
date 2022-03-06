/**
 * 
 */
package uvg.edu.structures;

import uvg.edu.common.IStack;

/**
 * @author Brian Carrillo
 *
 */
public class StackUsingSingleLinkedList<T> extends Stack<T> {

	private SingleLinkedList<T> listaInterna;
	
	/**
     * Constructor
     * 
     */
	public StackUsingSingleLinkedList()
	{
		listaInterna = new SingleLinkedList<T>();
	}
	
	/**
     * Metodo count
     * 
     * @see SingleLinkedList#Count()
     * 
     */
	@Override
	public int count() {
		return listaInterna.Count();
	}

	/**
     * Metodo IsEmpty
     * 
     * @see SingleLinkedList#IsEmpty()
     * 
     */
	@Override
	public boolean isEmpty() {
		return listaInterna.IsEmpty();
	}

	/**
     * Metodo push
     * 
     * @see SingleLinkedList#InsertAtStart(Object)
     * @param value (T)
     * 
     */
	@Override
	public void push(T value) {
		listaInterna.InsertAtStart(value);
	}

	/**
     * Metodo pull
     * 
     * @see SingleLinkedList#Delete(int)
     * 
     */
	@Override
	public T pull() {
		return listaInterna.Delete(0);
	}

	/**
     * Metodo peek
     * 
     * @see SingleLinkedList#Get(int)
     * 
     */
	@Override
	public T peek() {
		return listaInterna.Get(0);
	}

}
