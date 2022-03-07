/**
 * Clase SingleLinkedList
 * @author Brian Carrillo
 * @version 1.0
 *
 * Lista encadenada simple
 */
package uvg.edu.structures;

import uvg.edu.common.IList;

/**
 *
 */
public class SingleLinkedList<T> extends List<T> {

	private int count;
    private Node<T> start;
    private Node<T> end;

    /**
     * Metodo InsertAtStart: sirve insertar un nodo al inicio
     * 
     * @see Node#setNext(Node)
     * @see Node#setPrevious(Node)
     * @see Node#setValue(Object)
     * @param value: (T)
     * 
     */
	@Override
	public void InsertAtStart(T value) {
		Node<T> newNode = new Node<T>(value);

        if (IsEmpty())
        {
            start = newNode;
            end = newNode;
        }
        else
        {
            newNode.setNext(start);
            start = newNode;
        }
        count++;
	}

	/**
     * Metodo InsertAtEnd: sirve insertar un nodo al final
     * 
     * @see Node#setNext(Node)
     * @see Node#setPrevious(Node)
     * @see Node#setValue(Object)
     * @param value: (T)
     * 
     */
	@Override
	public void InsertAtEnd(T value) {
		Node<T> newNode = new Node<T>(value);

        if (IsEmpty())
        {
            start = newNode;
            end = newNode;
        }
        else {
            end.setNext(newNode);
            end = newNode;
        }

        count++;
		
	}

	/**
     * Metodo Insert: sirve insertar un nodo en la posición indicada
     * 
     * @see Node#setNext(Node)
     * @see Node#setPrevious(Node)
     * @see Node#getNext()
     * @see Node#InsertAtEnd(Object)
     * @see Node#InsertAtStart(Object)
     * @param value: (T)
     * @param index: (int)
     * 
     */
	@Override
	public void Insert(T value, int index){
		
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
                Node<T> newNode = new Node<T>(value);
                Node<T> pretemp = start;
                Node<T> temp = start.getNext();
                int i = 1;

                //Search the position where the node will be inserted
                while ((temp != null) && (i < index)) {
                    pretemp = temp;
                    temp = temp.getNext();
                    i++;
                }

                //doing the insertion
                newNode.setNext(temp);
                pretemp.setNext(newNode);
                count++;
            }
        }
	}
	
	/**
     * Metodo Delete
     * 
     * @param index: (int)
     * @see Node#getNext()
     * @see Node#getValue()
     * @see Node#setNext(Node)
     * 
     */
	@Override
	public T Delete(int index) {
		
		if (index == 0)
        {
            return DeleteAtStart();
        }
        else if (index == (Count() - 1))
        {
            return DeleteAtEnd();
        }
        else if ((index > 0) && (index < (Count() - 1)))
        {
            Node<T> pretemp = start;
            Node<T> temp = start.getNext();
            int i = 1;

            //Search the position where the node will be inserted
            while ((temp != null) && (i < (Count() - 1)))
            {
                pretemp = temp;
                temp = temp.getNext();
                i++;
            }

            //Delete the node
            pretemp.setNext(temp.getNext());
            count--;
            return temp.getValue();
        }
        else
        {
            return null;
        }
	}

	/**
     * Metodo DeleteAtStart: sirve eliminar un nodo en la posición inicial
     * 
     * @see Node#getNext()
     * @see Node#getValue()
     * 
     */
	@Override
	public T DeleteAtStart() {
		
		if (!IsEmpty()) 
        {
            Node<T> temp = start;
            start = start.getNext();
            count--;
            return temp.getValue();
        }

        return null;
	}

	/**
     * Metodo DeleteAtEnd
     * 
     * @see Node#getNext()
     * @see Node#getValue()
     * 
     */
	@Override
	public T DeleteAtEnd() {
		if (!IsEmpty()) 
        {

            if (Count() == 1) //Only one node then delete
            {
                Node<T> temp = start;
                start = null;
                end = null;
                count--;
                return temp.getValue();
            }
            else
            {
                Node<T> pretemp = start;
                Node<T> temp = start.getNext();

                //Search the position where the node will be inserted
                while (temp != null)
                {
                    pretemp = temp;
                    temp = temp.getNext();
                }

                //Delete the node
                end = pretemp;
                end.setNext(null);
                count--;
                return temp.getValue();
            }

        }

        return null;
	}

	/**
     * Metodo Get: sirve obtener el valor de un nodo específico
     * 
     * @see Node#getNext()
     * @see Node#getValue()
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
                Node<T> temp = start;
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
		// TODO Auto-generated method stub
		return count;
	}

}
