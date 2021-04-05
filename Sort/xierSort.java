package java2021.Sort;

public class xierSort {
    /**
     * 时间复杂度（o(n^1.3-1.4)
     */
    private static void xierSort(long[] array){
        int group=array.length/2;

        while(true){
            insertSortGroup(array,group);
            if(group==1){
                break;
            }
            group=group/2;
        }
    }

    public static void insertSortGroup(long[] array,int group){
    for(int i=group;i<array.length;i++){
        long k=array[i];
        int j;
        for(j=i-1;j>=0&&array[j]>k;j=j-group){

            array[j+group]=array[j];
        }
        array[j+group]=k;
    }
}


    public static void main(String[] args) {


    }
}
