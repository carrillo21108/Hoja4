
/**
 * Interface IPosfixCalc
 * @author Brian Carrillo
 *
 * En esta interfaz se definen los metodos que implementa la calculadora.
 */

package uvg.edu.common;

public interface IPosfixCalc {

	/***
	 * Este metodo evalua una expresion en notacion postfija y retorna su resultado
	 * Precondicion:
	 * @param expresion: es la expresion postfija "1 2 +" (String)
	 * Postcondicion:
	 * @return int: el resultado de la operacion
	 */
	int Evaluate(String expresion, String typeStack);
}