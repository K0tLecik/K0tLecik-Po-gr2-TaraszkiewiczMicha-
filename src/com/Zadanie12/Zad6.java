package com.company.Zadanie12;

import java.util.Stack;

public class Zad6
{
    public static void main(String[] args)
    {
        Stack<Integer> liczby = new Stack<>();
        int liczba = 2015;
        while (liczba > 0)
        {
            liczby.add(liczba%10);
            liczba /= 10;
        }
        while(!liczby.isEmpty())
        {
            System.out.println(liczby.pop());
        }
    }
}
