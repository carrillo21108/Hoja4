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
	
	public StackUsingSingleLinkedList()
	{
		listaInterna = new SingleLinkedList<T>();
	}
	
	@Override
	public int count() {
		return listaInterna.Count();
	}

	@Override
	public boolean isEmpty() {
		return listaInterna.IsEmpty();
	}

	@Override
	public void push(T value) {
		listaInterna.InsertAtStart(value);
	}

	@Override
	public T pull() {
		return listaInterna.Delete(0);
	}

	@Override
	public T peek() {
		return listaInterna.Get(0);
	}

}
