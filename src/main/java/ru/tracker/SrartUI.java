package ru.tracker;

import java.time.format.DateTimeFormatter;

public class SrartUI {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String itemFormatting = item.getCreated().format(formatter);
        System.out.println(itemFormatting);
        System.out.println(item);
    }
}
