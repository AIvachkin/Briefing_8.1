package task14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

//    Дан класс User, который содержит поля с именем и возрастом. Необходимо реализовать следующий метод:

//    1. На входе коллекция пользователей
//    2. Необходимо удалить все дубли (одинаковое имя и возраст)
//    3. Отсортировать по возрасту и имени
//    4. Вернуть самого старого пользователя



    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Robert", 30));
        users.add(new User("Maksim", 25));
        users.add(new User("Maksim", 22));
        users.add(new User("Oleg", 34));
        users.add(new User("Andrew", 40));
        users.add(new User("Maksim", 25));




        User.oldestUser(users);
    }
}
