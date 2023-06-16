import java.util.Random;


public class HeapSorting {
    public static void main(String[] args) {
        int size = 7; // Задание длины массива
        int[] array = fillingArray(size); // Заполнение массива случайными числами
        printArray(array);
        getBinaryTree(array);
        System.out.println("After HeapSorting");
        heapSort(array);
        printArray(array);
    }
/*
    Заполнение случайными числами
 */
    public static int[] fillingArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(0, 100);
        }
        return array;
    }
/*
    Печать массива
 */
    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
/*
    Делаем из массива бинарное дерево
 */
    public static void getBinaryTree(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }
    }
/*
    Сам метод создания кучи
    В данном случае произойдет сортировка по-возрастанию,
    чтобы сделать сортировку по убыванию, нужно поемнять знак ">" на "<"
    во вторых половинах булевых выражений в 54 и 58 строках.
 */
    public static void heapify(int[] array, int arrayLength, int index) {
        int n = arrayLength;
        int largest = index;
        int leftLeaf = index * 2 + 1;
        int rightLeaf = index * 2 + 2;

        if (leftLeaf < n && array[leftLeaf] > array[largest]) {
            largest = leftLeaf;
        }

        if (rightLeaf < n && array[rightLeaf] > array[largest]) {
            largest = rightLeaf;
        }

        if (largest != index) {
            swap(array, index, largest);
            heapify(array, n, largest);
        }
    }
/*
    Метод сортировки
 */
    public static void heapSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            swap(array, i, 0);
            heapify(array, i, 0);
        }
    }
/*
    Метод замены значений массива
 */
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}