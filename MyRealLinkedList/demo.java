package java2021.MyRealLinkedList;

public class demo {

    public static void main(String[] args) {


        MRLinkedList list = new MRLinkedList();

        list.add("走");
        list.add("进");
        list.add("杨");
        list.add("官");
        list.add("寨");

        System.out.println(list);

        System.out.println(list.size());
        list.add(5,"Y");

        System.out.println(list);

        list.remove(2);
        System.out.println(list);


    }
}
