num = int(input("Enter a numbr: "))
if num<=1:
	print("is not a prime number")
else:
	for i in range(2,num):
		if(num%i)==0:
		print("is not a prime number")
		break
	else: 
		print("is a prime numbber")