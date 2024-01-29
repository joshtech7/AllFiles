unit = int(input("Enter your unit bill:\n "))

if unit <= 100:

	print('no charges')
elif unit > 100 and unit < 200:
	amount = (unit-100)*10
else:
	unit = unit-100
	amount = (100*10)+(unit-100)*20
	print("amount"+amount)