package model.implementations;




//On a juste perimeter et surface les methodes qui nous interesse pr le rectangle ! c'est ok 
public class Rectangle extends Shape2D {

	private double length; 
	private double width; 
	
	
	public Rectangle(double length,double width){
			this.length = length; 
			this.width = width; 
		}
	

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return this.length  * this.width;
	}


	@Override
	public double peremiter() {
		// TODO Auto-generated method stub
		return 2 * (this.length + this.width);
	}


	public String toString(){
		
		//Pr eviter les concatenations de string ==> Pb de performance. Ici c'est pas tres grave
		StringBuilder sh = new StringBuilder();
		sh.append("Shape type: "+this.getClass().getName()).append(NL)
				.append(TAB).append("Length: " + this.length).append(NL)
				.append(TAB).append("Width: " + this.width).append(NL)
				.append(TAB).append("Perimiter: " + peremiter()).append(NL)
				.append(TAB).append("Surface: " + surface()).append(NL);
				
		return sh.toString();
	}


}
