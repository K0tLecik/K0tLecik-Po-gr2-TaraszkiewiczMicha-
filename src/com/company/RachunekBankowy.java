package com.company;

public class RachunekBankowy
{
    private static double rocznaStopaProcentowa;
    private double saldo;

    RachunekBankowy(double saldo) {
        this.saldo = saldo;
    }

    public double obliczMiesieczneOdsetki(double saldo)
    {
        double odsetki = saldo * rocznaStopaProcentowa / 12.0D;
        this.saldo += odsetki;
        return odsetki;
    }

    public void setRocznaStopaProcentowa(double rocznaStopaProcentowa)
    {
        RachunekBankowy.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
