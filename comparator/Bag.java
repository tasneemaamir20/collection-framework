package Comparator;

public class Bag {
    private String brand,color, type;
    private double price,discount;
    private int rating;

    Bag(String brand,String color, String type,double price,double discount, int rating)
    {
        this.brand=brand;
        this.color=color;      
        this.type=type;
        this.price=price;
        this.discount=discount;
        this.rating=rating;
    }

        

         String getBrand(String brand){
            return brand;

        }

        String getColor(String color){
            return color;
        }

         String gettype(String type){
            return type;
        }

         double getPrice(double price){
            return price;
        }

         double getDiscount(double discount){
            return discount;
        }

         int getRating(int rating){
            return rating;
        }




        @Override
        public String toString() {
            return  "Bag Brand:  "+brand+"  Bag Color:  "+color+"  Bag type:  "+type+"  bag price:  "+price+"  Bag Discount:  "+discount+"  Rating:  "+rating;
        }

        // @Override
        // public boolean equals(Object obj) {
        //     return ;
        // }





}


