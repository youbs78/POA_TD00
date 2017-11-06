package model.factory;

import model.implementations.Rectangle;
import model.interfaces.IShape2D;

//on peut pas la deriver == final 
public final class ShapeFactory {
	
	public static final ShapeFactory INSTANCE = new ShapeFactory();
	
	//Pr que les client n'utlise pas ShapeFactory ! personne peut faire de new 
	private ShapeFactory(){}
	
	public IShape2D createRecrangle(double length,double width){
		return new Rectangle(length,width);
	}
	
	
}
