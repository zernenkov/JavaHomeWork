package com.pb.zernenkov.hw2;

import java.util.Scanner;
class Test {
    public static void main (String [] args) {
        System.out.print("Введите число от 0 до 100: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();

        if ( i >= 0 && i <= 14) {
            System.out.println ("Ребенок");
        }
        else if (i >= 15 && i <= 35 ) {
            System.out.println ("Молодой");
        }
        else if (i >= 36 && i <= 50 ) {
            System.out.println ("Взрослый");
        }
        else if (i >= 51 && i <= 100 ) {
            System.out.println ("Пожилой");
        }
        else {
            System.out.println ("Вы ввели число не соответствующее диапазону от 0 до 100");
        }
    }
}