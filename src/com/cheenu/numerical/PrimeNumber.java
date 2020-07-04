package com.cheenu.numerical;
import java.util.*;

/**
 *  This program takes a number n and computes whether n is a prime number or not
 *
 * @author sriraam
 */
public class PrimeNumber
{

    public static void main(String[] args)
    {
	// write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num=in.nextLong();
        in.close();
        long start=System.currentTimeMillis();
        String rel= version2(num);
        long end=System.currentTimeMillis();
        System.out.println(rel);
        System.out.println("Time: "+(end-start)+ " milliseconds");
    }
    public static String version2(long a)
    {
        String mol="Prime number";
        long i=2;
        double sqr=Math.pow(a, 1/2);
        long c=(long)(sqr)+1;
        while(i<=a/c)
        {
            if(a%i==0)
            {
                mol="Not prime";
                break;
            }
            if(a%2!=0)
            {
                i=i+2;
            }

        }
        return mol;

    }


    public static String version1(long a)
    {
        String mol="Prime number";
        long i=2;
        while(i<=a/2)
        {
            if(a%i==0)
            {
                mol="Not prime";
                break;
            }
            i++;
        }
        return mol;

    }

}
