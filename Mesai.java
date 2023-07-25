

package com.mycompany.mesai;


import java.util.Scanner;
public class Mesai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Saat Çalıştın? Lütfen bir sayı değeri giriniz.");
        if (scanner.hasNextInt()) 
        { 
            int time = scanner.nextInt();

            if (time >= 1 && time <= 9) 
            {
                switch (time) 
                {
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Mesai devam ediyor.");
                        break;

                    case 3:
                        System.out.println("Öğle Arası.");
                        break;

                    case 9:
                        System.out.println("Mesai bitti.");
                        break;
                }
            } else 
            {
                System.out.println("Lütfen doğru bir time değeri giriniz (1-9).");
            }
        } else 
        {
            System.out.println("Lütfen bir sayı değeri giriniz.");
        }  
        scanner.close();
    }
}
