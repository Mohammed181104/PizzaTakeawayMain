package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static double price = 0;
    public static ArrayList<String> information = new ArrayList<>();
    public static int numOfToppings = 0;
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

    static void Toppings(String t){
        if (t.equalsIgnoreCase("fish")){
            information.add("Fish");
            numOfToppings ++;
            System.out.println("Fish has been added to your pizza");
        }else if (t.equalsIgnoreCase("pineapple")){
            information.add("Pineapple");
            numOfToppings ++;
            System.out.println("Pineapple has been added to your pizza");
        }else if (t.equalsIgnoreCase("anchovies")){
            information.add("Anchovies");
            numOfToppings ++;
            System.out.println("Anchovies has been added to your pizza");
        }else if (t.equalsIgnoreCase("pepperoni")){
            information.add("Pepperoni");
            numOfToppings ++;
            System.out.println("Pepperoni has been added to your pizza");
        }else if (t.equalsIgnoreCase("chicken")){
            information.add("Chicken");
            numOfToppings ++;
            System.out.println("Chicken has been added to your pizza");
        }else if (t.equalsIgnoreCase("beef")){
            information.add("Beef");
            numOfToppings ++;
            System.out.println("Beef has been added to your pizza");
        }else if (t.equalsIgnoreCase("cheese")){
            information.add("Cheese");
            numOfToppings ++;
            System.out.println("Cheese has been added to your pizza");
        }else{
            System.out.println("Error. Try again");
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
        System.out.println("What toppings do you want?");
        System.out.println("The first two toppings are free and each one after is an extra £1.25.(Type 'end' to finish your order) : ");
        System.out.println("We have: Fish, Pineapple, Anchovies, Pepperoni, Chicken, Beef, Cheese");
        while(true){
            String topping = input.next();
            if (topping.equalsIgnoreCase("end")){
                break;
            }
            Toppings(topping);
        }
        numOfToppings -= 2;
        if (numOfToppings<0){
            numOfToppings=0;
        }
        price += numOfToppings*1.25;
        System.out.println(numOfToppings);
        price = Math.round(price*100.0)/100.0;
        System.out.println("Your order is currently: " + information.toString());
        System.out.println("Your price is: £" + price);


    }
}
