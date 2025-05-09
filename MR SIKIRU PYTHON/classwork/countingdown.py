'''print("Countdown begins")
n = int(input("n"))
while n >= 1 :
    print(n) 
print("Blast off!")

while n < 1 :
	n = int(input("Enter a positive number"))'''
	
print("Countdown begins")

n = int(input("Enter a positive number: "))
while n < 1:
    n = int(input("Please enter a positive number: "))

while n >= 1:
    print(n)
    n -= 1 

print("Blast off!")