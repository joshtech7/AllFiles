attention = str(input("\t\t\t Bio-data of Dog Age\n\n\n"))
dogname = str(input("\tEnter dog name, e.g, in (human form): "))

note = str(input("\tNote: Age must be a positive number."))

dogage = int(input("\tEnter dog age, e.g in (human form): "))

if(dogage <= 2):
	dogage = 10.5 * dogage
else: dogage = 21 + (dogage-2)*4
.break
print("the Dog age is", dogage)


	
