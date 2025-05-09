password = input("Enter your password: ")
length = len(password)

if length < 8:
    print("Very weak")
if length == 8:
    print("Weak")
if 8 < length <= 16:
    print("Strong")
else: length > 16
print("Very strong")