package shapes;

public class Rectangle1 implements Polygon1
{
float length, breadth;

	public Rectangle1(float length, float breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}

	@Override
	public void calcArea() {
		
		float areaR= length*breadth;
		System.out.println("Area of Rectangle: "+areaR);
	}

	@Override
	public void calcPeri() {
		float periA=2*(length+breadth);
		System.out.println("Perimeter of Rectangle: "+periA);
	}
	

	public static void main(String[] args) {
	


}
}
