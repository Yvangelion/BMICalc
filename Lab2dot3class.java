package Lab2dot3;

import java.util.Scanner;

public class Lab2dot3class {

	/* 
	 * Computer Science 1 Spring
	 * 2-3 Calculating the Body Mass Index (BMI)
	 *
	 * This program will calculate the Body Mass Index(BMI) of a person based on
	 * their weight and height. First the program converts the users weight from pounds 
	 * to kilograms and also converts their height in meters to inches. The BMI formula is then
	 * applied which outputs the BMI of the user.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);  	

		System.out.print("Please enter your weight in pounds: ");		

		double userweight = input.nextDouble();

		System.out.print("Please enter your height in inches: ");		

		double userheight = input.nextDouble();

		double newweight = userweight * .45359237;

		double newheight = userheight * .0254;

		double bmi = newheight * newheight;

		double newbmi = newweight / bmi;

		System.out.println("Calculated BMI: "+ newbmi);

		input.close(); 
	}

}
