package com.company.Zadanie12;

import java.util.LinkedList;

public class Zad3
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
        odwroc(ludzie);
        System.out.println(ludzie);
    }

    public static void odwroc(LinkedList<String> lista)
    {
        for(int i = 0, j = lista.size() - 1; i < j; i++)
        {
            lista.add(i, lista.remove(j));
        }
    }
}
