package Classes;
import Classes.Node;
import Classes.LinkedPositionalList;


public class Main {

	public static void main(String[] args) {
		LinkedPositionalList<String> poList = new LinkedPositionalList<>(); 
		Position<String> p0, p1,p2,p3,p4; 
		
		p0 = poList.addFirst("g"); 
		p1 = poList.addAfter(p0, "f"); 
		p2 = poList.addAfter(p1, "b"); 
		p2 = poList.addAfter(p2, "c"); 
		p2 = poList.addAfter(p2, "d"); 
		p3 = p2; 
		poList.addAfter(p3, "e"); 
		
		System.out.println("punteros--------------------");
		System.out.println(p1.getElement());
		System.out.println(p2.getElement());
		System.out.println(p3.getElement());
		System.out.println("Listado---------------------");
		String recorrer = null;
		
		 do{
	            try{
	                Position<String> tempPosition = poList.first();
	                recorrer = poList.remove(tempPosition);
	                System.out.println(recorrer);
	            }
	            catch(Exception e){
	                System.out.println("Fin de la Lista");
	                recorrer =null;
	                break;
	            }
	        }while(recorrer != null);   
	}

}
