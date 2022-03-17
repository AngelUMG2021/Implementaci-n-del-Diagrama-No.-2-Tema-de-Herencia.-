/*
 * Implementación del Diagrama No. 2, Tema de Herencia. 
 */
package implementación2_herencia;

/**
 *
 * @author  L.A. 
 */
public class Implementación2_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Employee employee = new Employee ("Fernando Reyes", 25, 5000);
        employee.printData();
        
        Programmer programmer = new Programmer ("Python", "Rogelio García ", 26, 8000);
        programmer.printData();
        
        DetabasePro detabasepro = new DetabasePro ("Adminer", "Rubén Rosales", 24, 7000);
        detabasepro.printData(); 
    }
}
