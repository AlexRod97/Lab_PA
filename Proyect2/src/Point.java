
public class Point {
    private int x = 0; 
    private int y = 0;
    private int [] XY = new int[2]; 
    
    public Point() {
        
    }
    
    public Point(int x1, int y1) {
      x = x1;
      y = y1;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x1) {
        x = x1;        
    }
    
    public int getY() {
        return y; 
    }    
    
    public void setY(int y1) {
        y = y1; 
    }
    
    public String toString () {
        return ("(" + x + "," + y + ")"); 
    }
    
    public int[] getXY()  {                
        return (XY);        
    }
    
    public void setXY(int x, int y) {
        XY[0] = x; 
        XY[1] = y; 
    }
    
    public double distance(int x1, int y1) {
        double distancia = 0; 
        int dX = 0; 
        int dY = 0; 
        dX = x - x1; 
        dY = y - y1; 
        distancia = Math.sqrt( (dX*dX) + (dY*dY) );
        return distancia;         
    }
    
    public double distance(Point another) {
        double dist = 0; 
        Point otro = new Point(); 
        otro = another; 
        int dX = 0; 
        int dY = 0;  
        dX = x - otro.getX(); 
        dY = y - otro.getY();  
        dist = Math.sqrt( (dX*dX) + (dY*dY) );
        return dist;         
    }
    
    public double distance() {
        double distancia = 0; 
        int dX = 0; 
        int dY = 0; 
        dX = x-0; 
        dY = y-0; 
        distancia = Math.sqrt( (dX*dX) + (dY*dY) );
        return distancia;          
    }
}


