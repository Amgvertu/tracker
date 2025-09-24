package ru.tracker.input;

public class ValidateInput extends ConsoleInput {
    @Override
    public int askInt(String question) {
        boolean isValid = false;
        int value = -1;
        while (!isValid) {
            try {
                value = super.askInt(question);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите корректные данные");
            }
        }
        return value;
    }
}
