import java.util.Scanner;

	public class LargestMax{

	public static void main(String[] args){

	int number , max;
	int count = 0;

Scanner input = new Scanner(System.in);
	System.out.println("enter a number ");
number = input.nextInt();
	max = number;	
     while (number != 0){
	number = input.nextInt();	
	if(number > max){
	max = number;
	 count = 1;
	}
	else if(max == number){
	  count++;
	}
	
  }
	System.out.println("the largest number " + max);
	System.out.println("the occurence count of largest is : " + count);

}
}