package java2021.Sort;

import java.util.Arrays;
import java.util.Random;

public class sort {
    private static void swap(long[] array,int i,int j){
        long k = array[i];
        array[i] = array[j];
        array[j] = k;
    }

    public static void bubbleSort(long[] array){
        /**
         * 最好时间复杂度：O(N)
         * 最坏时间复杂度：O(N^2)
         * 平均时间复杂度：O(n^2)
         *
         * 能否保证稳定性：可以
         * 空间复杂度O(1)
         */
        //8 5 9 4
        //5 8 9 4
        //控制比较次数
        for (int i = 0; i < array.length - 1; i++) {
            // 无序区间: [0, array.length - i)

            // 每次冒泡过程之前，都假设数组已经有序
            boolean sorted = true;

            // 执行一次冒泡过程 —— 需要比较无序区间元素的次数 - 1 次
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j , j + 1);
                    sorted = false;
                }
            }

            if (sorted) {
                // 假设成立，无序区间确实已经有序了
                return;
            }
        }
    }

    public static void selectSort(long[] array){
        /**
         * 不区分最好最坏情况
         * 平均时间复杂度：O(n^2)
         *
         * 能否保证稳定性：不可以
         * 空间复杂度O(1)
         */
        for(int i=0;i<array.length-1;i++){
            int maxIndex=-1;
            for(int j=0;j<array.length-i;i++){
                if(maxIndex==-1||array[j]>array[maxIndex]){
                    maxIndex=i;
                }
            }
            swap(array,maxIndex,array.length-i-1);
        }
    }

    public static void insertSort(long[] array){
        /**
         * 最好时间复杂度：O(N)
         * 最坏时间复杂度：O(N^2)
         * 平均时间复杂度：O(N^2)
         *
         * 能否保证稳定性：可以
         * 空间复杂度O(1)
         */
        for(int i=1;i<array.length;i++){
            long k=array[i];
            int j;
            for(j=i-1;j>=0&&array[j]>k;j--){
                if(array[j]>k){
                    break;
                }else if(array[j]==k){
                    break;
                }else{

                }
                array[j+1]=array[j];
            }
            array[j+1]=k;
        }
    }
    public static void main(String[] args) {

       /* long[] array={3,7,2,5,6,2};
        //bubblesort(array);
        insertSort(array);
        //selectSort(array);
        System.out.println(Arrays.toString(array));*/

        long[] array=buildArray(10);

        long[] array2=array.clone();

        Arrays.sort(array);

        bubbleSort(array);

        System.out.println(Arrays.equals(array, array2));
    }
    private static Random random=new Random(20210331);

    private static long[] buildArray (int n) {
        long[] array=new long[n];
        for (int i=0;i<n;i++){
            array[i]=random.nextInt(2*n);
        }
        return array;
    }
}

