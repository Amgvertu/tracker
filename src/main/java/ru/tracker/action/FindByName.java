package ru.tracker.action;

import ru.tracker.Item;
import ru.tracker.Tracker;
import ru.tracker.input.Input;
import ru.tracker.output.Output;

public class FindByName implements UserAction {

    private final Output output;

    public FindByName(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать заявки по имени";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Поиск заявок по имени ===");
        String name = input.askStr("Введите имя заявки:");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            output.println("Заявки подходящие под критерии поиска:");
            for (Item item : items) {
                output.println(item);
            }
        } else {
            output.println("Заявки с указанным именем не существует");
        }
        return true;
    }
}
