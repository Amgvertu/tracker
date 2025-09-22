package ru.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && (user.getUsername().length() > 3)) {
            return true;
        }
        throw new UserInvalidException("Пользователь не валидный");
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Ivan Ivanov", true)
        };
        try {
            User user = findUser(users, "Ivan Ivanov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }
    }
}
