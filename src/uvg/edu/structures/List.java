/**
 * Clase List
 * @author Brian Carrillo
 * @version 1.0
 *
 * Clase abstracta de listas
 */
package uvg.edu.structures;

import uvg.edu.common.IList;

public abstract class List<T> implements IList<T> {

	/**
     *InsertAtStart
     * 
     * @param value: (T)
     * 
     */
	@Override
	public abstract void InsertAtStart(T value) ;

	/**
     *InsertAtEnd
     * 
     * @param value: (T)
     * 
     */
	@Override
	public abstract void InsertAtEnd(T value);

	/**
     *Insert
     * 
     * @param value: (T)
     * @param index: (int)
     * 
     */
	@Override
	public abstract void Insert(T value, int index) ;

	/**
     *Delete
     * 
     * @param index: (int)
     * 
     */
	@Override
	public abstract T Delete(int index);

	/**
     *DeleteAtStart
     * 
     */
	@Override
	public abstract T DeleteAtStart();

	/**
     *DeleteAtEnd
     * 
     */
	@Override
	public abstract T DeleteAtEnd();

	/**
     *Get
     * 
     * @param index: (int)
     * 
     */
	@Override
	public abstract T Get(int index);
	/**
     *IsEmpty
     * 
     */
	@Override
	public abstract boolean IsEmpty();
	/**
     *Count
     * 
     */
	@Override
	public abstract int Count();

}
