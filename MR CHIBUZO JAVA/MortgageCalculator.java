import java.util.Scanner;

public class MortgageCalculator{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	System.out.println("Enter loan amount");
	
	double amount = input.nextDouble();
	
	System.out.println("Enter anual rate in decimal");
	
	double rate = input.nextDouble();
	
	System.out.println("Enter the duration in years");
	 
	int years = input.nextInt();
	
	double monthlyRate = rate/ 12;
	
	int number = years * 12;
	
	double monthlyPayment = (amount * monthlyRate * Math.pow(1 + monthlyRate,number))/(Math.pow(1 + monthlyRate, number) - 1);
	
	
System.out.printf("the monthly payment is %.2f : " , monthlyPayment );



}

}