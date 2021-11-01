package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static double price = 0;

    static String Sizes(char l){
        double[] priceSizes = {7.99, 10.99, 13.99};
        if (l == 'l'||l =='L'){
            price = priceSizes[2];
            return "Large";
        }else if (l == 'm'||l == 'M'){
            price = priceSizes[1];
            return "Medium";
        }else if (l == 's'||l == 'S'){
            price = priceSizes[0];
            return "Small";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What size pizza do you want? (s,m,l)");
        String sizes=Sizes(input.next().charAt(0));
        System.out.println(sizes);


    }
}
