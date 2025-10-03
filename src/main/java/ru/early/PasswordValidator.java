package ru.early;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if ((password.length() < 8) || (password.length() > 32)) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        isValid(password);
        return password;
    }

    private static void isValid(String password) {
        boolean isUpperCaseContain = false;
        boolean isLowerCaseContain = false;
        boolean isDigitContain = false;
        boolean isSpecialSymbolContain = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                isUpperCaseContain = true;
                continue;
            } else if (Character.isLowerCase(password.charAt(i))) {
                isLowerCaseContain = true;
                continue;
            } else if (Character.isDigit(password.charAt(i))) {
                isDigitContain = true;
                continue;
            } else if (!Character.isLetterOrDigit(password.charAt(i))) {
                isSpecialSymbolContain = true;
                continue;
            }
        }
        if (!isUpperCaseContain) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!isLowerCaseContain) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!isDigitContain) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!isSpecialSymbolContain) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (isForbiddenContain(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
    }

    private static boolean isForbiddenContain(String password) {
        for (String s : FORBIDDEN) {
            if (password.toLowerCase().contains(s)) {
                return true;
            }
        }
        return false;
    }

}

