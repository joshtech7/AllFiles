number = int(input("Enter an Integer to stop this operation: "))
min = 1500
max = 2730
for number in range (min, max, +1):
	if number % 7 == 0  and number%5 == 0:
		print(number,"divisible by 7 and 5")