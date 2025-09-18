package ru.tracker.action;

import ru.tracker.Item;
import ru.tracker.Tracker;
import ru.tracker.input.Input;
import ru.tracker.output.Output;

public class FindAll implements UserAction {

    private final Output output;

    public FindAll(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать все заявки";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            output.println("=== Вывод всех заявок ===");
            for (Item item : items) {
                output.println(item);
            }
        } else {
            output.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
