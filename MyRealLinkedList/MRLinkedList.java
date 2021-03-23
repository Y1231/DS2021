package java2021.MyRealLinkedList;

import java2021.LinkedList.MyListNode;

import javax.swing.event.UndoableEditListener;

public class MRLinkedList {

    public MLNode head;
    public MLNode last;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        MLNode cur = head;
        while (cur != null) {
            sb.append(cur.val);
            sb.append(",");
            cur = cur.next;

        }

        sb.append("]");
        return sb.toString();
    }

    public int size() {
        MLNode cur = head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;

        }
        return count;
    }


    public boolean add(String e) {
        //1.将元素装入节点中
        MLNode node = new MLNode(e);

        if (head == null) {
            head = node;
            last = node;
        } else {
            node.prev = head;
            //node.next=null;
            last.next = node;
            last = node;
        }
        return true;
    }


    public void add(int index, String e) {
        //1.将元素装入节点中
        MLNode node = new MLNode(e);

        MLNode prev = head;
        //2.判断index值
        if (index < 0 || index > size()) {
            throw new ArrayIndexOutOfBoundsException("你不对劲！");
        }

        if (index == 0) {
            if (head == null) {
                node.next = head;
                head.prev = node;
                head = node;
            } else {
                head = node;
                last = node;
            }
            return;
        }

        if (index == size()) {
            add(e);
            return;
        }

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        MLNode next = prev.next;

        node.next = next;
        node.prev = prev;
        prev.next = node;
        next.prev = node;
    }

    public String remove(int index) {
        if (index < 0 || index > size()) {
            throw new ArrayIndexOutOfBoundsException("你不对劲！");
        }

        MLNode Delete = head;

        if (size() == 1) {
            String e = head.val;
            head = null;
            last = null;
            return e;

        } else if (index == 0) {
            String e = head.val;
            head = head.next;
            head.prev = null;
            return e;
        } else if (index == size() - 1) {
            String e = head.val;
            last = last.prev;
            last.next = null;
            return e;
        } else {
            for (int i = 0; i < index - 1; i++) {
                Delete = Delete.next;
            }

            MLNode prev = Delete.prev;
            MLNode next = Delete.next;

            String e = Delete.val;
            prev.next = next;
            next.prev = prev;

            return e;

        }


    }
}