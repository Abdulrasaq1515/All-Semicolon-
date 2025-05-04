import java.util.Scanner;

	public class MaxMin{

	public static void main(String []args){

Scanner give = new Scanner(System.in);

	System.out.println("Enter the integer");

	int num1 = give.nextInt(), num2 = give.nextInt();

	int sum = num1 + num2;
	int product = num1*num2;
	int difference = num1 - num2;
	int average = num1 / num2;
	int max = num1;
	int min = num2;

	System.out.println("the sum is  : " + sum);
	System.out.println("the product is  : " + product);
	System.out.println("the difference is  : " + difference);
	System.out.println("the average is : " + average);
	System.out.println("the maximum number : " + max);
	System.out.println("the minimum number : "+  min);


}

}