package com.company.Lec16;

public class ArrayList {

    private int data[];

    private int size=0;

    private int DEFAULT_SIZE=10;

    public ArrayList(){
       this.data=new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return size==data.length;
    }

    public void add(int value){
        if(isFull()){
            resize();
        }

        data[size++]=value;

    }

    private void resize() {

        int temp[]= new int[data.length*2];

        for (int i = 0; i <data.length ; i++) {
            temp[i]=data[i];
        }

        data=temp;
    }

    public int get(int index){

        return data[index];
    }

    public void set(int index, int value){

        data[index]=value;
    }

    public int remove(){

        return data[--size];
    }


}
