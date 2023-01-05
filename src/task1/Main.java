package task1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //Дан List <String> names. Удалите первую букву из каждого имени и верните отсортированный список

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Алексей", "Андрей", "Юлия", "Павел", "Максим");

        List<String> sortedNames =
                names.stream()
                        .map(e -> e.substring(1))
                        .map(e->e.substring(0,1).toUpperCase()+e.substring(1))
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println(sortedNames);
    }
}