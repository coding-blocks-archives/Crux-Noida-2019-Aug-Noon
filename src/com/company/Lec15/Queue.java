package com.company.Lec15;

public class Queue {

    private int data[];

    private int DEFAULT_SIZE=10;

    private int end=0;

    public Queue(){

        this.data= new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return end==data.length;
    }

    public boolean enqueue(int value){

        if(isFull()){
            return false;
        }

        data[end++]=value;
        return true;
    }

    public boolean isEmpty(){
        return end==0;
    }

    public void display(){

        for (int i = 0; i <end ; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("End");
    }


    public int dequeue(){

        if(isEmpty()){
            System.out.println("Empty");
            return 0;
        }

        int temp=data[0];

        for (int i = 1; i <end ; i++) {
            data[i-1]=data[i];
        }

        end--;
        return temp;
    }
}
