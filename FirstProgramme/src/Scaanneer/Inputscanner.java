package Scaanneer;
import java.util.Scanner;
public class Inputscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we will take input from User  when we use Scanner //
		
		
				// TODO Auto-generated method stub
				System.out.println("Please enter your name,age and salery");
				Scanner scan =  new Scanner (System.in);
				String name = scan.nextLine();
				int age = scan.nextInt();
				float salery = scan.nextFloat();
				
				System.out.println("your name is "+name);
				System.out.println("your age is "+age);
				System.out.println("your salery is "+salery);
				

			}


	}


