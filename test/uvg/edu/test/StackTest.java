package uvg.edu.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uvg.edu.structures.StackUsingArrayList;
import uvg.edu.structures.StackUsingVector;

class StackTest {
	
	//JUnit ArrayList

	StackUsingArrayList ArrayList = new StackUsingArrayList();
	
	@Test
	void pushArrayList() {
		int valorEsperado = 21;
		ArrayList.push(valorEsperado);
		int valorRecibido = (int) ArrayList.peek();
		assertEquals(valorEsperado, valorRecibido, 0);		
	}
	
	@Test
	void peekArrayList() {
		int valorEsperado = 5;
		ArrayList.push(1);
		ArrayList.push(2);
		ArrayList.push(3);
		ArrayList.push(4);
		ArrayList.push(5);
		int valorRecibido = (int) ArrayList.peek();
		assertEquals(valorEsperado, valorRecibido, 0);		
	}
	
	@Test
	void pullArrayList() {
		ArrayList.push(19);
		ArrayList.push(18);
		ArrayList.push(17);
		ArrayList.push(15);
		ArrayList.push(14);
		int valorEsperado = 14;
		int valorRecibido = (int) ArrayList.pull();
		assertEquals(valorEsperado, valorRecibido, 0);		
	}
	
	@Test
	void isEmptyArrayList() {
		ArrayList.push(19);
		ArrayList.pull();
		boolean valorEsperado = true;
		boolean valorRecibido = ArrayList.isEmpty();
		assertEquals(valorEsperado, valorRecibido);		
	}
	
	
	//JUnit Vector
	
	StackUsingVector Vector = new StackUsingVector();
	
	@Test
	void pushVector() {
		int valorEsperado = 7;
		Vector.push(valorEsperado);
		int valorRecibido = (int) Vector.peek();
		assertEquals(valorEsperado, valorRecibido, 0);		
	}
	
	@Test
	void peekVector() {
		int valorEsperado = 15;
		Vector.push(11);
		Vector.push(12);
		Vector.push(13);
		Vector.push(14);
		Vector.push(15);
		int valorRecibido = (int) Vector.peek();
		assertEquals(valorEsperado, valorRecibido, 0);		
	}
	
	@Test
	void pullVector() {
		Vector.push(9);
		Vector.push(8);
		Vector.push(7);
		Vector.push(5);
		Vector.push(4);
		int valorEsperado = 4;
		int valorRecibido = (int) Vector.pull();
		assertEquals(valorEsperado, valorRecibido, 0);		
	}
	
	@Test
	void isEmptyVector() {
		Vector.push(100);
		Vector.pull();
		boolean valorEsperado = true;
		boolean valorRecibido = Vector.isEmpty();
		assertEquals(valorEsperado, valorRecibido);		
	}

}
