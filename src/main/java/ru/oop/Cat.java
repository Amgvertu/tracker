package ru.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.print("Nickname: " + this.name);
        System.out.println("Food: " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {

        Cat gav = new Cat();
        System.out.println("Pet preferences: ");
        gav.giveNick("Barsik");
        gav.eat("kotleta");
        gav.show();
    }
}
