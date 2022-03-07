package uvg.edu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uvg.edu.structures.StackUsingArrayList;
import uvg.edu.structures.StackUsingDoubleLinkedList;
import uvg.edu.structures.StackUsingSingleLinkedList;
import uvg.edu.structures.StackUsingVector;

class ListTest {

	//JUnit SingleLinkedList

		StackUsingSingleLinkedList SingleLinkedList = new StackUsingSingleLinkedList();
		
		@Test
		void pushSingleLinkedListt() {
			int valorEsperado = 21;
			SingleLinkedList.push(valorEsperado);
			int valorRecibido = (int) SingleLinkedList.peek();
			assertEquals(valorEsperado, valorRecibido, 0);		
		}
		
		@Test
		void peekSingleLinkedList() {
			int valorEsperado = 5;
			SingleLinkedList.push(1);
			SingleLinkedList.push(2);
			SingleLinkedList.push(3);
			SingleLinkedList.push(4);
			SingleLinkedList.push(5);
			int valorRecibido = (int) SingleLinkedList.peek();
			assertEquals(valorEsperado, valorRecibido, 0);		
		}
		
		@Test
		void pullSingleLinkedList() {
			SingleLinkedList.push(19);
			SingleLinkedList.push(18);
			SingleLinkedList.push(17);
			SingleLinkedList.push(15);
			SingleLinkedList.push(14);
			int valorEsperado = 14;
			int valorRecibido = (int) SingleLinkedList.pull();
			assertEquals(valorEsperado, valorRecibido, 0);		
		}
		
		@Test
		void isEmptySingleLinkedList() {
			SingleLinkedList.push(19);
			SingleLinkedList.pull();
			boolean valorEsperado = true;
			boolean valorRecibido = SingleLinkedList.isEmpty();
			assertEquals(valorEsperado, valorRecibido);		
		}
		
		
		//JUnit DoubleLinkedList
		
		StackUsingDoubleLinkedList DoubleLinkedList = new StackUsingDoubleLinkedList();
		
		@Test
		void pushDoubleLinkedList() {
			int valorEsperado = 7;
			DoubleLinkedList.push(valorEsperado);
			int valorRecibido = (int) DoubleLinkedList.peek();
			assertEquals(valorEsperado, valorRecibido, 0);		
		}
		
		@Test
		void peekDoubleLinkedList() {
			int valorEsperado = 15;
			DoubleLinkedList.push(11);
			DoubleLinkedList.push(12);
			DoubleLinkedList.push(13);
			DoubleLinkedList.push(14);
			DoubleLinkedList.push(15);
			int valorRecibido = (int) DoubleLinkedList.peek();
			assertEquals(valorEsperado, valorRecibido, 0);		
		}
		
		@Test
		void pullDoubleLinkedList() {
			DoubleLinkedList.push(9);
			DoubleLinkedList.push(8);
			DoubleLinkedList.push(7);
			DoubleLinkedList.push(5);
			DoubleLinkedList.push(4);
			int valorEsperado = 4;
			int valorRecibido = (int) DoubleLinkedList.pull();
			assertEquals(valorEsperado, valorRecibido, 0);		
		}
		
		@Test
		void isEmptyDoubleLinkedList() {
			DoubleLinkedList.push(100);
			DoubleLinkedList.pull();
			boolean valorEsperado = true;
			boolean valorRecibido = DoubleLinkedList.isEmpty();
			assertEquals(valorEsperado, valorRecibido);		
		}
}
