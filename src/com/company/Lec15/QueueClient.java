package com.company.Lec15;

public class QueueClient {

    public static void main(String[] args) {

        OptimizedQueue queue =new OptimizedQueue();
        for (int i = 0; i <10 ; i++) {
            queue.enqueue(i);
            queue.display();
        }

        for (int i = 0; i <10 ; i++) {
            queue.dequeue();
            queue.display();
        }
    }
}
