amount = float(input("Enter the loan amount: "))

#the anual_rate is divided by 100 
anual_rate = float(input("Enter the annual interest rate (in decimal): "))

duration_years = int(input("Enter duration in years: "))

monthly_rate = anual_rate /12 #calculating monthly rate to determine the return value

number = duration_years * 12 #calculating the duration of payment in years 

#monthly payment formula
monthly_payment = (amount * monthly_rate * (1 + monthly_rate)**number)/((1 + monthly_rate)**number - 1)

print("the monthly payment is", round(monthly_payment ,2))