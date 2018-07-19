package ru.geekbrains.java1.HomeWork1;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner (System.in);

    //Задание 1 и 2:
    public static void main(String[] args) {

        byte a = 63;
        short b = 2555;
        int c = 444333;
        long d = 2000450500L;
        float e = 24.66f;
        double f = 25.444444444444444493;
        boolean g = true;
        boolean m = false;
        char h = 'H';
        String x = "Переменная с текстом";

//        firstMethod();
//        method2(g, m);
//        method3();
//        method4(g);
//        method7();
        method8();

    }
    // задание 3
    private static void firstMethod(){
        System.out.println("Для вычисления значения выражения a*(b+(c/d)) введите значения а, b, c & d");
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        System.out.println("c = ");
        int c = scanner.nextInt();
        System.out.println("d = ");
        int d = scanner.nextInt();
        double result = a*c/d+b*a;
        System.out.println("a*(b+(c/d))= " +result);
    }
    // задание 4
    private static void method2(boolean g, boolean m){
        System.out.println("Проверка на принадлежность суммы А и B промежутку от 10 до 20 включительно");
        System.out.println("введите значение А");
        int a = scanner.nextInt();
        System.out.println("введите значение В");
        int b = scanner.nextInt();
        if (10<=a+b && a+b<=20 ){
            System.out.println(g);
        }else {
            System.out.println(m);
        }
    }
//     задание 5
    private static void method3 (){
        System.out.println("Проверка числа на отрицательность");
        System.out.println("Введите ваше число");
        int subzero = scanner.nextInt();
        if (subzero < 0){
            System.out.println("число отрицательное");
        } else {
            System.out.println("число положительное");
        }
    }
//     задание 6
    private static void method4 (boolean g) {
        System.out.println("Проверка числа на отрицательность");
        System.out.println("Введите ваше число");
        int subzero = scanner.nextInt();
        if (subzero < 0) {
            System.out.println(g);
        } else {
        }
    }
//      задание 7
    private static void method7 (){
            System.out.println("Введите ваше Имя");
           String s = scanner.next();

        System.out.println("Привет, " +s);
    }
//    задание 8
    private static void method8 (){
        System.out.println("Проверка года на високосность");
        System.out.println("Введите номер года");
    int a = scanner.nextInt();
        if(a%100 == 0 && a%400 != 0) {
            System.out.println("год не високосный");
        }else if(a%4 != 0 ) {
            System.out.println("год не високосный");
        }else{
            System.out.println("Год високосный");
        }


    }
}
