package factoryPattern;

public class MainClass {
	public static void main(String[] args) {
		ShapeFactory shapefactory = new ShapeFactory();
		Shape getshape = shapefactory.getshape("rectangle");
		getshape.draw();
	}
}
