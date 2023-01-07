package task7;

public class Main {

//    Напишите пример перехвата и обработки исключения в блоке try-catch метода

    public static void main(String[] args) {

        int[] arr = new int[5];
        int j = 6;

        try {
            arr[j] = 10;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        } finally {
            System.out.println(" Финальный блок ");
        }


    }

}
