
public class Student {
   private int numCourses = 0; 
   private String[] courses = {}; 
   private int[] grades = new int[numCourses]; 
    Person estudiante = new Person(" "," "); 
    
   public Student (String name, String address) {
        estudiante.setName(name); 
        estudiante.setAddress(address); 
   }
   public String toString() {
       return (estudiante.getName() + "(" + estudiante.getAddress() + ")"); 
   }
   
    public void addCourseGrade(String course, int grade) {
        numCourses++;
        courses[numCourses] = course; 
        grades[numCourses] = grade;
    }
    
    public void printGrades() {
        String cadena = ""; 
        for(int i = 0; i < numCourses; i++) {
            cadena += grades[i] + ",";  
        }         
        System.out.println(cadena); 
    }
    
    public double getAverageGrade() {
        double promedio = 0.0; 
         for(int i = 0; i < numCourses; i++) {
            promedio = promedio + grades[i]; 
        }
        promedio = promedio /numCourses; 
        return promedio;        
    }
}
