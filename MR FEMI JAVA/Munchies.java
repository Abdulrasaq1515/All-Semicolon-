public class  Munchies{
//1
	public static int findMultiple(int number){

	int multiplier = number * 5;
	 
	return multiplier;

	}
//2
	public static void displayPrimeNumbers(int number){
			System.out.println("generate first 50 prime number" +number+ ":");
	int counter = 0;
	for(int num = 1; num <= number; num++ ){
			counter = 0;
		for(int count = 1; count <= num ;count++){
			if(num%count == 0){
				counter++;
				}
		}
		if(counter == 2){
			System.out.print(num + " ");
			}
			
	   	 }	
	
	}

	public static int  computeSumOfNumber(int number){
		number = Math.abs(number);
		int sum = 0;
		
		while(number > 0){
		sum = sum + number % 10;
		number = number / 10;
			}
		return sum;
	}

	public static boolean  isLeapYear(int year){
	
		boolean isLeapYear = true;
		
		if(year % 4== 0){
			if(year % 100 == 0){
				if(year % 400 == 0)
					isLeapYear = true;
					
					else 
					isLeapYear = false;
			}
			
		}	
		
		return isLeapYear
	}
	
}