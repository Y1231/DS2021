package java2021.LinkedList;

public class BasicOperation {
    public static Node pushHead(Node head,int val){

        Node node=new Node(val);

        node.next=head;

        return node;

    }

    //   1
    //头删,返回新的头节点
    public static Node DeleteHead(Node head){
        if(head==null){
            throw new RuntimeException("node is null");
        }
        head=head.next;

        return head;
    }


    //   2
    //尾插
    public static Node pushBack(Node head,int val){

        Node node=new Node(val);
        Node cur=head;
        //链表无节点
        if(head==null){
            throw new RuntimeException("node is null");
        }
        //有节点

        while(cur.next!=null){

            cur=cur.next;
        }
        cur.next=node;
        return head;
    }


    //  3
    //尾删除
    public static Node DeleteBack(Node head){


        Node cur=head;

        //链表无节点
        if(head==null){
            throw new RuntimeException("node is null");
        }
        //有2个以上节点
        if(head.next!=null) {

            while (cur.next.next != null) {
                cur=cur.next;
            }
            cur.next = null;

            return head;

        }else{
            return null;
        }
    }

    public  static Node printNode(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }

        return head;
    }


    public static void main(String[] args) {

        Node head=null;
        head=pushHead(head,4);
        head=pushHead(head,5);
        head=pushHead(head,6);


        printNode(head);

        /*head=DeleteHead(head);
        printNode(head);*/

        /*head=DeleteBack(head);
        printNode(head);*/

        pushBack(head,66);
        printNode(head);



       /* Node prev=head;
        if(head==null){
            return null;
        }
        while(prev.next!=null){
            if(prev.next.val==val) {
                prev.next = prev.next.next;
            }else{
                prev=prev.next;
            }

            if(head.val==val){
                return head.next;
            }

        }*/


    }

}
