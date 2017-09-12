
public class Main {

	public static void main(String[] args) {
		
		FireMonster fuego = new FireMonster(); 
		WaterMonster agua = new WaterMonster(); 
		StoneMonster piedra = new StoneMonster(); 
		
		System.out.println(fuego.attack());
		System.out.println(agua.attack());
		System.out.println(piedra.attack());
		


	}

}
