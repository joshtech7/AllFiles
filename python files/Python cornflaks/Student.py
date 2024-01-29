number_of_student_pass = 0
number_of_student_fail = 0

student = int(input("Enter your score somto: "))

while(student != -1):
	
	if student >= 45:
	 number_of_student_pass += 1
	if student < 45:
	 number_of_student_fail += 1
	student = int(input("Enter your score somto: "))
	
print("number_of_student_pass is: ", number_of_student_pass)
print("number_of_student_fail is: ", number_of_student_fail) 

















