score = int(input("Enter your score: "))
if score>80 and score>100:
	print("A")
if score > 70 and score <= 80:
	print("B")
if score > 60 and score <= 70:
	print('V.good')
if score > 50 and score <= 60:
	print('Good')
if score > 40 and score <= 50:
	print('V.poor')
if score <= 40:
	print('Fail')
else :
	print('You cheated!!!')

