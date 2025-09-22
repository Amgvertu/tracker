package ru.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
            }
        }
        return result;
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

