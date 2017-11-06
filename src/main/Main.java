package main;

import model.factory.ShapeFactory;
import model.interfaces.IShape2D;

public final class Main {

public static void main(String[] args){
	IShape2D rect = ShapeFactory.INSTANCE.createRecrangle(3.5d,2.3d);
	System.out.println(rect);
}
}
