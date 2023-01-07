package task8;

public class Main {

//    Напишите пример перехвата и обработки исключения в секции throws-метода и передачи вызывающему методу

    static int[] arr = new int[5];

    public static void main(String[] args) {

        int j = 6;

        try {
            initArr(j);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }


    }

    public static void initArr(int j) throws IndexOutOfBoundsException {

        arr[j] = 10;
    }
}
