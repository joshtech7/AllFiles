public class PetrolPurchase {

    private String location;
    private String petrol;
    private int quantity;
    private double price;
    private double percentageDiscount;

    public PetrolPurchase(String location, String petrol, int quantity, double price, double percentageDiscount) {
        this.location = location;
        this.petrol = petrol;
        this.quantity = quantity;
        this.price = price;
        this.percentageDiscount = percentageDiscount;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setPetrol(String petrol) {
        this.petrol = petrol;
    }

    public String getPetrol() {
        return petrol;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double getPurchaseAmount() {
        double purchaseAmount = (getQuantity() * getPrice()) - getPercentageDiscount();
        return purchaseAmount;
    }

       public static void main(String[] args){
	
       PetrolPurchase petrolA = new PetrolPurchase("Station A", "Gas", 4, 567.00, 0.15);
       PetrolPurchase petrolB = new PetrolPurchase("Station B", "Diesil", 2, 1000.00, 0.05);

       System.out.printf("The location is: %s% The petrol type is: %s%nThe result for the net purchase is:: #%.2f", petrolA.getLocation(),petrolA.getPetrol(), petrolA.getPurchaseAmount());


       System.out.printf("The location is: %s%nThe petrol type is: %sThe result for the net purchase is:: #%.2f", petrolB.getLocation(),petrolB.getPetrol(), petrolB.getPurchaseAmount());


	
   }
}
