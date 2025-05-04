import java.util.Random;
	import java.util.Scanner;
		
	public class MysteryGame2{

	public static void main(String[] args){

	Random random = new Random();
	Scanner input = new Scanner(System.in);
	
	int randomNumber = random.nextInt(10);

 System.out.println("input of the user from 1-10");
	int sum = 0;
	int count = 0;
	while (count != -1){
		sum = sum + 1;
		count = count + 1;
		System.out.println("enter guess number ");
		int guessNumber = input.nextInt();
		
		 if(guessNumber == randomNumber){
			System.out.println("congratulations");
			break;		
	    }
       		else if(guessNumber > randomNumber){
		 System.out.println("it is too high");
	   }	
		else if (guessNumber < randomNumber){
		System.out.println("it is too low");
	   }

	}
		System.out.println(" number of guesses is   " +  count );
		System.out.println("the number pick " + randomNumber);


    }
}