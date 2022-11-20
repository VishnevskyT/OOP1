package oop1_exercise_2;

/*
Завдання 2
Використовуючи IDEA, створіть проєкт із пакетом. Потрібно: створити клас з ім'ям Rectangle.
У тілі класу створити два поля, що описують довжини сторін double side1, double side2. Створити
два методи, що обчислюють площу прямокутника – double areaCalculator (double side1, double side2)
 і периметр прямокутника – double perimeterCalculator (double side1, double side2). Написати програму,
  яка приймає від користувача довжини двох сторін прямокутника і виводить на екран периметр і площу.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть сторони прямокутника A та B для визначення P та S:\n");

        Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Периметр прямокутника Р = " + rectangle.perimeterCalculator(rectangle.getSide1(), rectangle.getSide2()));
        System.out.println("Площа прямокутника S = " + rectangle.areaCalculator(rectangle.getSide1(), rectangle.getSide2()));
    }
}