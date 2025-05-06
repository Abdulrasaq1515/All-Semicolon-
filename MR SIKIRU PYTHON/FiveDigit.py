number = int(input("enter the number :"))

number1 = 0
number2 = 0
number3 = 0
number4 = 0
number5 = 0 

if number >= 10000:
	if number <= 99999:

		number1 = number // 10000
		reminder = number - number1 % 10000

		number2 = reminder // 1000
		reminder = reminder % 1000

		number3 = reminder // 100
		reminder = reminder % 100

		number4 = reminder // 10
		number5 = reminder % 10

print("number", number1,number2,number3,number4,number5)