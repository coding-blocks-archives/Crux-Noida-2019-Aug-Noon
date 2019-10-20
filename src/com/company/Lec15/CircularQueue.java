package com.company.Lec15;

public class CircularQueue {

    public int data[];

    public int DEFAULT_SIZE=10;

    public  int end=0;

    public int front=0;

    public int size=0;

    public CircularQueue(){

        this.data= new int[DEFAULT_SIZE];
    }

    public boolean isFull(){

        return size==data.length;
    }

    public boolean enqueue(int value){

        if(isFull()){
            return false;
        }

        data[end++]=value;
        end=end%data.length;
        size++;
        return true;
    }

    public boolean isEmpty()
    {
        return size==0;

    }

    public void display(){

        for (int i = 0; i <size ; i++) {
            System.out.print(data[(front+i)%data.length]+" ");
        }
        System.out.println("End");
    }


    public int dequeue(){

        if(isEmpty()){
            System.out.println("Empty");
            return 0;
        }

        int temp=data[front];

//        for (int i = 1; i <end ; i++) {
//            data[i-1]=data[i];
//        }
        front++;
        front=front%data.length;
        size--;
        return temp;
        // return data[front++];
    }
}
