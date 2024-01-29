language = input("Enter  your prefered language: ")

match language:
	case 'java':
		print("A java pro")
	case 'python':
		print('pythonista')
	case _:
		print('This is the default!!!')