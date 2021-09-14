package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("please input a word");
        String word = in.nextLine();
        String reverse = new StringBuilder(word).reverse().toString();
        if(word.toLowerCase(Locale.ROOT).equals(reverse.toLowerCase())){
            System.out.println(reverse + " is a Palindrome ");
        }else
            System.out.println(word + " is not a Palindrome ");


    }

}
