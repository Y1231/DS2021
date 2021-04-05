package java2021.Heap;

/**
 * 建堆时间复杂度o(n*log n)
 */
public class MyPriorityQueue {
    private String[] array=new String[100];
    private int size=0;

    public  void add(String e){

    }

    public String remove(){
        String e=array[0];
        array[0]=array[size-1];
        size--;

      //  shiftDown(0);

        return e;
    }


}
