public class PetrolPurchase{

private String location;
private String petrol;
private int quantity;
private double price;
private double discount;

public petrolPurchase(String location, String petrol, int quantity, double price, double discount);

}
public void setLocation(String location){
	this.location = location;
}
public void setPetrol(String petrol){
	this.petrol = petrol;
}
public void setQuantity(int quantity){
	this.quantity = quantity;
}
public void setPrice(double price){
	this.price = price;
}
public void setDiscount(double discount){
	this.discount = discount;
}

public String getLocation(){
	return location;
}
public String getPetrol(){
	return petrol;
}
public int getQuantity(){
	return quantity;
}
public double getPrice(){
	return price;
}
public double getDiscount(){
	return discount;
}