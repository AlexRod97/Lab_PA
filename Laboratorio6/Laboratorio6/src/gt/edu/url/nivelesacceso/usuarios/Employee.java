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
public abstract class Employee {
    
    public String name; 
    private int hireYear; 
    protected String country; 

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    
   protected abstract double monthlyPay(); 
   protected abstract double annualPay(); 
    
    
    
}
