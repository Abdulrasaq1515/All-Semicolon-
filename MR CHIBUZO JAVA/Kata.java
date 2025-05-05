public class Kata{
//1
	public static float divide(float number1, float number2){
		
		return number1/number2;
	} 
//2
	public static boolean isPrimeNumber(int number){
		
		int counter = 0;
		for( int count = 1 ; count <= number; count++){
				if(number % count == 0 ){
					++counter;}
		}
				 if(counter == 2){
				 	return true;
				}
		return true;
				else{
					return false;
					}
	}
	
//3	

	public static boolean isEven(int number){
	
	if(number % 2==0){
		return true;
	  }
	else if(number % 2 != 0){
		return false;
	  }
	  return true;
	}
	
//4	

	public static int factorsOfNumber(int number){
	int counter = 0;
	for (int count = 1; count <= number; count++){
		if(number % count == 0){
			counter++;
		}
		}
		return counter;
	}
//5	

	 public static int subtract(int number1, int number2){
	int positiveDifference = 	Math.abs(number1-number2);
		return positiveDifference;
	}
//6	

	 public static long factorialOfNumber(long number){
		int count = 1;
		int factorial = 1;
	while(count <= number){
		factorial = factorial * count;
		count++;
	}
	return factorial;
	}
//7

	public static boolean isPalindrome(int number){
	int sum = 0;
	int reversed = 0;
	int tempNumber = number;

	while(number > 0){
		reversed = number % 10;
		sum = (number * 10) + reversed;
		number = number / 10;
		}
		if(tempNumber == number){}
	
		return true;
	}
//8

	 public static long squareOf(int number){
	int squareNumber = number * number;
		return squareNumber;
	}
//9

	public static boolean isSquare(int number){
	
	double squareOf = Math.sqrt(number);
	
	if(number == squareOf){	
		return true;
		}
	else{
		return false;}	
	
	}
	}
