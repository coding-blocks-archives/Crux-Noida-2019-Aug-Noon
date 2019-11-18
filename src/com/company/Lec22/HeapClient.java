package com.company.Lec22;

public class HeapClient {

    public static void main(String[] args) throws Exception {

        Heap<Integer> heap= new Heap<>();
        heap.add(5);
        heap.add(4);
        heap.add(1);
        heap.add(3);
        System.out.println(heap.remove());
        heap.display();
    }
}
