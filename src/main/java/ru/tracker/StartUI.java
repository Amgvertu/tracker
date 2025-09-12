package ru.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Выбрать: ");
            if (select == 0) {
                createItem(input, tracker);
            } else if (select == 1) {
                findAllItems(tracker);
            } else if (select == 2) {
                replaceItem(input, tracker);
            } else if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 4) {
                findItemById(input, tracker);
            } else if (select == 5) {
                findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
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
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Показать заявку по id ===");
        int id = input.askInt("Введите id заявки:");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявки с указанным id не существует");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Удаление заявки ===");
        int id = input.askInt("Введите id заявки, которую нужно удалить:");
        if (tracker.delete(id)) {
            System.out.println("Заявка успешно удалена");
        } else {
            System.out.println("Заявки с указанным id не существует");
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Изменение заявки ===");
        int id = input.askInt("Введите id заявки, которую нужно изменить:");
        String name = input.askStr("Заявка " + id + ", будет изменена, введите имя: ");
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Заявка успешно изменена");
        } else {
            System.out.println("Заявки с указанным id не существует");
        }
    }

    public static void findAllItems(Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            System.out.println("=== Вывод всех заявок ===");
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Создание новой заявки ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    private void showMenu() {
        String[] menu = {
                "Добавить новую заявку", "Показать все заявки", "Изменить заявку",
                "Удалить заявку", "Показать заявку по id", "Показать заявки по имени", "Завершить программу"
        };
        System.out.println("Меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
