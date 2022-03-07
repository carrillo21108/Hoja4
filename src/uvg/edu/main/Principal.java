
/**
 * Clase Principal
 * @author Carlos Lopez
 * @version 1.0
 *
 * En esta clase se maneja el metodo main que permite la ejecucion del 
 * programa. Desde el metodo main se ejecutan los metodos de la calculadora.
 */
package uvg.edu.main;
import uvg.edu.common.Interpreter;
import uvg.edu.common.PosfixCalc;
import uvg.edu.io.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 * 
     * Metodo main
     *
     * @param args: (String[])
     * @see System.out#println()
     * @see Reader#leerTxt()
     * @see PosfixCalc#Evaluate()
     * @see Scanner#nextInt(int)
     * @see Scanner#nextLine()
     * @see Scanner#close()
     * @see PosfixCalc#getInstance()
     * @see PosfixCalc#Evaluate(String, String)
     * @see Interpreter#getInstance()
     * @see Interpreter#Evaluate(String, String)
     * 
     */
	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        
	        //Banderas de salida y errores
	        boolean salida = false;
	        boolean error = false;
	        
	        //Opcion de menu
	        int opc = 0;
	        
	        //Uso del reader
	        Reader reader = new Reader();
	        ArrayList<String> filasLeidas = new ArrayList<String>();
	        String ruta;
	        String typeStack = "";
	        
	        //Ciclo del menu
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
	                	//Conversion de infija a postfija y operacion
	                	System.out.println("Ingrese la ruta en la que se encuentra el archivo.");
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
	                			
	                			//Definicion del tipo de pila a utilizar
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

	                	
	                	//Operacion sobre cada linea del documento
	                	if(filasLeidas != null) {        	
	                    	for (String fila : filasLeidas) {
	                    		//Conversion a postfijo
	                    		String postFixExp = Interpreter.getInstance().Evaluate(fila.replace(" ",""), typeStack);
	                    		//Operacion de la expresion
	                    		int resultado = PosfixCalc.getInstance().Evaluate(postFixExp, typeStack);
	                    		System.out.println("Infix: " + fila + " ,Posfix: " + postFixExp + " ,Resultado: " + resultado);
	                    	}
	                    }
	                	            
		                break;
	                case 2:
	                	//Salida
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

