package java2021.Sort;
import java.util.Arrays;
public class heapSort {

        private static void swap(long[] array, int i, int j) {
            long t = array[i];
            array[i] = array[j];
            array[j] = t;
        }

        // 没有最好/平均/最坏的情况
        // 时间复杂度: O(n * log(n))
        // 空间复杂度: O(1)
        // 不具备稳定性
        public static void heapSort(long[] array) {
            createBigHeap(array);   // O(n * log(n))

            for (int i = 0; i < array.length - 1; i++) {    // O(n * log(n))
                // 交换之前：无序区间：[0, array.length - i)
                // 交换最大的数 [0] 和无序区间的最后一个数 [array.length - i - 1]
                swap(array, 0, array.length - i - 1);   // O(1)
                // 交换完成之后：无序区间：[0, array.length - i - 1)
                // 一共 array.length - i - 1 个元素
                adjustDown(array, array.length - i - 1, 0); // O(log(n))
            }
        }

        // 建 **大** 堆：堆中的元素是 array.length 个
        private static void createBigHeap(long[] array) {
            for (int i = (array.length - 2) / 2; i >= 0; i--) {
                adjustDown(array, array.length, i);
            }
        }

        private static void adjustDown(long[] array, int size, int index) {
            while (true) {
                int leftIndex = 2 * index + 1;
                if (leftIndex >= size) {
                    return;
                }

                int rightIndex = 2 * index + 2;
                int maxIndex = leftIndex;
                if (rightIndex < size && array[rightIndex] > array[leftIndex]) {
                    maxIndex = rightIndex;
                }

                if (array[index] >= array[maxIndex]) {
                    return;
                }

                swap(array, index, maxIndex);

                index = maxIndex;
            }
        }

        public static void main(String[] args) {
            long[] array = { 9, 4, 2, 7, 3, 6, 8, 5, 0, 1 };

            heapSort(array);

            System.out.println(Arrays.toString(array));
        }
    }


