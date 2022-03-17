/*
 * Implementación del Diagrama No. 2, Tema de Herencia. 
 * Clase Employee
 * Clase Padre o Superclase.
 */
package implementación2_herencia;

/**
 *
 * @author  L.A. 
 */
public class Employee { //Employee: Empleado o Empleada. 
    //Atributos o Variables Distancia. 
    public String name;//Nombre.
    public int age; //Años, Edad.
    public double salary; // Salario. 

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
    
     public String printData (){
        System.out.println ("Name: "+getName ()+
                "/age: "+ getAge () +
                "/salary: "+ getSalary ()); 
        return null;
    }           
}
