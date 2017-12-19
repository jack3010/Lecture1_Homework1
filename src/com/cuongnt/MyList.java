package com.cuongnt;

public class MyList {
    Node head, tail;

    public MyList() {
        head = tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    private void addNode(int info) {
        Node node = new Node(info);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void addMany(int[] a) {
        for (int i : a) {
            addNode(i);
        }
    }

    public void insertNodeBegin(int begin) {
        if (isEmpty()) {

        } else {
            Node node = new Node(begin);
            node.setNext(head);
            head = node;
        }
    }

    public void insertNodeEnd(int end) {
        if (isEmpty()) {

        } else {
            Node newNode = new Node(end);
            tail.setNext(newNode);
            tail = newNode;
            newNode.next = null;
        }
    }

    public void removeBeginNode() {
        if (isEmpty()) {

        } else {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        }
    }

    public void removeLastNode() {
        if (isEmpty()) {

        } else {
            if (head == tail) {
                head = tail = null;
            } else {
                Node currentNode = head;
                while (currentNode.next != tail) {
                    currentNode = currentNode.next;
                }
                tail = currentNode;
                tail.next = null;
            }
        }
    }

}
