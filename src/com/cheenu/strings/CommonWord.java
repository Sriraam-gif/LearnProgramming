package com.cheenu.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** This program takes a paragraph and returns the word which occurs the most in the given paragraph.
 *
 *
 * Precondition: 1) There shouldn't be a space after a comma, full stop, semi colon etc.
 * 2) There should be a full stop at the end of a string.
 * 3) The code is case sensitive.
 *
 * Postcondition: The program returns the word which occurs often in a given paragraph.
 *
 *
 * @author sriraam
 */
public class CommonWord
{
    public static void main(String[] args)
    {
        String word="Dantes";
        String para1="Partial fraction decomposition is the process of starting with the simplified answer and taking it back apart,of decomposing the final expression into its initial polynomial fractions.";
        String para = "In 1815,Edmond Dantes,a young merchant Sailor who has recently been granted the succession of his captain Leclère,returns to Marseille to marry his Catalan fiancée Mercédès.";
        long start=System.currentTimeMillis();
        System.out.println("Word Occuring the most: "+CommonWord(para1));
        long end=System.currentTimeMillis();
        System.out.println("Time taken: "+(end-start)+" milliseconds");

    }
    public static boolean DoesWordOccurInPara(String para, String word)
    {

         int a=0;
        for(int i=0; i<para.length(); i++)
        {
            char cur=para.charAt(i);
            if(Character.isWhitespace(cur) || cur==',' || cur=='.' || cur==';' || cur==':' || cur=='-' || cur=='(' || cur==')')
            {
                String split=para.substring(a, i);
                if(split.equals(word))
                {
                    return true;
                }
                else
                    {
                    a = i + 1;
                }
            }
        }
        return false;
    }
    public static String CommonWord(String para)
    {
        int a = 0;
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < para.length(); i++)
        {
            char cur = para.charAt(i);
            if(Character.isWhitespace(cur) || cur==',' || cur=='.' || cur==';' || cur==':' || cur=='-' || cur=='(' || cur==')')
            {
                String split = para.substring(a, i);
                list.add(split);
                a = i + 1;
            }
        }

        List<Integer> numbers = new ArrayList<Integer>();
        for (int j = 0; j < list.size(); j++)
        {
            int count = 0;
            for (int k = 0; k < list.size(); k++)
            {
                String k1=list.get(k);
                String j1=list.get(j);
                if (k1.equals(j1))
                {
                    count++;
                }

            }
            numbers.add(count);
        }

      int index=getIndex(numbers);
        return list.get(index);
    }
      public static int getIndex(List<Integer> num)
      {
          int cur=0;
          int max=0;
          int index=0;
          for(int i=0; i<num.size(); i++)
          {
              max=num.get(i);
              if(max>cur)
              {
                  cur=max;
                  index=i;
              }
          }
          return index;
      }

}
