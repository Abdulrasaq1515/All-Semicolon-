import java.util.Scanner;

	public class NaturalNumber{

	public static void main(String[] args){

Scanner give = new Scanner(System.in);

	System.out.println("enter Natural number ");
	int naturalNumber = give.nextInt();

	int count = 1;
	int sum= naturalNumber + naturalNumber;

	while(count != 10){

	System.out.println("enter Natural number ");
	naturalNumber = give.nextInt();
	sum = sum + naturalNumber;
	count++;
    }
	System.out.println("the sum of the Natural number is " + sum);
}
}