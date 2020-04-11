package LinkedList;

public class MyLinkedList {

    Node head;
    void add(int data){
        Node toAdd = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = toAdd;
    }
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
}
