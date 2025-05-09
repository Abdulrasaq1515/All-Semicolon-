number = int(input("Enter five number :"))

while number <= 10000 and number <= 99999:

	 print("the five digit number")
	
first = number // 10000
reminder = number % 10000

second = reminder // 1000
reminder = reminder % 1000
	
third = reminder // 100
reminder = reminder % 100

fourth = reminder // 10
fifth = reminder % 10

print("number", first,second,third,fourth,fifth)

