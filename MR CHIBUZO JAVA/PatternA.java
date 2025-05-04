import java.util.Scanner;

	public class PatternA{

	public static void main(String[] args){
	int pattern;
Scanner give = new Scanner(System.in);
	System.out.print("pattern A (6)");
	 pattern = give.nextInt();

	for(int i = 1; i <= pattern; i++){
	for(int j = 1; j <= i; j++){
	System.out.print( j );
	}
	System.out.println(" ");

	}

}
}