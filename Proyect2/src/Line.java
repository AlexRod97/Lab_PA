
public class Line {

    private Point begin = new Point(); 
    private Point end = new Point(); 
    private int [] XY = new int[2]; 
     
    public Line(int x1, int y1, int x2, int y2) {
        begin.setX(x1); 
        begin.setY(y1); 
        end.setX(x2); 
        end.setY(y2);        
    }    
    
    public Line(Point begin1,Point end1) {
        begin = begin1; 
        end = end1;         
    }
    
    public Point getBegin() {
        return begin; 
    }
    
    public void setBegin(Point begin1) {
        begin = begin1;
    }
    
    public Point getEnd() {
        return end;
    }
    
    public void setEnd(Point end1) {
        end = end1;
    }
    
    public int getBeginX () {
        return begin.getX(); 
    }
    
    public void setBeginX(int x) {
        begin.setX(x);         
    }
    
    public int getBeginY() {
        return begin.getY();
    }
    
    public void setBeginY(int y) {
         begin.setY(y); 
    }
    
   /*  public int[] getBeginXY()  {                
        return (XY);        
    }
    
    public void setBeginXY(int x, int y) {
        XY[0] = x; 
        XY[1] = y; 
    }
    */ 
      
    public int getEndX() {
        return end.getX(); 
    }
    
    public void setEndX(int x) {
        end.setX(x); 
    }
    
    public int getEndY() {
        return end.getY(); 
    }
    
    public void setEndY(int y) {
        end.setY(y);
    }
    
    /* 
     public int[] getEndXY()  {                
        return (XY);        
    }
    
    public void setEndXY(int x, int y) {
        XY[0] = x; 
        XY[1] = y; 
    }      
     */
    
     public String toString () {
        return ("Line [begin=(" + begin.getX() + "," + begin.getY() + "), end=(" + end.getX() + "," + end.getY() + ")]");
    }
    
    
}
