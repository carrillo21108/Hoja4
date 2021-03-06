/**
 * Clase Stack
 * @author Brian Carrillo
 * @version 1.0
 *
 * Clase abstracta de Stack
 */
package uvg.edu.structures;

import uvg.edu.common.IStack;

public abstract class Stack<T> implements IStack<T> {

	@Override
	public abstract int count();

	@Override
	public abstract boolean isEmpty();

	@Override
	public abstract void push(T value);

	@Override
	public abstract T pull();

	@Override
	public abstract T peek();

}
