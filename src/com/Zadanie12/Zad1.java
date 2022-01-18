package com.company.Zadanie12;

import java.util.LinkedList;

public class Zad1
{
    public static void main(String[] args)
    {
        LinkedList<String> ludzie = new LinkedList<>();
        ludzie.add("człowiek1");
        ludzie.add("człowiek2");
        ludzie.add("człowiek3");
        ludzie.add("człowiek4");
        ludzie.add("człowiek5");
        ludzie.add("człowiek6");
        ludzie.add("człowiek7");
        System.out.println(ludzie);
        redukuj(ludzie, 3);
        System.out.println(ludzie);
    }

    public static void redukuj(LinkedList<String> pracownicy, int n)
    {
        for (int i = n - 1; i < pracownicy.size(); i = i + n)
        {
            pracownicy.remove(i);
        }
    }
}
