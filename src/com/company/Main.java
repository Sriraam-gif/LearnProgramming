package com.company;
import java.util.*;

/**
 * This is a program which takes a number n and a power p and finds the pth root of n
 *
 * @author sriraam
 */
public class Main
{

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num=in.nextDouble();
        System.out.println("What power root");
        int root=in.nextInt();
        long start=System.currentTimeMillis();
        double rel=bisec(num, root);
        long end=System.currentTimeMillis();
        System.out.println("Bisection: "+ rel);
        System.out.println("Time : "+ (end-start)+" milliseconds");


    }

    public static double bisec(double c, int d)
    {
        if(c<0 && d%2==0)
        {
            return -1;
        }
        else if(d<0)
        {
            return -1;
        }
        else if(d==0)
        {
            return 1;
        }
        else if(d==1)
        {
            return c;
        }
        else if(c>0 && d%2==1)
        {
            double low = 0;
            double high = c;
            double mid = (double) c / 2;
            double ep = 0.01;
            while (Math.abs(Math.pow(mid, d) - c) >= ep)
            {
                if (Math.pow(mid, d) < c) {
                    low = mid;
                } else {
                    high = mid;
                }
                mid = (double) (high + low) / 2;
            }
            return mid;
        }
        else if(c<0 && d%2==1)
        {
            double low = 0;
            Math.abs(c);
            double high = c;
            double mid = (double) c / 2;
            double ep = 0.01;
            while (Math.abs(Math.pow(mid, d) - c) >= ep) {
                if (Math.pow(mid, d) < c) {
                    low = mid;
                } else {
                    high = mid;
                }
                mid = (double) (high + low) / 2;
            }
            return mid*-1;
        }
        else if(c==0)
        {
            return 0;
        }
        else if(c>0 && d%2==0)
        {
            double low = 0;
            double high = c;
            double mid = (double) c / 2;
            double ep = 0.01;
            while (Math.abs(Math.pow(mid, d) - c) >= ep) {
                if (Math.pow(mid, d) < c) {
                    low = mid;
                } else {
                    high = mid;
                }
                mid = (double) (high + low) / 2;
            }
            return mid;
        }
        return 0.01;
    }
}
