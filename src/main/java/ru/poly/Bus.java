package ru.poly;

public class Bus implements Transport {

    private double price;

    @Override
    public void drive() {
        System.out.println("Автобус едет...");
    }

    @Override
    public void passenger(int passengers) {
        System.out.println("В автобусе " + passengers + "пассажиров...");
    }

    @Override
    public double refuel(double fuel) {
        return this.price * fuel;
    }
}
