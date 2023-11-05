package Var1;


class Animal {
	public void animalSound()
	{
		System.out.println("The animal makes a sound");
	
	}
}
class Lion extends Animal {
	public void animalSound() {
		System.out.println("The lion is roar");
		
	}
}
class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog is bark");
	}
}
class Cat extends Animal {
	public void animalSound() {
		System.out.println("The cat is Meaw");
	}
}
public class Class30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal voice = new Animal();
Animal voice1 = new Lion();
Animal voice2 = new Dog();
Animal voice3= new Cat();
voice.animalSound();
voice1.animalSound();
voice2.animalSound();
voice3.animalSound();


	}

}

