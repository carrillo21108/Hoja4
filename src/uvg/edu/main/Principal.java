/**
 * 
 */
package uvg.edu.main;
import uvg.edu.io.*;
import java.util.Scanner;


/**
 * @author Brian Carrillo
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        boolean salida = false;

	        while(!salida){

	            System.out.println("Elija la opcion que necesite ejecutar");
	            System.out.println("1. Ingresar la ruta del archivo");
	            System.out.println("2. Salir");
	            int opc = sc.nextInt();
	            sc.nextLine();

	            switch (opc) {
	                case 1:
	                String pathway = sc.nextLine();
	                Reader reader = new Reader(pathway);
	                Scanner evaluate = new Scanner(reader.leer());
	 
	            }



	        }
	        sc.close();        

	    }


	}		

