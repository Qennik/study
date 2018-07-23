package ru.geekbrains.java1.HomeWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        do {
            Random rand = new Random();
            int x = rand.nextInt(words.length);
            String trueword = words[x];
            System.out.println("Угадайте одно из загаданных слов: " + Arrays.toString(words));
            String answer = scanner.next();
            if (answer.equals(trueword)) {
                System.out.println("Верно, вы угадали с 1 раза!");
            } else {
                System.out.println("Не верно, совпадения букв в словах: ");
                for (int i = 0; i < trueword.length() && i < answer.length(); i++) {
                    char a = trueword.charAt(i);
                    char b = answer.charAt(i);
                    if (a == b) {
                        System.out.print(b);
                    } else {
                        System.out.print("#");
                    }

                }
                for (int cross = 0; cross < 15 - trueword.length(); cross++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            while (!(answer.equals(trueword))) {
                System.out.println("Попробуйте еще раз");
                String answer2 = scanner.next();
                if (answer2.equals(trueword)) {
                    System.out.println("Верно, вы угадали!");
                    break;
                } else {
                    System.out.println("Не верно, совпадения букв в словах: ");
                    for (int i = 0; i < trueword.length() && i < answer2.length(); i++) {
                        char a = trueword.charAt(i);
                        char b = answer2.charAt(i);
                        if (a == b) {
                            System.out.print(b);
                        } else {
                            System.out.print("#");
                        }

                    }
                    for (int cross = 0; cross < 16 - trueword.length(); cross++) {
                        System.out.print("#");
                    }
                    System.out.println();
                }
            }
            System.out.println("Хотите сыграть еще раз? 1 - да, 0 - нет.");

        }while(scanner.nextInt() == 1);

    }

}
