package task10;


public class Task10 {

    static int[] arr = new int[5];

    public static void main(String[] args) {


        try {
            initArr(-1, 10);
        } catch (IndexLengthException e) {
            throw new IndexLengthException("Выход за пределы массива");
        } catch (NegativeIndexException e) {
            throw new NegativeIndexException("Введено отрицательное значение индекса");
        } finally {
            System.out.println(" Финальный блок ");
        }

    }

    public static void initArr(int j, int k) throws IndexLengthException, NegativeIndexException {

        if (j >= arr.length) {
            throw new IndexLengthException();
        } else if (j < 0) {
            throw new NegativeIndexException();
        } else {
            arr[j] = k;
        }
    }
}


