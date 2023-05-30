package com.driver;

public class Pizza {

     private int price;
    private Boolean isVeg;
    private int cheesePrice = 80;

    private String bill;
    private int baseprice = 0;
    private boolean isToppingAdded=false;
    private static int vegbaseprice=300;
    private static int nonvegbaseprice = 400;
    private int vegToppingprice=70;
    private int nonvegToppingprice=120,TakeAwayPrice=20;
    private boolean isCheeseAdded = false;
    private int mytoppingprice;
    private boolean isTakeAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.baseprice = isVeg ? vegbaseprice: nonvegbaseprice;
       this.price=baseprice;
       this.bill="";
       this.isCheeseAdded = false;
       this.isToppingAdded = false;
       this.isTakeAway=false;

    }





    public void addExtraCheese(){
     if(isCheeseAdded==false){
         isCheeseAdded = true;
         this.price+=cheesePrice;

     }

    }

    public void addExtraToppings(){
     if(!isToppingAdded){
         isToppingAdded = true;
        this.price+=isVeg==true ? vegToppingprice :nonvegToppingprice;
     }
    }

    public void addTakeaway(){
       if(!isTakeAway){
           isTakeAway=true;
       }
    }


        public String getBill() {

            // your code goes here
            String bill = "Base Price Of the Pizza: "+this.baseprice+"\n";
            if(this.isCheeseAdded){
                bill=bill+"Extra Cheese Added " +this.cheesePrice+"\n";
            }
            if(this.isToppingAdded){
                bill=bill+"Extra Topping Added "+this.mytoppingprice+"\n";
            }
            if(this.isTakeAway){
                bill=bill+"Paperbag Added "+this.isTakeAway+"\n";
            }
            bill=bill+"Total Price "+this.price+"\n";
            return bill;


    }
}
 private int price;
    private Boolean isVeg;
    private int cheesePrice = 80;

    private String bill;
    private int baseprice = 0;
    private boolean isToppingAdded=false;
    private static int vegbaseprice=300;
    private static int nonvegbaseprice = 400;
    private int vegToppingprice=70;
    private int nonvegToppingprice=120,TakeAwayPrice=20;
    private boolean isCheeseAdded = false;
    private int mytoppingprice;
    private boolean isTakeAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.baseprice = isVeg ? vegbaseprice: nonvegbaseprice;
       this.price=baseprice;
       this.bill="";
       this.isCheeseAdded = false;
       this.isToppingAdded = false;
       this.isTakeAway=false;

    }





    public void addExtraCheese(){
     if(isCheeseAdded==false){
         isCheeseAdded = true;
         this.price+=cheesePrice;

     }

    }

    public void addExtraToppings(){
     if(!isToppingAdded){
         isToppingAdded = true;
        this.price+=isVeg==true ? vegToppingprice :nonvegToppingprice;
     }
    }

    public void addTakeaway(){
       if(!isTakeAway){
           isTakeAway=true;
       }
    }


        public String getBill() {

            // your code goes here
            String bill = "Base Price Of the Pizza: "+this.baseprice+"\n";
            if(this.isCheeseAdded){
                bill=bill+"Extra Cheese Added " +this.cheesePrice+"\n";
            }
            if(this.isToppingAdded){
                bill=bill+"Extra Topping Added "+this.mytoppingprice+"\n";
            }
            if(this.isTakeAway){
                bill=bill+"Paperbag Added "+this.isTakeAway+"\n";
            }
            bill=bill+"Total Price "+this.price+"\n";
            return bill;


    }
}
