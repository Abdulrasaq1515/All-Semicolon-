
amount_invested = int(input("enter the amount : "))

number_years = int(input("enter the number of years : "))

interest = float(input("enter the rate percentage : "))/100


for count in range(1,number_years + 1):
	compound_interest = amount_invested *(1 + interest)**count - amount_invested 
	return_investment = amount_invested + compound_interest
	print(f"the return on investment is : {return_investment:.2f}")