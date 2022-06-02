
package clasessofka;
import java.util.Scanner;
import clasessofka.People;
import clasessofka.Fruit;
import clasessofka.Bankaccount;
import clasessofka.Cellphone;
import clasessofka.Room;
import java.util.Arrays;
/**
 * Esta clase contiene los métodos de las clases People, Fruit, Bankaccount, Cellphone y Room.
 * @author: Johnatan Mena
 * @version: 31/05/2022/A
 */
public class Clasessofka {

    public static void main(String[] args) {
                                  /**
   * Inicialización de variables para menu
   * @param menu Variable para entrada al usuario.
   * @param  p Contiene todos los métodos de la clase People.
   * @param  f Contiene todos los métodos de la clase Fruit.
   * @param  b Contiene todos los métodos de la clase Bankaccount.
   * @param  c Contiene todos los métodos de la clase Cellphone.
   * @param  r Contiene todos los métodos de la clase Room.
   */ 
        int menu;
        System.out.println("1. Personas 2. Frutas 3. Cuenta bancaria 4.Celular 5.Habitación");
        Scanner in = new Scanner(System.in);
        menu = in.nextInt();
        if(menu == 1){
        People p;
        p = new People();
        System.out.println(p.getname());
        System.out.println(p.getlastname1());
        System.out.println(p.getlastname2());
        System.out.println(p.getbirthDate());
        System.out.println(p.getheigth());
        }
        if(menu == 2){
        Fruit f;
        f = new Fruit();
        System.out.println(f.getnamefruit());
        System.out.println(f.getaverageWeight());
        System.out.println(f.getcolor());
      
        }
        if(menu ==3){
        Bankaccount b;
        b = new Bankaccount();
        System.out.println(b.getaccountnumber());
        System.out.println(b.getactivated());
        }
        if(menu ==4){
        Cellphone c;
        c = new Cellphone();
        System.out.println(c.getnumber());
        System.out.println(c.getmarca());
        System.out.println(c.gettipo());
        }
        if(menu ==5){
        Room r;
        r = new Room();
        System.out.println(r.getlevel());
        System.out.println(r.getstate());
        }
        
    }
    
}
