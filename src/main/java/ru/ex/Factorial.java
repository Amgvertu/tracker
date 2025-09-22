package ru.ex;

public class Factorial {
    public int calc(int number) {
        if (number < 2) {
            throw new IllegalArgumentException("Аргумент должен быть не меньше 2");
        }
        int result = 1;
        for (int index = 2; index <= number; index++) {
            result *= index;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().calc(0));
    }
}
