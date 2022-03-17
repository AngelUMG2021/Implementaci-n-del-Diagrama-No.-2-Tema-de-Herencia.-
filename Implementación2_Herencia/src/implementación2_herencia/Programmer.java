/*
 * Implementación del Diagrama No. 2, Tema de Herencia. 
 * Clase Programmer.
 * Clase Hija o Subclase.
 */
package implementación2_herencia;

/**
 *
 * @author  L.A.
 */
public class Programmer extends Employee {//Programmer: Programador o Programadora. 
  
    //Atributos o Variables Distancia. 
    private String language; //Idioma.

    public Programmer(String language, String name, int age, double salary) {
        super(name, age, salary);
        this.language = language;
    }

    public String getLanguage (){
        return language;
    } 
    
    public String printData (){
        System.out.println ("Name: "+getName ()+
                "/age: "+ getAge () +
                "/salary: "+ getSalary ()+
                "/language: "+ getLanguage ()); 
        return null;
    }  
}
