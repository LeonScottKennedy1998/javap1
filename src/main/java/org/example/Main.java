package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException
    {
        // Создаем объект класса Scanner для считывания данных с консоли от пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем количество студентов
        System.out.print("Сколько студентов будет в списке: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        // Создаем объект FileWriter и PrintWriter для записи данных в файл students.txt
        FileWriter fw = new FileWriter("students.txt");
        PrintWriter prw = new PrintWriter(fw);

        // Цикл for для считывания информации о каждом студенте и записи её в файл students.txt
        for (int i = 0; i < count; i++)
        {
            System.out.println("Введите информацию о студенте " + (i+1) + ":");

            // Запрашиваем у пользователя имя студента
            System.out.print("Имя: ");
            String name = scanner.nextLine();

            // Запрашиваем у пользователя возраст студента
            System.out.print("Возраст: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            // Запрашиваем у пользователя средний балл студента
            System.out.print("Средний балл: ");
            double srgrade = scanner.nextDouble();
            scanner.nextLine(); // Очищаем буфер после считывания числа

            // Записываем информацию о студенте в файл students.txt
            prw.println("Имя: " + name + ", Возраст: " + age + ", Средний балл: " + srgrade);
        }

        // Закрываем PrintWriter и FileWriter
        prw.close();
        fw.close();

        // Закрываем Scanner
        scanner.close();
    }
}