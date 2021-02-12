package test;
import shapes.*;


public class TestDemo{
	
	

	public static void main(String[] args) {
		
		

		Polygon1 s= new Square1(2.5f);
		Rectangle1 r=new Rectangle1(3f,4f);
		
		s.calcArea();
		s.calcPeri();
		r.calcArea();
		r.calcPeri();
		
		
		
	}

}
