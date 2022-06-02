
package clasessofka;
/**
 * Esta clase contiene parámetros de número de cuenta y actividad en la cuenta.
 * @author: Johnatan Mena
 * @version: 31/05/2022/A
 */
public class Bankaccount {
      /**
 * Definición variables de tipo Entero  y boleano para definir número de cuenta y actividad de la cuenta.
 */
    int accountnumber;
    boolean activated;
    public Bankaccount(){
              /**
   * Inicialización de variables 
   * @param accountnumber variable de número de cuenta.
   * @param  activated variable de actividad de la cuenta.
   */ 
    accountnumber = 202020;
    activated = false;
    }
     /**
     * Constructor para los valores almacenados en las variables iniciadas
     */
    public Bankaccount(int accountnumber, boolean activated){
    this.accountnumber = accountnumber;
    this.activated = activated;
    }//Cierre de constructor
    /**
     * Método para los valores almacenados del número de cuenta.
     */
    public int getaccountnumber(){
    return this.accountnumber;
    }
    /**
     * Método para los valores almacenados de la actividad de la cuenta
     */
    public boolean getactivated(){
    return this.activated;
    }
    
}

