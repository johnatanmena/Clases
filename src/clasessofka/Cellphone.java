
package clasessofka;
/**
 * Esta clase contiene parámetros de número, marca y tipo de teléfono.
 * @author: Johnatan Mena
 * @version: 31/05/2022/A
 */
public class Cellphone {
      /**
 * Definición variables de tipo String y array para definir número, marca  y el tipo.
 */
    private String number;
    String marca [] = new String [2];
    String tipo [] = new String [2];
    public Cellphone(){
         /**
   * Inicialización de variables 
   * @param number variable de número de teléfono.
   * @param  marca variable de marca de teléfono.
   * @param  marca variable de tipo de teléfono.
   */ 
    number = "3146148505";
    marca [0] = "Samsung";
    marca [1] = "Iphone";
    tipo [0] = "Inteliente";
    tipo [1] = "Analógico";
    }
     /**
     * Constructor para los valores almacenados en las variables iniciadas
     */
    public Cellphone(String number, String marca, String tipo){
        this.number = number;
        this.marca [0] = marca;
        this.marca [1] = marca;
        this.tipo [0] = tipo;
        this.tipo [1] = tipo;
    } //Cierre constructor 
     /**
     * Método para los valores almacenados del número de teléfono
     */
    public String getnumber(){
    return this.number;
    }
     /**
     * Método para los valores almacenados de la marca del teléfono
     */
    public String getmarca(){
    return this.marca[0];
    }
     public String gettipo(){
    return this.tipo[0];
    }
}
