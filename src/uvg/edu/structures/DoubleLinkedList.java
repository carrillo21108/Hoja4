/**
 * 
 */
package uvg.edu.structures;

import uvg.edu.common.IList;

/**
 * @author Brian Carrillo
 *
 */
public class DoubleLinkedList<T> extends List<T> {

	private DoubleNode<T> start;
	private DoubleNode<T> end;
	private int count;
	
	/**
     *Constructor
     * 
     */
	public DoubleLinkedList() {
		start = null;
		end = null;
		count = 0;
	}
	
	/**
     * Metodo InsertAtStart: sirve insertar un nodo al inicio
     * 
     * @see DoubleNode#setNext(DoubleNode)
     * @see DoubleNode#setPrevious(DoubleNode)
     * @see DoubleNode#setValue(Object)
     * @param value: (T)
     * 
     */
	@Override
	public void InsertAtStart(T value) {
		DoubleNode<T> newNode = new DoubleNode<T>(value);
		
		if (IsEmpty()) {
		
			start = newNode;
			end = newNode;
			start.setNext(start);
			start.setPrevious(start);
		} else {
			
			newNode.setNext(start);
			start.setPrevious(newNode);
			newNode.setPrevious(end);
			end.setNext(newNode);
			start = newNode;
		}
		
		count++;
	}

	/**
     * Metodo InsertAtEnd: sirve insertar un nodo al final
     * 
     * @see DoubleNode#setNext(DoubleNode)
     * @see DoubleNode#setPrevious(DoubleNode)
     * @see DoubleNode#setValue(Object)
     * @param value: (T)
     * 
     */
	@Override
	public void InsertAtEnd(T value) {
		
	DoubleNode<T> newNode = new DoubleNode<T>(value);
		
		if (IsEmpty()) {
		
			start = newNode;
			end = newNode;
			start.setNext(start);
			start.setPrevious(start);
		} else {
			
			newNode.setPrevious(end);
			newNode.setNext(start);
			start.setPrevious(newNode);
			end.setNext(newNode);
			end = newNode;
		}
		
		count++;
		
	}

	/**
     * Metodo Insert: sirve insertar un nodo en la posición indicada
     * 
     * @see DoubleNode#setNext(DoubleNode)
     * @see DoubleNode#setPrevious(DoubleNode)
     * @see DoubleNode#getNext()
     * @see DoubleLinkedList#InsertAtEnd(Object)
     * @see DoubleLinkedList#InsertAtStart(Object)
     * @param value: (T)
     * @param index: (int)
     * 
     */
	@Override
	public void Insert(T value, int index) {
		
		if (IsEmpty()) //if the list is empty then insert at start
        {
            InsertAtStart(value);
        }
        else 
        {
            if (index >= Count()) //if the index is equal or greater than count then insert at end
            {
                InsertAtEnd(value);
            } 
            else if (index == 0) //If the index to insert is 0 and the list is not empty
            {
                InsertAtStart(value);
            }
            else if ((index > 0) && (index < Count())) //Index between 1 (second element) and Count() - 1 previous the last one
            {
                DoubleNode<T> newNode = new DoubleNode<T>(value);
                DoubleNode<T> temp = start;
                int i = 0;

                //Search the position where the node will be inserted
                while ((temp != null) && (i < index)) {
                    temp = temp.getNext();
                    i++;
                }

                //doing the insertion
                newNode.setNext(temp);
                newNode.setPrevious(temp.getPrevious());
                temp.setPrevious(newNode);
                newNode.getPrevious().setNext(newNode);
                count++;
            }
        }
		
	}

	/**
     * Metodo Delete
     * 
     * @param index: (int)
     * 
     */
	@Override
	public T Delete(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * Metodo DeleteAtStart: sirve eliminar un nodo en la posición inicial
     * 
     * @see DoubleNode#setNext(DoubleNode)
     * @see DoubleNode#setPrevious(DoubleNode)
     * @see DoubleNode#getNext()
     * @see DoubleNode#getValue()
     * 
     */
	@Override
	public T DeleteAtStart() {
		if (!IsEmpty()) {
			
			if (Count() == 1) {
				DoubleNode<T> temp = start;
				start = null;
				end = null;
				count--;
				return temp.getValue();
			} else {
				DoubleNode<T> temp = start;
				end.setNext(temp.getNext());
				temp.getNext().setPrevious(end);
				start = temp.getNext();
				count--;
				return temp.getValue();
			}
			
		} else {
			return null;
		}
		
		
	}

	/**
     * Metodo DeleteAtEnd
     * 
     */
	@Override
	public T DeleteAtEnd() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * Metodo Get: sirve obtener el valor de un nodo específico
     * 
     * @see DoubleNode#getNext()
     * @see DoubleNode#getValue()
     * @param index: (int)
     * 
     */
	@Override
	public T Get(int index) {
	    if (!IsEmpty())
        {
            if (index == 0)
            {
                return start.getValue();
            }
            else if (index == (Count() - 1))
            {
                return end.getValue();
            }
            else if ((index > 0) && (index < (Count() - 1)))
            {
                DoubleNode<T> temp = start;
                int i = 0;
                while ((temp != null) && (i != index))
                {
                    temp = temp.getNext();
                    i++;
                }

                if (temp != null)
                {
                    return temp.getValue();
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
        }

        return null;

	}

	/**
     * Metodo IsEmpty
     * 
     */
	@Override
	public boolean IsEmpty() {
		return count == 0;
	}

	/**
     * Metodo Count
     * 
     */
	@Override
	public int Count() {
		return count;
	}


}
