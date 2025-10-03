package ru.early;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new NullPointerException("Password can't be null");
        }
        if ((password.length() < 8) || (password.length() > 32)) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (!isUpperCaseContain(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!isLowerCaseContain(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!isDigitContain(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!isSpecialSymbolContain(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (isForbiddenContain(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }

        return password;
    }

    private static boolean isUpperCaseContain(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean isLowerCaseContain(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDigitContain(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSpecialSymbolContain(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
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

