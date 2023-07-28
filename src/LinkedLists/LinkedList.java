package LinkedLists;

public class LinkedList {
    Node head;
    int size = 0;
    public static class Node {
        int val;

        Node next;
        Node(int input) {
            val = input;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 6; i++) {
            list.insertNode(i, i);
        }
        list.printList();
        System.out.println("insert 9 at position 1");
        list.insertNode(1, 9);
        list.printList();
        System.out.println("insert 8 at position 3");
        list.insertNode(3, 8);
        list.printList();
        System.out.println("insert 7 at position 8 (which is the position following the last node)");
        list.insertNode(8, 7);
        list.printList();
        System.out.println("insert -1 at position -1 (it will not do anything)");
        list.insertNode(-1, -1);
        list.printList();
        System.out.println("insert -1 at position 10 (it will not do anything)");
        list.insertNode(-1, 10);
        list.printList();
        System.out.println("delete the 10th node (do nothing)");
        list.deleteNode(10);
        list.printList();
        System.out.println("delete the 0th node (do nothing)");
        list.deleteNode(0);
        list.printList();
        System.out.println("delete the 4th node (2 is removed)");
        list.deleteNode(4);
        list.printList();
        System.out.println("delete the 1st node (do nothing)");
        list.deleteNode(1);
        list.printList();
    }
    public void insertNode(int position, int value) {
        Node newNode = new Node(value);
         if (position < 1 || position > size + 1) return;
         if (position == 1) {
             newNode.next = head;
             head = newNode;
             size++;
         } else {
             Node current = head;
             while (--position > 1) {
                 current = current.next;
             }
             newNode.next = current.next;
             current.next = newNode;
             size++;
         }
    }

    public void deleteNode(int position) {
        Node current = head;
        if (position < 1 || position > size + 1) return;
        if (position == 1) {
            head = current.next;
        } else {
            while (--position > 2) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }

    public void printList() {
        Node current = head;
        while(current != null) {
            if (current.next == null) {
                System.out.println(current.val);
                break;
            }
            System.out.print(current.val + ", ");
            current = current.next;
        }
    }
}