/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.nivelesacceso.usuarios;
//import gt.edu.url.nivelesacceso.usuarios.Employee; 
/**
 *
 * @author rodri
 */
public class EmployeeTest extends Employee{
    
   // Employee emp = new Employee(); 
    
  public EmployeeTest() {
        name = "Alex"; 
        setHireYear(1999); 
  }

    @Override
    protected double monthlyPay() {
        return 1000.00;
    }

    @Override
    protected double annualPay() {
       return 1000.00;
    }
    
}
