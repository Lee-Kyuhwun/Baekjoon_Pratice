s = input()
a =""
for i in s:
    if(i.isupper()):
        a+=i.lower()
    else:
        a+=i.upper()
print(a)