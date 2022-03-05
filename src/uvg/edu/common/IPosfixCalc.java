package uvg.edu.common;

/**
 * Interface IPosfixCalc
 * @author moises.alonso
 *
 * En esta interfaz se definen los metodos que implementa la calculadora.
 */
public interface IPosfixCalc {

	/***
	 * Este metodo evalua una expresion en notacion postfija y retorna su resultado
	 * Precondicion:
	 * @param expresion: es la expresion simple "1 2 + 4 * 3 +" (String)
	 * Postcondicion:
	 * @return int: el resultado de la expresion
	 */
	int Evaluate(String expresion);
}