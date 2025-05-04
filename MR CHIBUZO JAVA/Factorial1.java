import java.util.Scanner;

	public class Factorial1{

	public static void main(String[] args){

	int initialValue = 1;
	int factorial = 1;
	
Scanner give = new Scanner(System.in);

	System.out.println("enter numbers  ");

	int number = give.nextInt();

	while (initialValue <= number){

	factorial = factorial * initialValue;
	initialValue ++;
}	
	System.out.println("the factorial number is " + factorial);

}
}