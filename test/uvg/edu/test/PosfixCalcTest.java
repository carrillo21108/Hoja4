package uvg.edu.test;
import junit.framework.TestCase;
import uvg.edu.common.PosfixCalc;


public class PosfixCalcTest extends TestCase{
	private String expresion = "1 4 3*+";
	private PosfixCalc calculadora;
	
	public void Incializar(){
		calculadora = new PosfixCalc();
		
	}
	
	public void testEvaluate() {
		Incializar();
		assertEquals(calculadora.Evaluate(expresion,"ArrayList") , 13);
	}
	
	public void testEvaluate2() {
		Incializar();
		assertEquals(calculadora.Evaluate(expresion,"Vector") , 13);
	}
	
	public void testEvaluate3() {
		Incializar();
		assertEquals(calculadora.Evaluate(expresion,"SingleLinkedList") , 13);
	}
	
	public void testEvaluate4() {
		Incializar();
		assertEquals(calculadora.Evaluate(expresion,"DoubleLinkedList") , 13);
	}
	

}
