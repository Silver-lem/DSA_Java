package LinkedLists;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        SingleDeletions s = new SingleDeletions();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);


        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        list.insert(6,1);
        int p = list.get(1);
        list.display();
        System.out.println("p = " + p);


        list.reverse(list.getHead());
        list.display();
    }
}
