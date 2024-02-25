public class PizzaBill {

    private int price;
    private Boolean veg;


    private int extraCheesePrice = 100;
    private int extraToppingsAdded = 150;
    private int backPackPrice = 20;

    private int basePizzaPrice;

    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isOptedForTakeAway = false;

    public PizzaBill(Boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400; //means we have non-veg pizza
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;

    }
    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppingsAdded;
    }
    public void takeAway(){
        isOptedForTakeAway = true;
        this.price += backPackPrice;
    }

    public void getBill(){
        String Bill = " ";
        System.out.println(" Pizza : " + basePizzaPrice);
        if(isExtraCheeseAdded){
            // System.out.println("Extra Cheese is also Added");
            Bill += "Extra Cheese Added" + extraCheesePrice + "\n" ; 
        }
        if(isExtraToppingsAdded){
            Bill += "Extra Toppings Added : " + extraToppingsAdded + "\n";
        }
        if(isOptedForTakeAway){
            Bill += "Take Away : " + backPackPrice + "\n";
        }
         Bill += "Your Bill is : " + this.price + "\n";
         System.out.println(Bill);

    }
    public static void main(String[] args) {    
        PizzaBill basePizza = new PizzaBill(true); //true means it's a vege pizza
        basePizza.addExtraToppings();
        basePizza.addExtraCheese();
        basePizza.getBill();
    }
    
}