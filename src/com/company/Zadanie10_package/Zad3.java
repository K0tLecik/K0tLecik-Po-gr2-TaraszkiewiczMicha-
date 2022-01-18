package com.company.Zadanie10_package;

import java.util.*;
import java.io.*;
import java.io.IOException;



public class Zad3
{
    public static void main(String[] args) throws IOException {

        ArrayList<String> as = new ArrayList<String>();
        File file = new File("plik.txt");
        Scanner in = new Scanner(file);
        String zdanie;
        while(file != null)// nie wiem co w pętli dać
        {
            zdanie = in.nextLine();
            as.add(zdanie);
        }

        System.out.println(as);
        Collections.sort(as);
        System.out.println(as);
    }
}
