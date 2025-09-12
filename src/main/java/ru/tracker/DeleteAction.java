package ru.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Удаление заявки ===");
        int id = input.askInt("Введите id заявки, которую нужно удалить:");
        if (tracker.delete(id)) {
            System.out.println("Заявка успешно удалена");
        } else {
            System.out.println("Заявки с указанным id не существует");
        }
        return true;
    }
}
