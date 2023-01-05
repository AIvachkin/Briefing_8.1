package task3;

public class Main {

// Напишите программу в простом текстовом редакторе, которая проверяет, является ли строка палиндромом.

    public static void main(String[] args) {

        if (stringIsPalindrom("приоирп")){
            System.out.println("строка является палиндромом");
        } else {
            System.out.println("строка не является палиндромом");
        }


    }

    public static boolean stringIsPalindrom(String str) {
        int i1 = 0;
        int i2 = str.length() - 1;

        char[] charArr = str.toCharArray();

        while (i2 > i1) {
            if (charArr[i1] != charArr[i2]){
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
