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
    String cadena;
    File archivo;
    FileReader leer;
    FileWriter escribir;
    PrintWriter linea;
    BufferedReader almacenamiento;
    String texto;

  public Reader(String miArchivo) {
    /**
     * Constructor de la clase Reader
     * 
     * @param mi archivo: es donde va la ruta del archivo que va leer
     * 
     *           creamos un varibale en la que este el archivo, luego la va a buscar
     *           evalua si la ruta ingresada existe, si no existe crea un archivo en
     *           esa ruta
     */
    archivo = new File(miArchivo);
    if (!archivo.exists()) {
      try {
        archivo.createNewFile();
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else {
      try {
        leer = new FileReader(archivo);
        almacenamiento = new BufferedReader(leer);
        cadena = "";
        while (cadena != null) {
          try {
            cadena = almacenamiento.readLine();
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
        almacenamiento.close();
        leer.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * @return String
   */
  public String leer() {
    /**
     * Funcion que permite leer el contenido del archivo
     */
    texto = "";
    try {
      Scanner myReader = new Scanner(archivo);
      while (myReader.hasNextLine()) {
        texto += myReader.nextLine() + "\n";
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return texto;
  }

  /**
   * @param pathway
   * @return ArrayList<ArrayList<String>>
   */
  public ArrayList<ArrayList<String>> evaluateTxt(String pathway) {
    /***
     * @param pathway: es la ruta del archivo
     *                 funcion que se encarga de evaluar el texto ingresado
     */
    Reader reader = new Reader(pathway);
    Scanner sc = new Scanner(reader.leer());

    ArrayList<ArrayList<String>> evalTxt = new ArrayList<ArrayList<String>>();

    while (sc.hasNextLine()) {
      /***
       * dentro del ciclo while se lee sola la primera linea de texto y la separa y la
       * regrese en una lista
       * si hay mas lineas con texto tambien las evualua y las almacena en una lista
       */
      String tmp = sc.nextLine();
      ArrayList<String> tmp2 = new ArrayList<String>();
      for (int i = 0; i < tmp.length(); i++) {
        if (!String.valueOf(tmp.charAt(i)).isBlank()) {
          tmp2.add(String.valueOf(tmp.charAt(i)).replace("  ", ""));
        }
      }
      tmp2.removeIf(Objects::isNull);
      evalTxt.add(tmp2);
      tmp2 = new ArrayList<String>();
    }
    return evalTxt;
  }
    
}
