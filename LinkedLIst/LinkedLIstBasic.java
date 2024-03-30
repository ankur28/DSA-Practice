package LinkedLIst;

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class LinkedLIstBasic {

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        Node x = new Node(arr[2]);
        Node head = convertToArr(arr);


       //traverseLL(head);
        System.out.println(removeHead(head).data);

    }

    private static Node convertToArr(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length ; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            count++;
        }

        return count;

    }


    private static void traverseLL(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    private static Node removeHead(Node head){
        if(head == null) return head;
        Node temp = head;
        head = temp.next;
        return head;

    }
}


