package task11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task11 {
//    Дан массив строк. Необходимо удалить из него все дубли, а оставшиеся строки
//    объединить в одну в порядке следования в массиве

    public static void main(String[] args) {

        String[] arr = {"Массив", "Масло", "Солнце", "Масло", "Лыжи", "Массив"};


        List<String> arr2 = Arrays.stream(arr)
                .distinct()
                .collect(Collectors.toList());

        String listStr = String.join(", ", arr2);

        System.out.println(listStr);
    }

}
