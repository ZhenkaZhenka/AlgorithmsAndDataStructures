public class TwoWayLinkedList {
    Node head;
    Node tail;

    class Node{
        int value;
        Node next;
        Node previous;
    }
/*
    Метод разворота
 */
    public void reverse(){
        if(head != null) {
            for(int i = size()-1; i > 0; i--){
                Node node = head;
                int count = 0;
                while(count < i && node.next != null){
                    swap(node);
                    count++;
                }
            }
        }
    }

    public void swap(Node node){
        Node before = node.previous;
        Node cur = node;
        Node next = node.next;
        Node after = next.next;

        cur.next = after;
        cur.previous = next;
        next.next = cur;
        next.previous = before;

        if(after != null){
            after.previous = cur;
        }else{
            tail = cur;
        }

        if(before != null){
            before.next = next;
        }else{
            head = next;
        }
    }

    public void pushFront(int value){
        Node node = new Node();
        node.value = value;

        if(head == null){
            tail = node;
        }else{
            node.next = head;
            head.previous = node;
        }
        head = node;
    }

    public void sort(){
        boolean marker = true;
        while(marker){
            marker = false;
            if(head != null) {
                Node node = head;
                while (node != null && node.next != null) {
                    if (node.value < node.next.value) {
                        swap(node);
                        marker = true;
                    }
                    node = node.next;
                }
            }
        }
    }



    private int size(){
        if(head != null) {
            Node node = head;
            int size = 0;
            while (node.next != null) {
                size++;
                node = node.next;
            }
            return size+1;
        }
        else{
            return 0;
        }
    }
    public void print(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }
}
