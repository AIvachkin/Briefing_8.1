package task18;

public class Main {

//    Создать метод, который преобразует массив объектов User (c полями name, age, phone)
//    в карту Номер телефона -> Имя пользователя

    public static void main(String[] args) {

        User[] arr = new User[5];
        arr[0] = new User("Robert", 15, "5555555");
        arr[1] = new User("Maria", 25, "5554555");
        arr[2] = new User("Oleg", 18, "5567555");
        arr[3] = new User("Olga", 43, "5589555");
        arr[4] = new User("Sergey", 32, "9855555");

        System.out.println(User.usersMap(arr));
    }
}
