import java.util.*;

public class MakePack {
	public static void main (String [] args) {
	
	//uses Dog custom constructor
	Dog rover = new Dog ("Beagle");
	// OR in 2 steps:
	Dog chewy=new Dog();
	chewy.setBreed("Chihuahua");
	
	//default constructor
	Wolf wolfee=new Wolf();
	
	System.out.println("Is rover domesticated: " + rover.getDomestic());
	System.out.println("Is chewy domesticated: " + chewy.getDomestic());
	System.out.println("Is wolfee domesticated: " + wolfee.getDomestic());
	
	
	}
}