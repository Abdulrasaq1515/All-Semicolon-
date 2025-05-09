number1 = int(input("enter the number :"))
number2 = int(input("enter the number :"))
number3 = int(input("enter the number :"))

sum = number1+number2+number3
average = number1+number2+number3 / 3
product = number1*number2*number3
largest = number1
smallest = number1
if number2 < smallest:
	smallest = number2
if number3 < smallest:
	smallest = number3
if number2 > largest:
	largest = number2
if number3 > largest:	
	largest = number3
print("sum", sum)
print("average",average)
print("product",product)
print("largest", largest)
print("smallest",smallest)
	
		
	
