
public class Person {
   private String name;
   private String address; 
    
    public Person(String nombre, String direccion) {
        name = nombre; 
        address = direccion; 
    }
    
    public String getName() {
        return name; 
    }
    
    public void setName(String nombre) {
        name = nombre;
    }
    
    public String getAddress() {
        return address; 
    }
    
    public void setAddress(String direccion) {
        address = direccion;        
    }
    
    public String toString() {
        return (name + "(" + address + ")"); 
    }
}
