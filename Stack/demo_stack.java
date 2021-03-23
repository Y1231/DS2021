package java2021.Stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class demo_stack {
    public static void main(String[] args) {

        Deque<String> stack=new LinkedList<>();
       // Stack<String> stack = new Stack<>();
        /**
         * Deque接口及其实现提供了更完整和一致的LIFO堆栈操作集，这些接口应优先于此类。 例如：
         *
         *    Deque<Integer> stack = new ArrayDeque<Integer>();
         */
        stack.push("Y");
        stack.push("Y");
        stack.push("d");
        stack.push("s");

        System.out.println(stack);

        //System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack);


        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.peek());

    }
}
