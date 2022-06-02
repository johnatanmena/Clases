
package clasessofka;
/**
 * Esta clase contiene parámetros de nombre de la fruta, promedio de tamaño y color.
 * @author: Johnatan Mena
 * @version: 31/05/2022/A
 */
public class Fruit {
        /**
 * Definición variables de tipo String, arrelgo y double para definir nombre, promedio de tamaño y color de la fruta.
 */
    protected String namefruit;
    double averageWeight;
    String color [] = new String  [2];
    public Fruit(){
                   /**
   * Inicialización de variables 
   * @param namefruit variable de nombre de la fruta.
   * @param  averageWeight variable de tamaño de la fruta.
   * @param color Variable color de la fruta.
   */ 
    namefruit = "manzana";
    averageWeight = 2.3;
    color[0] = "azul";
    color[1] = "rojo";
    }
      /**
     * Constructor para los valores almacenados en las variables iniciadas
     */
    public Fruit(String name, double averageWeight, String color){
    this.namefruit = namefruit;
    this.averageWeight = averageWeight;
    this.color[0] = color;
    this.color[1] = color;
    this.color[2] = color;
    }//Cierre constructor
     /**
     * Método para los valores almacenados del nombre de la fruta.
     */
    public String getnamefruit(){
    return this.namefruit;
    }
     /**
     * Método para los valores almacenados del tamaño de la fruta.
     */
    public double getaverageWeight(){
    return this.averageWeight;
    }
     /**
     * Método para los valores almacenados del color de la fruta.
     */
    public String getcolor(){
    return this.color[0];
    }
}
