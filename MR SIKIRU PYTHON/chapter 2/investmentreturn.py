amount_invested = int(input("Enter the amount : "))

anual_rate = float(input("Enter the annual interest rate (in decimal): ")) / 100

duration_years1 = int(input("Enter duration in years: "))

duration_years2 = int(input("Enter duration in years: "))

duration_years3 = int(input("Enter duration in years: "))

amount_gain1 = amount_invested * (1 + anual_rate)**duration_years1

amount_gain2 = amount_invested * (1 + anual_rate)**duration_years2

amount_gain3 = amount_invested * (1 + anual_rate)**duration_years3

print("the amount have after 10 years", amount_gain1)

print("the amount have after 20 years", amount_gain2)

print("the amount have after 30 years", amount_gain3)


