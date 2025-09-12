package ru.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Изменить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Изменение заявки ===");
        int id = input.askInt("Введите id заявки, которую нужно изменить:");
        String name = input.askStr("Заявка " + id + ", будет изменена, введите имя: ");
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Заявка успешно изменена");
        } else {
            System.out.println("Заявки с указанным id не существует");
        }
        return true;
    }
}
