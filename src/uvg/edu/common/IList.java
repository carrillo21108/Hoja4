/**
 * Interfaz IList
 * @author Brian Carrillo
 *
 * En esta interfaz se definen los metodos que implementa el las listas.
 */
package uvg.edu.common;

/**
 *
 */
public interface IList<T> {
	
	
    void InsertAtStart(T value);

    void InsertAtEnd(T value);

    void Insert(T value, int index);

    T Delete(int index);

    T DeleteAtStart();

    T DeleteAtEnd();

    T Get(int index);

    boolean IsEmpty();
    
    int Count();
}
