package com.gokhankaplan.fordonguusluhesaplamala;

import java.util.Scanner;

public class ForDonguUsluHesaplama {
    public static void main(String[] args){

        int a,b;
        int total = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Üssünü hesaplamak istediğiniz sayıyı giriniz: ");
        a = input.nextInt();
        System.out.println("Üssü giriniz: ");
        b = input.nextInt();

        for (int i=1; i<=b; i++)
        {
            total *= a;
        }

        System.out.println("İşlem sonucu: " + total);
    }
}
