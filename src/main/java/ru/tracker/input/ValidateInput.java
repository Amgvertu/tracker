package ru.tracker.input;

public class ValidateInput extends ConsoleInput {
    @Override
    public int askInt(String question) {
        int value = -1;
        while (value == -1) {
            try {
                value = super.askInt(question);
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите корректные данные");
            }
        }
        return value;
    }
}
