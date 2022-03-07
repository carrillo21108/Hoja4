/**
 * Interfaz IInterpreter
 * @author Brian Carrillo
 *
 * En esta interfaz se definen los metodos que implementa el interprete.
 */
package uvg.edu.common;

/**
 *
 */
public interface IInterpreter {
	/***
	 * Este metodo evalua una expresion en notacion infija y retorna la notacion postfija
	 * Precondicion:
	 * @param expresion: es la expresion simple "1 + 2" (String)
	 * @param typeStack: el tipo de Stack
	 * Postcondicion:
	 * @return String: " 1 2 + "
	 */
	String Evaluate(String expresion, String typeStack);
}
