def my_discount (price , discount):
 disc_price = price * discount / 100 
 result = price - disc_price
 return result



  

  
price = 150
discount = 15
result = my_discount(price , discount)
print(result)
