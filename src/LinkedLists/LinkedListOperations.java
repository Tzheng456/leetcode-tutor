package LinkedLists;

import LinkedLists.LinkedList;
public class LinkedListOperations {
    public static void main(String[] args) {
        int[][] A = {
                {0,1,-1},
                {1,2,-1},
                {2,3,1}
        };
        int[][] B = {
                {0,1,-1},
                {1,2,-1},
                {2,3,1},
                {0,4,-1},
                {3,1,-1},
                {3,2,-1}
        };
        LinkedList ans = solve(A);
        ans.printList();
        LinkedList ansB = solve(B);
        ansB.printList();
    }
    public static LinkedList solve(int[][] A) {
        LinkedList list = new LinkedList();
        for (int[] row : A) {
            int operation = row[0];
            int value = row[1];
            int index = row[2];
            if (operation == 0) {
                list.insertNode(1, value);
            } else if (operation == 1) {
                list.insertNode(list.size + 1, value);
            } else if (operation == 2) {
                list.insertNode(index, value);
            } else if (operation == 3) {
                list.deleteNode(index);
            }
        }
        return list;
    }
}
