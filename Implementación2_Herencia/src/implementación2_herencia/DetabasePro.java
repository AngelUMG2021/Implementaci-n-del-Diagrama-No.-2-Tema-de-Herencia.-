/*
 * Implementación del Diagrama No. 2, Tema de Herencia. 
 * Clase DetabasePro.
 * Clase Hija o Subclase.
 */
package implementación2_herencia;

/**
 *
 * @author L.A. 
 */
public class DetabasePro extends Employee { // DetabasePro: Base de Datos Profesional.
    //Atributos o Variables Distancia. 
    String detabaseTool;// Herramienta de Base de Datos. 

    public DetabasePro(String detabaseTool, String name, int age, double salary) {
        super(name, age, salary);
        this.detabaseTool = detabaseTool;
    }
    
     public String getDetabasePro (){
        return detabaseTool;
    }  
   
    public String printData (){
        System.out.println ("Name: "+getName ()+
                "/age: "+ getAge () +
                "/salary: "+ getSalary ()+
                "/detabaseTool: "+ getDetabasePro ()); 
        return null;
    }  
}
