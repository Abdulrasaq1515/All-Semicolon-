item_purchases = int(input("enter the amount  :"))

if	item_purchases > 1000 and item_purchases <= 10000: 
	discount_price  = item_purchases -(0.05  * item_purchases)
	print(f"the price after discount :{discount_price}")
	
elif 	item_purchases > 10000 and item_purchases <= 50000 :
	discount_price = item_purchases - (0.10 * item_purchases)
	print(f"the price after discount :{discount_price}")	

elif 	item_purchases > 50000 :
	discount_price = item_purchases - (0.20 * item_purchases)
	print(f"the price after discount :{discount_price}")	
   
	
else	:
	item_purchases < 1000 
	print("no discount")