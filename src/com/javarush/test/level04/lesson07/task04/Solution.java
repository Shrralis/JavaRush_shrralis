package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[3];

        int below = 0, above = 0;

        for (int i = 0; i < 3; i++) {
            if ((a[i] = Integer.parseInt(reader.readLine())) > 0) above++;
            else below += a[i] < 0 ? 1 : 0;
        }

        System.out.println("количество отрицательных чисел: " + below);
        System.out.println("количество положительных чисел: " + above);
    }
}
