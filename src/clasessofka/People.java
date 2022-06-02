package clasessofka;
/**
 * Esta clase contiene parámetros de nombre de una persona, primer apellido, segundo apellido, fecha de nacimiento y estatura.
 * @author: Johnatan Mena
 * @version: 31/05/2022/A
 */
public class People {
         /**
 * Definición variables de tipo String y double para definir nombre, apellidos, fecha de nacimiento y estatura.
 */
    protected String name;
    String lastname1;
    protected String lastname2;
    String birthDate;
    double heigth;
    public People(){
                          /**
   * Inicialización de variables 
   * @param name variable de nombre de la persona.
   * @param  lastname1 variable del primer apellido de la persona.
   * @param  lastname2 variable del segundo apellido de la persona.
   * @param  birthDate variable de la fecha de nacimiento de la persona.
   * @param  heigth variable de la estatura de la persona.
   */ 
name = "Johnatan";
lastname1 = "Mena";
lastname2 = "Salcedo";
birthDate = "11-12-1991";
heigth = 1.65;
}
      /**
     * Constructor para los valores almacenados en las variables iniciadas
     */
public People(String name, String lastname1, String lastname2, String birthDate, double heigth){
    this.name = name;
    this.lastname1 = lastname1;
    this.lastname2 = lastname2;
    this.birthDate = birthDate;
    this.heigth = heigth;
    }//Cierre de constructor
 /**
     * Método para los valores almacenados del nombre de la persona.
     */
public String getname(){
System.out.print("Su nombre es: ");
return this.name;
}
/**
     * Método para los valores almacenados del primer apellido de la persona.
     */
public String getlastname1(){
System.out.print("El primer apellido es: ");
return this.lastname1;
}
/**
     * Método para los valores almacenados del segundo apellido de la persona.
     */
public String getlastname2(){
System.out.print("El segundo apellido es: ");
return this.lastname2;
}
/**
     * Método para los valores almacenados de la fecha de naciemiento de la persona.
     */
public String getbirthDate(){
System.out.print("La fecha de nacimiento es: ");
return this.birthDate;
}
/**
     * Método para los valores almacenados de la estatura de la persona.
     */
public double getheigth(){
System.out.print("La talla es: ");
return this.heigth;
}
}
