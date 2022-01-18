package com.company.TestoweKolosy.Zadanie10_package;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent
{
    public static void main(String[] args)
    {
        ArrayList<Osoba> grupa = new ArrayList<>();
        grupa.add(new Student("nazw", LocalDate.of(2000, 12, 18), 4.5));
        grupa.add(new Student("nazw1", LocalDate.of(2000, 12, 18), 3));
        grupa.add(new Student("nazw", LocalDate.of(2001, 2, 10), 4.1));
        grupa.add(new Student("nazw2", LocalDate.of(2002, 12, 18), 4.5));
        grupa.add(new Student("Taraszkiewicz", LocalDate.of(2001, 12, 18), 3.7));
        for (int i = 0; i < grupa.size(); i++)
        {
            System.out.println(grupa.get(i));
        }
        System.out.println("\n");
        Collections.sort(grupa);
        for (int i = 0; i < grupa.size(); i++)
        {
            System.out.println(grupa.get(i));
        }
    }
}
