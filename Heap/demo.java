package java2021.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 大堆，小堆
 * 1.逻辑上是二叉树
 * 2.本质上为一个数组
 * 3.每个元素<=它的两个孩子
 * 4.如果数组有序，一定是一个堆
 * 作用：快速找到一组元素中的最大/小值
 *
 *long[] array, int size，int index
 *
 * 向下调整（只有一个位置破坏堆的性质，其他满足）
 * 1.判断index是不是叶子
 *     是，结束
 *     否
 *     2，取index两个孩子中最小的一个min
 *      min>=array[index]
 *     结束
 *     3.交换[index]与【minindex]
 *     4.让index=mindex
 *
 */
public class demo {
    public static void heapify(long[] array, int size, int index) {
        while (true) {
            int leftIndex = 2 * index + 1;
            if (leftIndex >= size) {
                //叶子节点
                return;
            }
            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;
            if (rightIndex < size && array[rightIndex] < array[leftIndex]) {
                minIndex = rightIndex;

            }
            if (array[index] <= array[minIndex]) {
                return;
            }

            long t = array[index];
            array[index] = array[minIndex];
            array[minIndex] = t;

            index = minIndex;
        }
    }

    /**
     * 1.先找到最后一层parents节点【size-2]/2
     * 从上往下
     *
     */
    public static void createHeap(long[] array,int size){
        int lastchildIndex=size-1;
        int lastParentIndex=(size-1)/2;
        for(int i=lastParentIndex;i>0;i--){
            heapify(array,size,i);
        }
    }

    public static void main(String[] args) {
        long[] array = {100, 3, 50, 4, 7, 60, 70, 8, 9, 12, 13, 65, 66, -1, -1, -1, -3};
        int size = 13;
        heapify(array, size, 0);
        System.out.println(Arrays.toString(array));
    }

    /**
     * PriorityQueue内部是小堆，返回最小的元素
     * 可用方法 ：入队列add(e)
     * 查看队首元素element()
     * 出队列remove()
     *
     * 元素与元素之间可以比较的前提是：
     * 1.元素具备自然顺序：元素的类实现了Comparable接口
     * 2.传给优先级队列一个比较器PriorityQueue
     * PriorityQueue(PriorityQueue<元素类型>)
     */

}
