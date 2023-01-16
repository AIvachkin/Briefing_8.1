package task28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

//    Напишите Java-программу для итерации объекта типа HashMap с использованием цикла while и улучшенного цикла for

    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>(Map.of(
                "vvv", 1,
                "aaa", 2,
                "fgd", 3,
                "ret", 4


        ));

        Iterator<Map.Entry<String, Integer>> iter = mapa.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            System.out.println(entry.getKey());
        }

        for (Map.Entry<String, Integer> entry :
                mapa.entrySet()) {
            System.out.println(entry.getKey());

        }
    }

}
