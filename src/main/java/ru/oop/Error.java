package ru.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Актуальная ошибка: " + active);
        System.out.println("Номер: " + status);
        System.out.println("Описание: " + message);
    }

    public static void main(String[] args) {
        Error emptyError = new Error();
        Error notFound = new Error(true, 404, "Address not found");
        Error badRequest = new Error(true, 400, "Request is not valid");
        emptyError.printInfo();
        notFound.printInfo();
        badRequest.printInfo();
    }

}
