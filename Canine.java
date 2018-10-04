public class Canine{
	
	//protected vars of superclass can be used in subclasses - JUST use EXTENDS!
	protected int height;
	protected boolean isDomestic;
	protected int legs=4;
	
	
	public void setHeight(int height){
		this.height=height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public boolean getDomestic(){
		return isDomestic;
		
	}
	
}