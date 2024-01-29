public class Petrol{
	
	private String location;
	private String petrol;
	private int quantity;
	private double price;
	private double discount;

	public Petrol(String location, String petrol, int quantity, double price, double discount);

	this.location = location;
	this.petrol = petrol;
	this.quantity = quantity;
	this.price 
	public void setLocation(String location){
	this.location = location;
	}
	public String getLocation(){
	return location;
	}

	public void setPetrol(String petrol){
	this.petrol = petrol;
	}

	public String getPetrol(){
	return petrol;
	}

	public int setQuantity(int quantity){
	this.quantity = quantity;
	}

	public void getQuantity (){
	return quantity;
	}
	
	public double setPrice (double price){
	this.price = price;
	}
	public double getPrice(){
	return price;
	}

	public double setDiscount (double discount){
	this.discount = discount;
	}
	public double getDiscount(){
	discount = (discount * getprice)/100;
	return discount;
	}
	
}
	