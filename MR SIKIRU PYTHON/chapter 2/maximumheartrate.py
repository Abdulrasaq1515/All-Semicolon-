age = int(input("Enter the user age : "))

FINAL_FORMULAR = 220

rate1 = float(input("enter the rate : "))/100
rate2 = float(input("enter the rate : "))/100

maximum_rate  = FINAL_FORMULAR - age

target_rate1 = maximum_rate *  rate1
target_rate2 = maximum_rate * rate2

range = target_rate1 - target_rate2

print("the user maximum heart rate", target_rate1)
print("the user maximum heart rate", target_rate2)
print("the heart rate range", range)