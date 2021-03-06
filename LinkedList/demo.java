package java2021.LinkedList;

public class demo {
    public static void main(String[] args) {

        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        n1.val = 2;
        n2.val = 3;
        n3.val = 4;
        n4.val = 5;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        Node head = n1;
        Node cur = head;


        //遍历链表
        /*int count=0;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
            count++;
        }
        System.out.println(count);*/


        //找最后一个节点
        /*Node last=head;
        while(last.next!=null&&head!=null){
            last=last.next;
        }
        System.out.println(last.val);*/

        //找倒数第二个节点
       /* Node last2=head;
        while(last2.next.next!=null){
            last2=last2.next;
        }
        System.out.println(last2.val);*/

    //删除节点n3
/*
        Node prev=n2;
        prev.next=prev.next.next;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
*/

        //插入节点
        //1.先把元素装入节点中
       /* Node prev=n2;
        Node n5=new Node();
        n5.val=7;

        n5.next=prev.next;
        prev.next=n5;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }*/
        //2 3 7 4 5








    }
}