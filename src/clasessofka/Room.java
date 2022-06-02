
package clasessofka;
/**
 * Esta clase contiene parámetros de estado de una habitación y la capacidad.
 * @author: Johnatan Mena
 * @version: 31/05/2022/A
 */
public class Room {
    /**
 * Definición variables de tipo array y boleana para definir el estado y capacidad
 */
  boolean state;
  int level [] = new int [3];

  public Room(){
    /**
   * Inicialización de variables 
   * @param state variable de estado de la habitación.
   * @param  level variable de capacidad de la habitación.
   */    
  state = false;
  level [0] = 5;
  level [1] = 10;
  level [2] = 15;
  
  
  }
     /**
     * Constructor para los valores almacenados en las variables iniciadas
     */
  public Room(boolean state, int level){
      this.level [0] = level;
      this.level [1] = level;
      this.level [2] = level;
      this.state = state;
  }//Cierre constructor 
  
      /**
     * Método para los valores almacenados de la capacidad
     */
  public int getlevel(){
  return this.level[0];
  }//Cierre de método
    /**
     * Método para los valores almacenados en el estado
     */
  public boolean getstate(){
      state = true;
  return this.state;
  }//Cierre de método
}
