package task4;

public class Main {

//    Напишите программу в текстовом редакторе, которая разделяет любую строку на две части.

    public static void main(String[] args) {

        String str = "Привет";
        int middleString1;
        int middleString2;

        if (str.length() % 2 != 0) {
            middleString1 = str.length() / 2 + str.length() % 2;
            middleString2 = middleString1 - 1;
        } else {
            middleString1 = str.length() / 2;
            middleString2 = middleString1;
        }

        char[] arrStr = str.toCharArray();
        char[] word1 = new char[middleString1];
        char[] word2 = new char[middleString2];

        for (int i = 0; i < arrStr.length; i++) {
            if (i < middleString1) {
                word1[i] = arrStr[i];
            } else if (str.length() % 2 != 0) {
                word2[i - middleString2 - 1] = arrStr[i];
            } else {
                word2[i - middleString2] = arrStr[i];
            }
        }

        String wordStr1 = new String(word1);
        String wordStr2 = new String(word2);
        System.out.println("1: " + wordStr1 + " ; 2: " + wordStr2);


//        или

        String str1 = "Приветики";
        int midString = str1.length()/2;

        String first = str1.substring(0, midString);
        String second = str1.substring(midString);
        System.out.println("1: " + first + " ; 2: " + second);
    }
}
