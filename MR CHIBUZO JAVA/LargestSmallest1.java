import java.util.Scanner;

	public class LargestSmallest1{

	public static void main(String[] args){

Scanner give = new Scanner(System.in);

	int largest = 	0;
	System.out.println("enter number");
	int smallest = give.nextInt();

	int count = 0;

	while (count!=5){
		count++;
	System.out.println("enter number");
	int userInput  = give.nextInt();

	 if(userInput > largest ){
	       largest = userInput;
	   }
	    if(userInput < smallest){
		smallest = userInput;
	   }

     }
	System.out.println("the largest number is " + largest);	
	System.out.println("the smallest number is "+ smallest);
	
   }
}