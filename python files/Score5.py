score = float(input("Enter scores: "))
total = 0
count = 1
while score != -1:
	
	total += score
	count += 1
	score = float(input("Enter scores: "))

average = total / count
print("The average scores is", average)