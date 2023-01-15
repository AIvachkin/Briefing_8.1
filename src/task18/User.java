package task18;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class User {

    private String name;
    private int age;
    private String phoneNumber;

    public User(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    static Map<String, String> usersMap(User[] user) {

        return Arrays.stream(user).
                collect(Collectors.toMap(e1 -> e1.phoneNumber, e2 -> e2.name));
    }


}
