package com.cuongnt;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] a = {9, 2, 4, 6, 3};
        MyList myList = new MyList();
        myList.addMany(a);
        myList.insertNodeBegin(0);
        myList.insertNodeEnd(100);
        myList.removeBeginNode();
        myList.removeLastNode();

        System.out.println(myList.head.info);
        System.out.println(myList.head.next.info);
        System.out.println(myList.tail.info);
    }
}
