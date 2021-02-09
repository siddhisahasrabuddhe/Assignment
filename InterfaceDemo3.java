package day8;

interface hotdrink
{
	int price();
	String color();
}

class Coffee implements hotdrink
{

	@Override
	public int price() {
		int rate=20;
		System.out.println("price is "+rate);
		return 0;
	}

	@Override
	public String color() {
		String color="Brown";
		System.out.println("Color is "+color);
		return null;
	}
	
}

class milk implements hotdrink
{

	@Override
	public int price() {
		int rate=10;
		System.out.println("price is "+rate);
		return 0;
	}

	@Override
	public String color() {
		String color="White";
		System.out.println("Color is "+color);
		return null;
	}
	
}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		
hotdrink h= new Coffee();
h.price();

h.color();
hotdrink m= new milk();
m.price();
m.color();

	}

}
