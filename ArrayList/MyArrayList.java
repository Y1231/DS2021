package java2021.ArrayList;

import java.util.Arrays;

public class MyArrayList implements Mylist {

    private Integer[] array;
    private int size;

    public MyArrayList() {
        array = new Integer[16];
        size = 0;
    }

    @Override
    public boolean add(Integer e) {

        array[size] = e;
        size++;

        return true;
    }

    @Override
    public void add(int index, Integer e) {
        //1.判断size是否合法
        if (index < 0 || index > size) {
            //下标不合法
            throw new ArrayIndexOutOfBoundsException("Index:" + index + "size:" + size);
        }


        //2.进行插入，【index,size】所有元素向后移动一格
        for (int from = size - 1; from >= index; from--) {
            int to = from + 1;
            array[to] = array[from];


            //3.把元素放入index位置
            array[index] = e;
            size++;
        }
    }

    @Override
    public Integer remove(int index) {
        //1.判断size是否合法
        if (index < 0 || index > size) {
            //下标不合法
            throw new ArrayIndexOutOfBoundsException("Index:" + index + "size:" + size);
        }
        //2.不需要判断Empty的情况
        //3.将index+1位置移到index,
        //   将目前size-1置为null
        for (int from = index + 1; from < size; from++) {
            int to = from - 1;
            array[to] = array[from];
        }

        array[size - 1] = null;

        return null;

    }

    @Override
    public boolean remove(Integer e) {
        // 从列表中删除指定元素的第一个出现（如果存在）。

        int i = indexOf(e);
        if (i < 0) {
            return false;
        }

        remove(i);
        return true;
    }

    @Override
    public Integer get(int index) {
        //1.判断size是否合法
        if (index < 0 || index > size) {
            //下标不合法
            throw new ArrayIndexOutOfBoundsException("Index:" + index + "size:" + size);
        }


        return array[index];
    }

    @Override
    public Integer set(int index, Integer e) {
        //用指定的元素替换此列表中指定位置的元素。
        //1.判断size是否合法
        if (index < 0 || index > size) {
            //下标不合法
            throw new ArrayIndexOutOfBoundsException("Index:" + index + "size:" + size);
        }

        Integer olde = array[index];
        array[index] = e;
        return olde;
    }

    @Override
    public boolean contains(Integer e) {
        return indexOf(e) >= 0;
    }

    @Override
    public int indexOf(Integer e) {
        //不能用二分查找，只能遍历
        for (int i = 0; i < size; i++) {
            if (e.equals(array[i])) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        for (int i = size - 1; i >= 0; i--) {
            if (e.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        {
            return size == 0;
        }
    }

        public String toString(){
            Integer[] toShow = Arrays.copyOf(array, size);
            // toShow.length == size
            return Arrays.toString(toShow);
        }

    }
