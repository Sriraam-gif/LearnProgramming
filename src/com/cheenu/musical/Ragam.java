package com.cheenu.musical;
import java.util.*;

/**
 *  This program enters a number n from 1 to 72 and gives all the swaras the n ragam has
 *
 * @author sriraam
 */
public class Ragam
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
