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
public abstract class HourlyEmployee extends Employee {
    
   private int hoursPerWeek; 
   private double hourlyWage; 
   
   public HourlyEmployee() {
       name = "Victor hourly Employee"; 
       setHireYear(1999); 
       country = "Guatemala"; 
   }
   
   protected abstract double monthlyPay(); 
   protected abstract double annualPay();
   
   
    
    
}
