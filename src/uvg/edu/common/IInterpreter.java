/**
 * 
 */
package uvg.edu.common;

/**
 * @author Brian Carrillo
 *
 */
public interface IInterpreter {
	/***
	 * Este metodo evalua una expresion en notacion infija y retorna la notacion posfija
	 * Precondicion:
	 * @param expresion: es la expresion simple "1 + 2" (String)
	 * Postcondicion:
	 * @return String: " 1 2 + "
	 */
	String Evaluate(String expresion, String typeStack);
}
