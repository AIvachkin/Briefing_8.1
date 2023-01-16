package task27;

import java.util.HashMap;

public class Task27 {


//    Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap

    public static void main(String[] args) {

        String a = "Соображения высшего привет порядка,а также выбранный привет нами инновационный путь.";


//        List<String> b = a.chars()
//                .filter(Character::isLetter)
//                .mapToObj(i->String.valueOf((char)i))
//                .collect(Collectors.toList());


        String[] b = a.toLowerCase().split("[ ,.!]");

        HashMap<String, Integer> mapa = new HashMap<>();

        for (int i = b.length - 1; i >= 0; i--) {
            String item = b[i];
            if (mapa.containsKey(item)) {
                mapa.put(item, mapa.get(item) + 1);
            } else {
                mapa.put(item, 1);
            }
        }


        String query = "привет";

        System.out.println("количество повторений искомого слова - " + mapa.get(query));


    }
}



