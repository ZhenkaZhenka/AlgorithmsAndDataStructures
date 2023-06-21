import java.util.Random;

public class Program {
    public static void main(String[] args){
        TwoWayLinkedList list = new TwoWayLinkedList();
        Random r = new Random();
        int count = 0;

        while(count < 15){
            list.pushFront(r.nextInt(0, 50));
            count++;
        }

        System.out.println("Список после заполнения случайными числами: ");
        list.print();

        System.out.println("Список после сортировки: ");
        list.sort();
        list.print();

        System.out.println("Список после разворота: ");
        list.reverse();
        list.print();

        System.out.println("Список после еще одного разворота: ");
        list.reverse();
        list.print();
    }
}
