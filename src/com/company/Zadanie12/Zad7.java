package com.company.Zadanie12;

import java.util.LinkedList;
import java.math.*;

public class Zad7
{
    public static void main(String[] args)
    {
        LinkedList<Integer> pierwsze = new LinkedList<>();
        int n = 50;
        for (int i = 0; i < n - 1; i++)
        {
           pierwsze.add(i, i + 2);
        }
        System.out.println(pierwsze);
        int x = 0;
        for (int i = 2; i < n; i++)
        {
            if(i*i > n)
            {
                break;
            }
            x = 0;
             for (int j = 0; j < pierwsze.size(); j++)
             {
                if (pierwsze.get(j) % i == 0)
                {
                   if (x == 0)
                   {
                       x++;
                   }
                   else
                   {
                       pierwsze.remove(j);
                   }
                }
             }
        }
        System.out.println(pierwsze);
    }
}
