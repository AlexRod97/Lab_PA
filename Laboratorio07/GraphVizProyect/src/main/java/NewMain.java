
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileLoader file = new FileLoader(); 
        DemoGraphviz graph = new DemoGraphviz();
        Scanner scan = new Scanner(System.in);        
        String Ruta;
        
        try {
       System.out.println("Ingrese la ruta a leer");
        Ruta = scan.nextLine();        
        graph.createDemoFromDot(Ruta);
        }
        catch (Exception e) {
            System.out.println("Error en lectura de archivo"); 
        }
        
        
        
        
        
    }
    
}
