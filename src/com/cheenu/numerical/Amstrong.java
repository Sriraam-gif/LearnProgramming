package com.cheenu.numerical;
import java.util.*;

/**
 * This program takes a number n and computes whether n is an amstrong number or not
 *
 * @author sriraam
 */

public class Amstrong
{

    public static void main(String[] args)
    {
	// write your code here
       Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=in.nextInt();
        if(Amstrong(num)==true)
        {
            System.out.println("It's an Amstrong Number!");
        }
        else
        {
            System.out.println("It isn't an Amstrong Number");
        }
    }
    public static boolean Amstrong(int number)
    {

        int sum=0;
        int n=number;
        String a=Integer.toString(number);
        int len=a.length();
        for(int i=0; i<a.length(); i++)
        {
            char cur=a.charAt(i);
            int val=Character.getNumericValue(cur);
            sum+=Math.pow(val, len);
        }
        if(sum==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
