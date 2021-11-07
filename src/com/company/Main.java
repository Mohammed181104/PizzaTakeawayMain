package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static double price = 0;
    public static ArrayList<String> information = new ArrayList<>();
    static String Sizes(char l){
        double[] priceSizes = {7.99, 10.99, 13.99};
        if (l == 'l'||l =='L'){
            price += priceSizes[2];
            information.add("Large");
            return "Large";
        }else if (l == 'm'||l == 'M'){
            price += priceSizes[1];
            information.add("Medium");
            return "Medium";
        }else if (l == 's'||l == 'S'){
            price += priceSizes[0];
            information.add("Small");
            return "Small";
        }else{
            return "Error. Try again";
        }
    }

    static String Toppings(String t){
        double[] priceToppings = {2.00, 5.00, 1.50, 3.56, 4.23, 9.23};
        if (t.equalsIgnoreCase("fish")){
            price += priceToppings[0];
            information.add("Fish");
            return "Fish has been added to your pizza";
        }else if (t.equalsIgnoreCase("pineapple")){
            price += priceToppings[1];
            information.add("Pineapple");
            return "Pineapple has been added to your pizza";
        }else if (t.equalsIgnoreCase("anchovies")){
            price += priceToppings[2];
            information.add("Anchovies");
            return "Anchovies has been added to your pizza";
        }else if (t.equalsIgnoreCase("pepperoni")){
            price += priceToppings[3];
            information.add("Pepperoni");
            return "Pepperoni has been added to your pizza";
        }else if (t.equalsIgnoreCase("chicken")){
            price += priceToppings[4];
            information.add("Chicken");
            return "Chicken has been added to your pizza";
        }else if (t.equalsIgnoreCase("beef")){
            price += priceToppings[5];
            information.add("Beef");
            return "Beef has been added to your pizza";
        }else{
            return "Error. Try again";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What size pizza do you want? (s,m,l)");
        String sizes=Sizes(input.next().charAt(0));
        System.out.println(sizes);
        while(sizes.equals("Error. Try again")){
            System.out.println("What size pizza do you want? (s,m,l)");
            sizes=Sizes(input.next().charAt(0));
            System.out.println(sizes);
        }
        System.out.println("What toppings do you want? (ONLY PICK 2)");
        System.out.println("We have: Fish, Pineapple, Anchovies, Pepperoni, Chicken, Beef");
        String toppingOne = Toppings(input.next());
        String toppingTwo = Toppings(input.next());
        while(toppingOne.equals("Error. Try again")||toppingTwo.equals("Error. Try again")){
            System.out.println("What toppings do you want? (ONLY PICK 2)");
            System.out.println("We have: Fish, Pineapple, Anchovies, Pepperoni, Chicken, Beef");
            toppingOne = Toppings(input.next());
            toppingTwo = Toppings(input.next());
        }

        System.out.println("Your order is currently: " + information.toString());
        System.out.println("Your price is: " + price);



    }
}
