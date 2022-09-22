//Пользователь вводит трехзначное число. Найдите:
//- Число единиц, десятков.
//- Сумму цифр
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1zad2;

import java.util.Scanner;

/**
 *
 * @author Kasutaja
 */
public class Lesson1Zad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Vvedite trekhznachnoe chislo: ");
        Scanner scanner = new Scanner(System.in);
        int zyx = scanner.nextInt();
        x = zyx % 10;
        y = (zyx - x) / 10 % 10;
        z = (zyx - y * 10 - x) / 100;
        System.out.println("Chislo edinits: " + x);
        System.out.println("Chislo desjatkov: " + y);
        System.out.println("Chislo soten: " + z);
        // 1 variant
        System.out.print("Summa tsifr ravna = ");
        System.out.print(x+y+z);
        // 2 variant
        System.out.printf("\nSumma tsifr ravna = %d%n",z+y+x);

//        System.out.println("");
        
    }

    
}
