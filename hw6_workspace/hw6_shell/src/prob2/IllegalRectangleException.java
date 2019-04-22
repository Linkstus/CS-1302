package prob2;

public class IllegalRectangleException extends RuntimeException{
	protected double width;
	protected double height;
	protected double area;
	
	IllegalRectangleException(String message, double width, double height, double area){
		super(message);
		this.width = width;
		this.height = height;
		this.area = area;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return area;
	}
	
	
}
