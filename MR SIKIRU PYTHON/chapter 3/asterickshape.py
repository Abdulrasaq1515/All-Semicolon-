print("A")
for num in(0,10,1):
 for num1 in(0,10+num):
   print("*",end="")
 print()

print("B")

for count in range(0,10):
  for counter in range(0,10-count):
    print("*",end="")
print()

'''
	System.out.println("C");
	
	for(int h = 10; h >= 1;h--){
		if(h == 9) System.out.print(" ");
		if(h == 8) System.out.print("  ");
		if(h == 7)	System.out.print("   ");
		if(h == 6) System.out.print("    ");
		if(h == 5) System.out.print("     ");
		if(h == 4) System.out.print("      ");
		if(h == 3) System.out.print("       ");
		if(h == 2) System.out.print("        ");
		if(h == 1) System.out.print("         ");
		
		for(int i = 0; i < h;i++){
		
			System.out.print("* ");
		}
		System.out.println();
	}
'''

