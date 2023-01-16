package task29;

public class Main {

//    Написать программу на Java для вычисления серии чисел Фибоначчи

    public static void main(String[] args) {

        fibonacci(10);

    }

    static void fibonacci(int i) {
        int first = 0;
        int second = 1;

        if (i < 0) {
            System.out.println("Передано отрицательное число в метод");
            return;
        }

        switch (i) {
            case (1):
                System.out.println(first);
                return;

            case (2):
                System.out.println(first + ", " + second);
                return;
        }

        System.out.print(first + ", " + second);

        for (int j = 0; j < i-2; j++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
