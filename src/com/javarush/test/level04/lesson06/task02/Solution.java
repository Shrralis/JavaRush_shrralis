package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        a = a > b ? a : b;
        b = Integer.parseInt(reader.readLine());
        a = a > b ? a : b;
        b = Integer.parseInt(reader.readLine());
        a = a > b ? a : b;
        System.out.println(a);
    }
}
