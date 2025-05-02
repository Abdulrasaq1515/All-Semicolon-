import java.util.Scanner;

	public class RaisedToPower{

	public static void main(String[] args){

	int num1;
	int num2;
	
Scanner give = new Scanner(System.in);

	System.out.println("enter numbers  ");
	num1 = give.nextInt();
        System.out.println("enter numbers  ");
	 num2 = give.nextInt();

	int result = 1;
	System.out.print(num1+ " raised to power " + num2+ " is :" );

	while (num2 != 0){
	result = result * num1;
	--num2;
}	
	System.out.println(result);

}
}