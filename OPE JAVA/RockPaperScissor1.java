
import java.util.Scanner;

	public class RockPaperScissor1{

	public static void main(String[] args){

Scanner collect = new Scanner(System.in);

	
	System.out.println("Scissor (0) Rock (1) Paper (2)");
	int userCount = 0;
	int computerCount = 0;
	while(true){
		System.out.println("enter user number ");
		int user = collect.nextInt();
		int computer = (int)(Math.random() * 3);

		if(computer == 0 && user == 1){
			System.out.println("computer is a scissor. user is a rock. user win");
			userCount++;
		 }
	   		else if(computer == 1 && user == 1){
			System.out.println("computer is a rock. user is a rock. it a tie");
			
		 }
	 		else if(computer == 1 && user == 2){
	 		System.out.println("computer is a rock. user is a paper. user win");
	 		userCount++;
	 	}
			else if (computer == 2 && user == 2){
			System.out.println("computer is a paper. user is a paper. it a tie");
		
		}
			 else if(user == 0 && computer == 1){
			System.out.println("user is a scissor. computer is a rock. computer win");
				computerCount++;
		}
			else if(user == 1 && computer == 1){
				System.out.println("user is a rock. computer is a rock. it a tie");
			
		}
			else if(user == 1 && computer == 2){
				System.out.println("user is a rock. computer is a paper. computer win");
				computerCount++;
		}
			else if(user == 2 && computer == 2){
				System.out.println("user is a paper. computer is a paper. it a tie");
				
		}	 
			if(userCount > 2 || computer > 2 ) {
			System.out.println("the numbers of USER wins " + userCount);
			System.out.println("the numbers of COMPUTER wins " + computerCount);
			break;
		}	
  }


	
}
}