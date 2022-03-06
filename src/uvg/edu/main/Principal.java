/**
 * 
 */
package uvg.edu.main;
import uvg.edu.common.Interpreter;
import uvg.edu.common.PosfixCalc;
import uvg.edu.io.*;

import java.util.ArrayList;
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
		
	        Scanner sc = new Scanner(System.in);
	        boolean salida = false;
	        boolean error = false;
	        int opc = 0;
	        Reader reader = new Reader();
	        ArrayList<String> filasLeidas = new ArrayList<String>();
	        String ruta;
	        String typeStack = "";

	        while(!salida){
	        	
	        	do{
	                //Verificacion de entrada de las opciones del menu
	                try{
	                    //Solicitud de opcion de menu
	                	System.out.println("Elija la opcion que necesite ejecutar");
	    	            //Opciones del menú
	    				System.out.println("1. Ingresar la ruta del archivo \n"
	    									+ "2. Salir\n");
	    	            opc = sc.nextInt();
	                    error = false;

	                //En caso de error
	                }catch(Exception e){
	                    System.out.println("Error de ingreso, intente de nuevo.\n");
	                    error = true;
	                //Finalmente
	                }finally{
	                	sc.nextLine();
	                }
	            }while(error);


	            switch (opc) {
	                case 1:
	                	
	                	System.out.println("Ingrese la ruta en la que se encunetre el archivo.");
	                	ruta = sc.nextLine();
	                	filasLeidas = reader.leerTxt(ruta);
	                	
	                	do{
	                		//Verificacion de entrada de las opciones del menu
	                		try{
	                			opc = 0;
	                			//Solicitud de opcion de menu
	                			System.out.println("Ingrese el numero de la implementación deseada para el stack:");
	                			//Opciones del menú
	                			System.out.println("1. ArrayList \n"
				                					+ "2. Vector\n"
				                					+ "3. SingleLinkedList\n"
				                					+ "4. DoubleLinkedList\n");
	                			opc = sc.nextInt();
	                			error = false;

	                			switch (opc) {
	                			case 1:
	                				typeStack = "ArrayList";
	                				break;
	                			case 2:
	                				typeStack = "Vector";
	                				break;
	                			case 3:
	                				typeStack = "SingleLinkedList";
	                				break;
	                			case 4:
	                				typeStack = "DoubleLinkedList";
	                				break;

	                			}
	                			
	                			//En caso de error
	                		}catch(Exception e){
	                			System.out.println("Error de ingreso, intente de nuevo.\n");
	                			error = true;
	                			//Finalmente
	                		}finally{
	                			sc.nextLine();
	                		}
	                	}while(error);

	                	
	                	if(filasLeidas != null) {        	
	                    	for (String fila : filasLeidas) {
	                    		String postFixExp = Interpreter.getInstance().Evaluate(fila.replace(" ",""), typeStack);
	                    		int resultado = PosfixCalc.getInstance().Evaluate(postFixExp, typeStack);
	                    		System.out.println("Infix: " + fila + " ,Posfix: " + postFixExp + " ,Resultado: " + resultado);
	                    	}
	                    }
	                	            
		                break;
	                case 2:
	                	salida = true;
	                	System.out.println("Saliendo...");
	                	break;
	                default:
	            		System.out.println("Opcion incorrecta. Intentelo de nuevo.");
	            		break;
	            }

	        }
	        sc.close();        

	    }

}		

