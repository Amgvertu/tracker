package ru.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Показать заявки по имени";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Поиск заявок по имени ===");
        String name = input.askStr("Введите имя заявки:");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            System.out.println("Заявки подходящие под критерии поиска:");
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с указанным именем не существует");
        }
        return true;
    }
}
