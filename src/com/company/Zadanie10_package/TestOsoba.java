package com.company.TestoweKolosy.Zadanie10_package;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba
{
    public static void main(String[] args)
    {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        grupa.add(new Osoba("nazw", LocalDate.of(2000, 12, 18)));
        grupa.add(new Osoba("nazw1", LocalDate.of(2000, 12, 18)));
        grupa.add(new Osoba("nazw", LocalDate.of(2001, 2, 10)));
        grupa.add(new Osoba("nazw2", LocalDate.of(2002, 12, 18)));
        grupa.add(new Osoba("Taraszkiewicz", LocalDate.of(2001, 12, 18)));
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
