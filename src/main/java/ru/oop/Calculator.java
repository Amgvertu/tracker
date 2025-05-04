package ru.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return x / a;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int sumAllOperation(int a) {
        Calculator calculator = new Calculator();
        return sum(a) + calculator.multiply(a) + minus(a) + calculator.divide(a);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Метод sum(10): " + result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(5);
        System.out.println("Метод multiply(5): " + result);
        result = minus(3);
        System.out.println("Метод minus(3): " + result);
        result = calculator.divide(5);
        System.out.println("Метод divide(5): " + result);
        result = calculator.sumAllOperation(5);
        System.out.println("Метод sumAllOperation(5): " + result);

    }
}

