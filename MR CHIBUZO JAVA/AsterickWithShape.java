import java.util.Scanner;

	public class AsterickWithShape{

	public static void main(String[] args){

Scanner give = new Scanner(System.in);
		System.out.println("A");
		
		
	for(int a = 1; a <= 10; a++){
	for(int b = 1; b <= a; b++){
	System.out.print("* ");
	}
	System.out.println(" ");

	}
	
	System.out.println("B");
	
	for(int f = 0; f <= 10; f++){
		for(int g = 10;g > f; g--){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	/*System.out.println("C");
	
	for(int h = 2*(10 - i); h >= 0;h--){
		for(int i = 0; i < 10;i++){
			System.out.print(" ");
		}
		for(int i = 0; i <= h; i--){
			System.out.print("* ");
		}
		System.out.println();
	}*/
	
	System.out.println("D");
		
	for(int c = 0; c < 10; c++){
		for(int d = 2*(10-c ); d >= 0; d--){
			System.out.print(" ");
		}
		for(int d = 0; d <= c; d++){
			System.out.print("* ");
		}
			System.out.println();
	}
	
	
	

}
}