package ru.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        if (index >= 0) {
            return items[index];
        } else {
            return null;
        }
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String name) {
        Item[] rsl = new Item[size];
        int rslSize = 0;
        for (int i = 0; i < size; i++) {
            if (name.equals(items[i].getName())) {
                rsl[rslSize] = items[i];
                rslSize++;
            }
        }
        return Arrays.copyOf(rsl, rslSize);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index >= 0) {
            items[index].setName(item.getName());
            return true;
        } else {
            return false;
        }
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
            }
        }
        return rsl;
    }
}