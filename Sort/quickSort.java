package java2021.Sort;

/**
 * 快速排序
 * 在待排序区间中任意选择一个数作为基准值（最左边）
 * 基准值左边的<=
 * 右边的>=
 *
 */
public class quickSort {
    public static void quickSort(long[] array){
        quickSortRange(array,0,array.length-1);
    }

    private static void quickSortRange(long[] array,int from,int to){

        int size=to-from+1;

        if(size<=1){
            return;
        }

        //1.选出基准值
        int pivotIdx=partition(array,from,to);

        //2.分割左右两个区间  基准值所在下标
        //3.分割成三部分
        //[from,基准值-1]  [基准值]  [基准值+1，to]

        //4.按照相同方式，继续处理两个区间
        quickSortRange(array, from, pivotIdx-1);
        quickSortRange(array, pivotIdx+1, to);

    }

    private static int partition(long[] array,int from,int to){
        int left=from;
        int right=to;
        long pivlt=array[from];
        while(left<right){
            while(array[right]>=pivlt&&array[right]>=pivlt){
                //不停走right
                right--;
            }
            while(array[left]<=pivlt&&array[left]<=pivlt){
                //不停走left
                left++;
            }
            //交换
            long k=array[left];
            array[left]=array[right];
            array[left]=k;
        }
        long k=array[from];
        array[from]=array[left];
        array[left]=k;

        return left;

    }

}
