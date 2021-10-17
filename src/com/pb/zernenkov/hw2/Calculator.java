package com.pb.zernenkov.hw2;

import java.util.Scanner;

public class Calculator {
    public static void  main (String [] args)
    {
        int operand1, operand2;
        char sign;
        float result;
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести первое целое число");
        operand1 = in.nextInt();
        System.out.println("Ввести второе целое число");
        operand2 = in.nextInt();
        System.out.println("Введите значение +, -, *, /");
        sign = in.next().charAt(0);

        try {
            switch (sign){
                case  '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case  '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    if (operand2 ==0) throw new Exception ("Делить на 0 нельзя");
                    result = operand1/operand2;
                    break;
                default:
                    throw new Exception ("Нельзя выполнить");
            }
            System.out.println("Результат выполнения операции:" + operand1 + "" + sign + "" + operand2 + " = " + result);
        }
        catch (Exception operand)
        {
            System.out.println(operand.getMessage ());
        }
    }
}
