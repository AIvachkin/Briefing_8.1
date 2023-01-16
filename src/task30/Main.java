package task30;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

//    Напишите Java-программу для обхода ArrayList с использованием цикла for, while и улучшенного цикла for

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("asd");
        arr.add("asw");
        arr.add("ast");


        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        for (String str : arr) {
            System.out.println(str);
        }

        Iterator<String> iter = arr.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
