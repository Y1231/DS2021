package java2021.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class demo_Qeque {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();

        queue.add("Y");
        queue.add("s");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue.size());
    }
}



