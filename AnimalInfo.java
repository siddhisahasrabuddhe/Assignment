
class Animal
{
	void shout()
	{
		System.out.println("Animal Shouting...");
	}
}

class Dog extends Animal
{
	void shout()
	{
	System.out.println("Dog is barking...");
	}
}
class Hourse extends Animal
{
	void shout()
	{
	System.out.println("Hourse is Neighing...");
	}
}
class Cat extends Animal
{
	void shout()
	{
	System.out.println("Cat is meowing...");
	}
}
public class AnimalInfo {

	public static void main(String[] args) {

Animal a=new Animal();
a.shout();
Dog d= new Dog();
d.shout();
Hourse h=new Hourse();
h.shout();
Cat c=new Cat();
c.shout();
	}

}
