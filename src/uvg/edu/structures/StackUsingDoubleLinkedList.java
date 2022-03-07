/**
 * Clase StackUsingDoubleLinkedList
 * @author Brian Carrillo
 * @version 1.0
 *
 * Stack con implementacion de DoubleLinkedList
 */
package uvg.edu.structures;

import java.util.ArrayList;

import uvg.edu.common.IList;

public class StackUsingDoubleLinkedList<T> extends Stack<T> {

	private DoubleLinkedList<T> listaInterna;
	
	/**
     * Constructor
     * 
     */
	public StackUsingDoubleLinkedList() {
		listaInterna = new DoubleLinkedList<T>();
	}
	
	/**
     * Metodo count
     * 
     * @see DoubleLinkedList#Count()
     * 
     */
	@Override
	public int count() {
		return listaInterna.Count();
	}

	/**
     * Metodo isEmpty
     * 
     * @see DoubleLinkedList#IsEmpty()
     * 
     */
	@Override
	public boolean isEmpty() {
		return listaInterna.IsEmpty();
	}

	/**
     * Metodo push
     * 
     * @see DoubleLinkedList#InsertAtStart(Object)
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
     * @see DoubleLinkedList#DeleteAtStart()
     * 
     */
	@Override
	public T pull() {
		return listaInterna.DeleteAtStart();
	}

	/**
     * Metodo count
     * 
     * @see DoubleLinkedList#Get(int)
     * 
     */
	@Override
	public T peek() {
		return listaInterna.Get(0);
	}
	

}
