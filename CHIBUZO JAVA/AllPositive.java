import java.util.Scanner;

	public class AllPositive{

	public static void main(String[] args){


Scanner input = new Scanner(System.in);

	int number = 100;


	for (int i = 1; i <= number; ++i ){
	if(number % i == 0){
	System.out.println("the factor of "+ number + " are " + i);
	}
    }

}
}