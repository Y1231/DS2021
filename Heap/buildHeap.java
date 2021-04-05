package java2021.Heap;


import java.util.Comparator;
import java.util.PriorityQueue;

public class buildHeap {
static class TianGuoComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return transform(o1)-transform(o2);
    }

    private int transform(String e){
        switch(e){
            case"Y":return 0;
            case"y":return 1;
            case"d":return 2;
            case"s":return 3;
            default:return -1;

        }
    }
}

    public static void main(String[] args) {

        Comparator<String> comparator=new TianGuoComparator();
        PriorityQueue<String> queue=new PriorityQueue<>(comparator);

        queue.add("Y");
        queue.add("y");
        queue.add("d");
        queue.add("s");

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


    }


}
