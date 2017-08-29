import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    
	    Scanner key = new Scanner (System.in);
        Point miPunto = new Point(); 
        Point miPunto2 = new Point(); 
        
        int x,y,x1,y1;
        double d1,d2,d3; 
        String cadena; 
        
	    System.out.println("Segundo laboratorio Programación Avanzada");
	    System.out.println("Ingrese la coordenada X del punto"); 
	    x = key.nextInt(); 
	    System.out.println("Ingrese la coordenada Y del punto"); 
	    y = key.nextInt(); 	    
	    miPunto.setX(x); 
	    miPunto.setY(y); 
	    System.out.println("Ingrese la coordenada X del segundo punto"); 
	     x = key.nextInt();
	    System.out.println("Ingrese la coordenada y del segundo punto"); 
	     y = key.nextInt();
	     miPunto.setXY(x,y); 
	     
	    d1 = miPunto.distance(x,y);
	    System.out.println("La distancia utilizando parametros x,y es: " + d1); 
	    System.out.println("");
	     System.out.println("Ingrese la coordenada X del tercer punto"); 
	     x = key.nextInt();
	    System.out.println("Ingrese la coordenada Y del tercer punto"); 
	     y = key.nextInt();
	     miPunto2.setX(x);
	     miPunto2.setY(y);
	    d2 = miPunto.distance(miPunto2); 
	    System.out.println("La distancia utilizando parametro another es: " + d2); 
	    System.out.println("");
	    d3 = miPunto.distance(); 
	    System.out.println("La distancia desde el punto hasta 0 es: " + d3); 
	    System.out.println("");
	    
	    System.out.println("Ingrese la coordenada X del punto inicio"); 
	    x = key.nextInt();
	    System.out.println("Ingrese la coordenada Y del punto inicio"); 
	    y = key.nextInt();
	    System.out.println("Ingrese la coordenada X del punto fin"); 
	    x1 = key.nextInt();
	    System.out.println("Ingrese la coordenada Y del punto fin"); 
	    y1 = key.nextInt();
	    
	    Line miLinea = new Line(x,y,x1,y1); 
	    cadena = miLinea.toString(); 	
	    System.out.println(cadena); 
	    System.out.println("----------------------------------------------------");
	    System.out.println("");
	    Student estudiante = new Student(); 
	    
    }
}
