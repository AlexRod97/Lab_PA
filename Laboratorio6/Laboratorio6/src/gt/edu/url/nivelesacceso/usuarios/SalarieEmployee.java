/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.nivelesacceso.usuarios;

/**
 *
 * @author rodri
 */
public abstract class SalarieEmployee extends Employee {
    
    int annualSalary; 
    
    public SalarieEmployee() {
        name = "Victor"; 
        setHireYear(1999); 
        country = "Guatemala"; 
    }
    
  @Override 
    public abstract double monthlyPay(); 
    
   @Override 
    public abstract double annualPay();
}
