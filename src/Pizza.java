public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingsPrice=150;
    private int packetPrice=20;
    private int basePizzaPrice;
    private boolean isCheeseAdded=false;
    private boolean isToppingsAdded=false;
    private boolean isTakeawayChosen=false;

    public Pizza(Boolean veg) {
        this.veg = veg;

        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void addExtraCheese(){
        isCheeseAdded=true;
        this.price+= extraCheesePrice;
    }
    public void addExtraToppings(){
        isToppingsAdded=true;
        this.price+=extraToppingsPrice;
    }
    public void takeAway(){
        isTakeawayChosen=true;
        this.price+=packetPrice;
    }
    public void getBill(){
        String bill="";
        System.out.println("base pizza: "+basePizzaPrice);
        if(isCheeseAdded){
            bill+="Extra Cheese added: "+extraCheesePrice+"\n";
        }
        if(isToppingsAdded){
            bill+="Extra Toppings added: "+extraToppingsPrice+"\n";
        }
        if(isTakeawayChosen){
            bill+="Takeaway Chosen: "+packetPrice+"\n";
        }
        bill+="Total Bill: "+this.price+"\n";
        System.out.println(bill);
    }
}
