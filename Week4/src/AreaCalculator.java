class Shape{
	double area;
	double area() {
		return 0;
	}
}
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	double area() {
		return Math.PI * radius * radius;
	}
	
}
class Rectangle extends Shape{
	double length , width;
	Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	@Override
	double area() {
		return length * width;
	}
	
}
class Triangle extends Shape{
	double base,height;
	Triangle(double base,double height){
		this.base =  base;
		this.height = height;
	}
	@Override
	double area() {
		return 0.5 * base * height; 
		
	}
	
}
public class AreaCalculator {
	public static void main(String [] args) {
		Shape [] shapes = new Shape[3];
		shapes[0] = new Circle(5);
		shapes[1] = new Rectangle(5,10);
		shapes[2] = new Triangle(3,9);
		
		for(int i =0;i<shapes.length; i++ ) {
			System.out.println("Area of Shape " + (i+1) + "=" + shapes[i].area());
		}
		
	}

}
