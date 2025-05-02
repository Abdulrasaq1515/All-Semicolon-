import java.util.Scanner;

	public class TotalProduct{

	public static void main(String[] args){

Scanner give = new Scanner(System.in);
	
	System.out.println("Enter product number");
	
	int product1 = give.nextInt(), product2 = give.nextInt();

	int totalProduct = product1 * product2;

	System.out.printf("the product sum is %d%n : " , totalProduct);



}

}