package BlinovTests;

import java.io.Console;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

public class Zad11 {
    public static void main(String[] args) {

        System.out.println("Введите как Вас зовут:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Добрый день, " + name);

        System.out.println("Сколько случайных чисел вы хотите вывести?");

        int n = in.nextInt();

        int[] randomN = new int[n];

        Random num = new Random();
        for (int i = 0; i < n; i++) {
            randomN[i] = num.nextInt(1000);

        }
        for (int i = 0; i < n; i++) {
            System.out.print(randomN[i] + " ");
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println(randomN[i] + " ");
        }

        long round = round(1.25);


    }
}
