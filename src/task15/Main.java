package task15;

public class Main {

//    Необходимо реализовать следующий метод:
//    1. Получаем на входе массив чисел
//    2. Все четные числа увеличиваем на единицу
//    3. Возвращаем кусок списка с 3-го по 7-й элемент

    public static void main(String[] args) {

        int[] arr = {1, 2, 15, 158, 7, 12, 45, 6, 10, 11, 19};

        int[] newArr = convertArr(arr);

        for (int j : newArr) {
            System.out.println(j);
        }

    }

    static int[] convertArr(int[] arr) {
        int[] convArr = new int[5];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                arr[i]++;
            }

            if (i >= 2 && i <= 6) {
                convArr[i - 2] = arr[i];
            }

        }
        return convArr;
    }
}
