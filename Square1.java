package shapes;


public class Square1 implements Polygon1
{
	
public float side;

	public Square1(float side) {
	super();
	this.side = side;
}

	@Override
	public void calcArea() {
		float areaS= side*side;
		System.out.println("Area of Square: "+areaS);
		
	}

	@Override
	public void calcPeri() {
		float periS= 4*side;
		System.out.println("Perimeter of Square: "+periS);		
	}
	public static void main(String[] args) {
		
}
}