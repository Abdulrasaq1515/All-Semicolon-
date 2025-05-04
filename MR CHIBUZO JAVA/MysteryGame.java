import java.util.Random;
	import java.util.Scanner;
		
	public class MysteryGame{

	public static void main(String[] args){

	Random random = new Random();
	Scanner input = new Scanner(System.in);
	
	int randomNumber = random.nextInt(10);

 System.out.println("input of the user from 1-10");
	
	int count = 0;

	while (count <= 2){
		System.out.println("enter number ");
		int userNumber = input.nextInt();
		
       		 if(userNumber > randomNumber){
		 System.out.println("it is too high");	
	   }	
		else if ( userNumber < randomNumber){
		System.out.println("it is too low");		
		
	   }

		else if(randomNumber == userNumber) {
			System.out.println("it matched!!!");
	   }
		count = count + 1;


	}
		System.out.println(" Game Over and the application pick is " + randomNumber );

    }
}
