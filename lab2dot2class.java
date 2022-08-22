package Lab2dot2;

import java.util.Scanner;

public class lab2dot2class {

	/* 
	 * Computer Science 1 Spring
	 * 2-2 Sum the digits in an integer
	 * 
	 * This program first asks the user to input a three-digit number. The program then separates the individual digits of the user�s number. 
	 * Next, the program then finds the sum of the combined individual values and displays this value as the output. 
	 * Finally, the program converts the initial three-digit value inputted by the user into its binary, hexadecimal, and octal equivalents.
	 *
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);  		

		System.out.print("Please enter a three-digit integer value: ");		

		int value = input.nextInt();

		int value1and2 = value / 10; 		  

		int firstvalue = value1and2 / 10;        

		int middlevalue = value1and2 % 10;		

		int lastvalue = value % 10;          

		int newsum = firstvalue + middlevalue + lastvalue;

		System.out.println("The sum of all the digits would equal: "+ newsum);
		
		String valueconvert;
				
		valueconvert = Integer.toString(value, 2);
		 
		System.out.print("Binary: " + valueconvert);
		
		valueconvert = Integer.toString(value, 8);
		
		System.out.print("\nOctal: " + valueconvert);
		
		valueconvert = Integer.toString(value, 16);
				
		System.out.print("\nHexadecimal: " + valueconvert.toUpperCase());
		
		input.close(); 

	}

}
