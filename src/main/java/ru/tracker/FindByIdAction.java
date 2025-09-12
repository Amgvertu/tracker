package ru.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Показать заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Показать заявку по id ===");
        int id = input.askInt("Введите id заявки:");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявки с указанным id не существует");
        }
        return true;
    }
}
