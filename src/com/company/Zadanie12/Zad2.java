package com.company.Zadanie12;

import java.util.LinkedList;

public class Zad2
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
        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        liczby.add(5);
        liczby.add(6);
        liczby.add(7);
        System.out.println(liczby);
        redukuj(liczby, 3);
        System.out.println(liczby);
    }

    public static <T> void redukuj(LinkedList<T> pracownicy, int n)
    {
        for (int i = n - 1; i < pracownicy.size(); i = i + n)
        {
            pracownicy.remove(i);
        }
    }
}
