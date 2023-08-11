package Day_7;

import Day_7.Queue.DynamicArrayQueue;
import Day_7.Queue.SimpleArrayQueue;

import javax.crypto.Cipher;

public class Driver {

    public static void main(String[] args) {

        DynamicArrayQueue simpleArrayQueue = new DynamicArrayQueue(5);
        simpleArrayQueue.enqueue(4);
        System.out.println("queue elements :" + simpleArrayQueue.toString());
        System.out.println(DynamicArrayQueue.capacity);
        System.out.println(simpleArrayQueue.size());
        System.out.println("-----------------------------------");

        simpleArrayQueue.enqueue(56);
        simpleArrayQueue.enqueue(2);
        simpleArrayQueue.enqueue(67);
        simpleArrayQueue.enqueue(90);
        System.out.println("queue elements :" + simpleArrayQueue.toString());
        System.out.println(DynamicArrayQueue.capacity);
        System.out.println(simpleArrayQueue.size());
        System.out.println("-----------------------------------");

//        simpleArrayQueue.enqueue(568);


        System.out.println("dequeue operation:" + simpleArrayQueue.dequeue());
        System.out.println("dequeue operation:" + simpleArrayQueue.dequeue());
//        System.out.println("dequeue operation:" + simpleArrayQueue.dequeue());
        System.out.println("queue elements :" + simpleArrayQueue.toString());
        System.out.println(DynamicArrayQueue.capacity);
        System.out.println(simpleArrayQueue.size());
        System.out.println("-----------------------------------");


        System.out.println("dequeue operation:" + simpleArrayQueue.dequeue());
//        System.out.println("dequeue operation:" + simpleArrayQueue.dequeue());
        System.out.println("queue elements :" + simpleArrayQueue.toString());
        System.out.println(DynamicArrayQueue.capacity);
        System.out.println(simpleArrayQueue.size());
        System.out.println("-----------------------------------");


    }
}
