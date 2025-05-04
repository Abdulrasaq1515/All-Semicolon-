 	import java.util.Random;
	import java.util.Scanner;
		
	public class GuessNumber{

	public static void main(String[] args){

	Random random = new Random();
	Scanner input = new Scanner(System.in);
	
	int randomNumber = random.nextInt(10);
	
System.out.println("input of the user from 1-10");
	int userNumber = input.nextInt();
			
	if(randomNumber == userNumber){
		System.out.println("guess right");
} 
	 if( randomNumber != userNumber ) {		
		if(userNumber > randomNumber)
	System.out.println("it is too high");
	System.out.println("Another chance");	
}	
	if(userNumber < randomNumber){
		System.out.println("it is too low");
		System.out.println("Another chance");		
}		

	System.out.printf("the application pick %d%n  " , randomNumber);
	
}

}
	