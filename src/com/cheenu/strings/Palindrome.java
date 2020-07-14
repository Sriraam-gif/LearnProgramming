package com.cheenu.strings;

/**
 * This program takes in a word and computes whether the word given is a palindrome or not.
 *
 * PreCondition: The String can't be empty.
 *
 * Postcondition: The program will tell us whether the word is a palindrome or not.
 *
 * @author sriraam
 */

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        // write your code here

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=in.nextLine();
        long start=System.currentTimeMillis();
        if(isPalindrome(word)==true)
        {
            System.out.println("It's a palindrome!");
        }
        else
        {
            System.out.println("It isn't a palindrome.");
        }
        long end=System.currentTimeMillis();
        System.out.println("Time: "+(end-start)+" milliseconds");
    }
    public static boolean isPalindrome(String text)
    {
        String reverse=reversed(text);
        if(text.equals(reverse))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static String reversed(String a)
    {
        String p="";
        for(int i=a.length()-1; i>=0; i--)
        {
            char cur=a.charAt(i);
            p+=cur;
        }
        return p;
    }
}
