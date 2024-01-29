# Input three integers from the user
num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
num3 = int(input("Enter third number: "))

# Calculate sum, average, product, smallest and largest of the numbers
total = num1 + num2 + num3
average = total / 3
product = num1 * num2 * num3
smallest = min(num1, num2, num3)
largest = max(num1, num2, num3)

# Display the results
print("Sum:", total)
print("Average:", average)
print("Product:", product)
print("Smallest:", smallest)
print("Largest:", largest)