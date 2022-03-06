/**
 * 
 */
package uvg.edu.io;


import java.io.*;
import java.util.*;

/**
 * Clase encargada de la manipulacion de archivos.
 * 
 * 
 */

public class Reader {

		public Reader(){}
    
		/**
	     * Metodo leerTxt: sirve para leer el archivo y almacenar lo encontrado en un ArrayList de Strings.
	     * 
	     * @see System.out#println()
	     * @see java.io.File()
	     * @see java.io.FileReader()
	     * @see java.io.BufferedReader()
	     * @see java.util.ArrayList()
	     */
		public ArrayList<String> leerTxt(String ruta){

	        File archivo = null;
	        FileReader fr = null;
	        BufferedReader br = null;
	        try {
	        	//Nombre del archivo que se lee para obtener todas las expresiones proporcionadas
	            archivo = new File (ruta);
	            fr = new FileReader (archivo);
	            br = new BufferedReader(fr);

	            // Lectura del fichero
	            ArrayList<String> filas = new ArrayList<String>();
	            String linea;
	            while((linea=br.readLine())!=null){
	                filas.add(linea);
	            }
	            return filas;
	            
	        }catch(Exception e){
	        	System.out.println("La ruta del archivo proporcionada no existe.");
	        }finally{
	            // En el finally cerramos el fichero, para asegurarnos
	            // que se cierra tanto si todo va bien como si salta 
	            // una excepcion.
	            try{                    
	                if( null != fr ){   
	                    fr.close();     
	                }                  
	            }catch (Exception e2){ 
	                e2.printStackTrace();
	            }
	        }
	        return null;
	    }
    
}
