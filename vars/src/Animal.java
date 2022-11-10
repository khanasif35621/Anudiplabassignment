class Animal
{
	public void animalSound()
	{
		System.out.println("The animal makes a sound");
	}
	}
class Pig extends Animal
{
	public void animalSound()
	{
		super.animalSound();
		{
			System.out.println("The pig says: wee wee");
		}
	}
	class Dog extends Animal
	{
		public void animalSound()
		{
			System.out.println("The dog says: wow wow");
}
	}
	class Main {public static void main(String[]args)
		{
		Animal myAnimal=new Animal();
		Animal myPig=new Pig();
		//Animal myDog=new Dog();
		myAnimal.animalSound();
		myPig.animalSound();
		//myDog.animalSound();
		}
	}
	
}
