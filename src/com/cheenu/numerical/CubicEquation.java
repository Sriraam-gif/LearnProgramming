package com.cheenu.numerical;
import java.util.*;

/**
 * This is a program where the program takes in a cubic equation and finds one of the roots within a given range
 *
 * @author sriraam
 */
public class CubicEquation
{

    public static void main(String[] args)
    {
	// write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the X^3 coef: ");
        int three=in.nextInt();
        System.out.println("Enter the X^2 coef: ");
        int two=in.nextInt();
        System.out.println("Enter the X coef: ");
        int one=in.nextInt();
        System.out.println("Enter the constant: ");
        int zero=in.nextInt();
        System.out.println("Enter first range: ");
        double start=in.nextDouble();
        System.out.println("Enter last range: ");
        double end=in.nextDouble();
        long time=System.currentTimeMillis();
        double rels=Cubic(three, two, one, zero, start, end);
        long timee=System.currentTimeMillis();
        System.out.println(rels);
        System.out.println("Time : "+(timee-time)+" milliseconds");
    }
    public static double Cubic(int a, int b, int c, int d, double s, double e)
    {
        double ep=0.01;
        double guess=(double)(s+e)/2;
        double rel=(Math.pow(guess, 3)*a)+(Math.pow(guess, 2)*b)+(guess*c)+d;
        double srel=(Math.pow(s, 3)*a)+(Math.pow(s, 2)*b)+(s*c)+d;
        double erel=(Math.pow(e, 3)*a)+(Math.pow(e, 2)*b)+(e*c)+d;
        if(srel<0)
        {
            double temp;
            temp = s;
            s=e;
            e=temp;
        }
        while(Math.abs(rel)>=ep)
        {

            if(rel<0)
            {
                e=guess;
            }
            else
            {
                s=guess;
            }
            guess=(s+e)/2;
            rel=(Math.pow(guess, 3)*a)+(Math.pow(guess, 2)*b)+(guess*c)+d;
             srel=(Math.pow(s, 3)*a)+(Math.pow(s, 2)*b)+(s*c)+d;
             erel=(Math.pow(e, 3)*a)+(Math.pow(e, 2)*b)+(e*c)+d;
        }
        return guess;
    }


    }
