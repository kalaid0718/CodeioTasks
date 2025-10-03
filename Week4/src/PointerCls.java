class Point{
	int x,y;
	
	public Point(int x, int y) {
		this.x= x;
		this.y = y;
		
	}
	public Point(Point other) {
		this.x = other.x;
		this.y = other.y;
	}
	void show() {
		System.out.println("Point(" + x + " ," + y + ")");
	}
}
public class PointerCls {
	public static void main(String[] args) {
		Point p1 = new Point(5,10);
		Point p2 = new Point(p1);
		Point p3 = new Point(p2);
		
		System.out.println("Original Point:");
		p1.show();
		
		System.out.println("Frist Copy:");
		p2.show();
		
		System.out.println("Second Copy: ");
		p3.show();
		
		p1.x = 10;
		
		System.out.println("\nAfter Modifying p1:");
		p1.show();
		p2.show();
		p3.show();

	}

}
