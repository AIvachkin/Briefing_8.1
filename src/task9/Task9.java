package task9;

public class Task9 {

//    Напишите пример перехвата и обработки исключения с использованием собственных исключений

    static int[] arr = new int[5];

    public static void main(String[] args) {


        try {
            initArr(7, 10);
        } catch (MyException e) {
            throw new MyException("Выход за пределы массива");
        } finally {
            System.out.println(" Финальный блок ");
        }

    }

    public static void initArr(int j, int k) throws MyException {

        if (j >= arr.length) {
            throw new MyException();
        } else {
            arr[j] = k;
        }
    }
}
