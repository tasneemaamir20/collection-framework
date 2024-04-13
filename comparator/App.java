package Comparator;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Bag> bag = new LinkedList<>();
        bag.offer(new Bag("skybag", "black", "trolley", 2700, 30, 4));
        bag.offer(new Bag("Fgear", "Grey", "College bag", 700, 50, 3));
        bag.offer(new Bag("Puma", "black", "laptop bag", 1700, 40, 2));
        bag.offer(new Bag("Adidas", "red", "College bag", 800, 60, 4));
        bag.offer(new Bag("Nike", "pink", "laptop bag", 600, 30, 3));
        bag.offer(new Bag("American Tou", "green", "trolley", 5400, 50, 2));
        bag.offer(new Bag("skybag", "yellow", "laptop bag", 1600, 40, 1));
        bag.offer(new Bag("skybag", "white", "trolley", 6500, 30, 4));




        // System.out.println(bag);
        System.out.println("Press 1 for dispalying the bag");
        System.out.println("Press 2 for price low to high");
        System.out.println("Press 3 for price high to low");
        System.out.println("Press 4 for Discount");
        System.out.println("Press 5 for Rating");
        int i=sc.nextInt();
        switch (i) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break; 
            case 4:
                
                break; 
            case 5:
                
                break;
            default:
                break;
        }


    }

}
