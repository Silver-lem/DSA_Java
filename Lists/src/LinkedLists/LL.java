package LinkedLists;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    //Inserting first element
    public void insertFirst(int value){
        Node node =  new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    //Inserting in the last
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }

        Node node =  new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    //Insert at position
    public void insert(int val,int index){
        if(head == null){ //index == 0
            insertFirst(val);
            return;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }

        //Node node = new Node(val);
        Node node = new Node(val,temp.next);
        //node.next = temp.next;
        temp.next = node;
        size++;

    }



    //Displaying elements
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    //Creating a Node
    private class Node{
        //Values required
        private int value;
        private Node next;

        //Constructors
        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
