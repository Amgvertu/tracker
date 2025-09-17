package ru.tracker;

public class DeleteAction implements UserAction {
    private final Output output;

    public DeleteAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Удаление заявки ===");
        int id = input.askInt("Введите id заявки, которую нужно удалить:");
        if (tracker.delete(id)) {
            output.println("Заявка успешно удалена");
        } else {
            output.println("Заявки с указанным id не существует");
        }
        return true;
    }
}
