package Module10;

class ReverseLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node reverse(Node head){

        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    static void printList(Node head){

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args){

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head = reverse(head);

        printList(head);
    }
}
