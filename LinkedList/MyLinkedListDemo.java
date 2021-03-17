package java2021.LinkedList;

public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("Y");
        list.add("Y");
        list.add("d");
        list.add("s");

        // [ 我, 爱, 中, 国 ]
        System.out.println(list);

        list.add(0, "嘿");
        list.add(0, "哈");



        System.out.println(list);
        System.out.println(list.size());

        list.remove(5);
        System.out.println(list.remove(4));
        System.out.println(list);



    }

}
