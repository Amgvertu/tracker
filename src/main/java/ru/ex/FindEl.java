package ru.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                return i;
            }
        }
        throw new ElementNotFoundException("Элемент не найден");
    }

    public static void main(String[] args) {
        String[] expressions = {"хлеб", "молоко", "чай", "сушки", "колбаса"};
        try {
            indexOf(expressions, "бутерброд");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

