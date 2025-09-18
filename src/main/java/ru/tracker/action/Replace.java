package ru.tracker.action;

import ru.tracker.Item;
import ru.tracker.Tracker;
import ru.tracker.input.Input;
import ru.tracker.output.Output;

public class Replace implements UserAction {

    private final Output output;

    public Replace(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Изменить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Изменение заявки ===");
        int id = input.askInt("Введите id заявки, которую нужно изменить:");
        String name = input.askStr("Заявка " + id + ", будет изменена, введите имя: ");
        if (tracker.replace(id, new Item(name))) {
            output.println("Заявка успешно изменена");
        } else {
            output.println("Заявки с указанным id не существует");
        }
        return true;
    }
}
