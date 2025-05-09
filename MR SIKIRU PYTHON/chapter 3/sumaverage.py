sum = 0
average = 0
product = 1

for number in range(0,3,1):

  number  = int(input("enter the number :"))
sum = sum + number + number + number
average = sum / number + number + number
product = product * number * number * number

largest = first
smallest = first

if second < smallest:
	smallest = second
if second < smallest:
	smallest = third
if second > largest:
	largest = second
if third > largest:	
	largest = third
print("sum", sum)
print("average",average)
print("product",product)
print("largest", largest)
print("smallest",smallest)
