package factoryPattern;

public class ShapeFactory {

	Shape getshape(String name) {

		switch (name) {
		case "circle":
			return new Rectangle();
		case "rectangle":
			return new Rectangle();

		default:
			return null;
		}
	}
}
