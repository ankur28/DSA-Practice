package DoublyLL;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1){
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}


public class DoublyLLBasic {


    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        Node head = convertToArr(arr);
        head = deleteKth(head,5);
        print(head);
    }

    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }


    }

    private static Node convertToArr(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length ; i++) {
            Node temp = new Node(arr[i], null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static Node deleteHead(Node head){
        if( head == null || head.next == null) return null;

        Node prev = head;
        head = head.next;

        head.prev = null;
        prev.next = null;

        return head;

    }
    private static Node deleteTail(Node head){
        if( head == null || head.next == null) return null;

        Node tail = head;
       while (tail.next != null){
           tail = tail.next;
       }

       Node newTail = tail.prev;
       newTail.next = null;
        tail.prev = null;
        return head;

    }

    private static Node deleteKth(Node head, int k){
        if( head == null) return null;

        int count = 0;
        Node kNode = head;
        while(kNode != null){
            count++;
            if(count == k) break;
            kNode = kNode.next;
        }


        Node back = kNode.prev;
        Node front = kNode.next;


        if(back == null && front == null)
            return null;
        else if (back == null)
            return deleteHead(head);
        else if (front == null)
            return deleteTail(head);

        back.next = front;
        front.prev = back;

        kNode.next = null;
        kNode.prev = null;

        return head;

    }


}
