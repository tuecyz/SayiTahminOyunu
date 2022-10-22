/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sayitahminoyunu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tugce
 */
public class SayiTahminOyunu {

    public static void main(String[] args) {
        int tahmin, can=5, i=0;
        Random rand=new Random();
        Scanner scan=new Scanner(System.in);
        int sayi= rand.nextInt(10);
        boolean oyundurumu=false, hata=false;
        int[] tahminler=new int[6];
        System.out.println(sayi);
        System.out.println("Sayı Tahmin Oyununa Hoş Geldiniz!");
        System.out.println("0-10 arasında bir sayı tuttum!");
        while(can>0){
            System.out.println("Tahmininiz:");
            tahmin=scan.nextInt();
            if((tahmin<0) ||(tahmin>10)){
                if(hata){
                    System.out.println("Çok fazla hatalı giriş yaptınız 1 can kaybettiniz. ");
                    System.out.println("Kalan can:"+ --can );
                }
                else{
                 hata=true;
                 System.out.println("Lütfen 0-10 arasında bir sayı giriniz!");
                }
                continue;
            }
            tahminler[i++]=tahmin;
            if(tahmin==sayi){
                oyundurumu=true;
                break;
            }
            else{
                System.out.println("Tekrar deneyiniz. Kalan can: "+ --can);
            }
        }
        if(oyundurumu){
            System.out.println("Tebrikler! Tahmininiz doğru.");
            System.out.println("Sayı:" + sayi);
            System.out.println("Kalan can:" + can);
        }else{
           System.out.println("Başaramadınız.");
        }
        System.out.println("Tahminleriniz:");
        for(int value: tahminler){
            if(value!=0){
                System.out.print(value + " , ");
            }
        }
    }
}
