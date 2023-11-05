package Var1;


class Animal {
   
		public void  AnimalSound() {
			System.out.println("The animal makes a sound ");
			
		}
			class Lion extends Animals {
			public void animalSound() {
			System.out.println("The Lion is beep");
			}
			}
			 
			class Dog extends Animals {
			public void animalSound() {
			System.out.println("The Dog is bark");
			}
			}
			class Cat extends Animals {
			public void animalSound() {
			System.out.println("The Cat is Meaw");
			}
			}
			public class class31{
				public static void main(String[]args){
					// TODO Auto-generated method stub
			Animal voice = new Animal();
			Animal voice1 = new Lion();
			Animal voice2 = new Dog();
			Animal voice3= new Cat();
			voice.animalSound();
			voice1.animalSound();
			voice2.animalSound();
			voice3.animalSound();

		}}
			
			}
			
				
				
		

