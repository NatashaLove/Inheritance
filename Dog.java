public class Dog extends Canine{
	
	//private int height;
	private String breed;
	//boolean isDomestic;
	
	//default constructor (no args) - must be if create a custom constructor with args
	public Dog(){
		 height=0;
		 breed=null;
	}
	
	//constructor with argument
	public Dog (String breed){
		setBreed(breed);
		isDomestic=true;
	}
	
	public void setBreed (String breed){
		this.breed = breed;
		isDomestic=true;
	}
	
	public void setHeight(int height){
		this.height=height;
	}
	
	public int getHeight() {
		return height;
	}
	
	
}