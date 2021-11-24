package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Zadanie5
{
    public Zadanie5()
    {
    }
    public static void main(String[] args)
        {
        ArrayList<Integer> lista = new ArrayList();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        ArrayList<Integer> lista2 = new ArrayList();
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);
        ArrayList<Integer> lista3 = mergeSorted(lista, lista2);

        int i;
        for(i = 0; i <= lista3.size() - 1; ++i)
        {
            System.out.println(lista3.get(i));
        }

        reverse(lista3);

        for(i = 0; i <= lista3.size() - 1; ++i)
        {
            System.out.println(lista3.get(i));
        }

    }

    public static void reverse(ArrayList<Integer> a)
    {
        int[] arr = new int[a.size()];

        int i;
        for(i = 0; i <= a.size() - 1; ++i)
        {
            arr[arr.length - i - 1] = (Integer)a.get(i);
        }

        for(i = 0; i <= a.size() - 1; ++i)
        {
            a.set(i, arr[i]);
        }

    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a)
    {
        ArrayList<Integer> lista = new ArrayList();
        int[] arr = new int[a.size()];

        int i;
        for(i = 0; i <= a.size() - 1; ++i)
        {
            arr[arr.length - i - 1] = (Integer)a.get(i);
        }

        for(i = 0; i <= a.size() - 1; ++i)
        {
            lista.add(arr[i]);
        }

        return lista;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        new ArrayList();
        ArrayList<Integer> lista = merge(a, b);
        Collections.sort(lista);
        return lista;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> lista = new ArrayList();
        ArrayList<Integer> ktora = new ArrayList();
        int size1 = a.size();
        int size2 = b.size();
        int iterator = 0;
        if (size1 >= size2)
        {
            iterator = size2;
            ktora = a;
        }

        if (size2 >= size1)
        {
            iterator = size1;
            ktora = b;
        }

        int i;
        for(i = 0; i <= iterator - 1; ++i)
        {
            lista.add(a.get(i));
            lista.add(b.get(i));
        }

        for(i = iterator; i <= ktora.size() - 1; ++i)
        {
            lista.add(ktora.get(i));
        }

        return lista;
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        a.addAll(b);
        return a;
    }
}
