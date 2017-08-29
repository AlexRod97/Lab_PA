
public class Teacher {
    private int numCourses = 0; 
    private String[] courses = {}; 
    Person maestro = new Person(" "," "); 
    public Teacher(String name, String address) {
        maestro.setName(name); 
        maestro.setAddress(address); 
    }
    
    public String toString() {
         return (maestro.getName() + "(" + maestro.getAddress() + ")"); 
    }
    
    public boolean addCourse(String course) {
        boolean paso = false; 
        for(int i = 0; i < numCourses; i++) {
            if (course == courses[i]) {
                paso = false; 
            }
            else {
                return true;
            }
        }
        return paso;
    }  
    
      public boolean removeCourse(String course) {
        boolean paso = false; 
        for(int i = 0; i < numCourses; i++) {
            if (course == courses[i]) {
                paso = true; 
                courses[i] = ""; 
            }
            else {
                return false;
            }
        }
        return paso;
    } 
    
}
