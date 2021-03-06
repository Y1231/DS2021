package java2021.MyArrayList;

public class MyListdemo {

    public static void main(String[] args) {
            MyList list = new MyrealArrayList();
            System.out.println(list);
            list.add(1);
            list.add(2);
            list.add(3);
        System.out.println(list);

        list.add(2,5);
        System.out.println(list);//1 2 5 3

        list.remove(2);
        System.out.println(list);

    }
}
