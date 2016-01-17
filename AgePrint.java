// Michelle Zhong
// December 26, 2015
/* produces the next 5 ages in 10 years, given an age and name */ 

import java.util.Scanner; 

public class AgePrint { 
	public static void main(String[] args) { 
		
		String name; 
		int age; 
		Scanner input = new Scanner(System.in); 

		name = input.nextLine(); 
		age = input.nextInt(); 
		input.close(); 
	
		int gap = 10; 

		System.out.println("Your name is  " + name + "; Your age is " + age);

		for (int i = 0; i < 5; i++) { 
		
		System.out.println(name + ", you will be " + (age + gap + i) + " years old in "
			+ (gap + i) + " years.");
		}
		
	}
}
