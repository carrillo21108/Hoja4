/**
 * Interfaz IStack
 * @author Brian Carrillo
 *
 * En esta interfaz se definen los metodos que implementa el las stacks.
 */
package uvg.edu.common;

/**
 *
 */
public interface IStack<T> {

	int count();
	
	boolean isEmpty();
	
	void push(T value);
	
	T pull();
	
	T peek();
}
