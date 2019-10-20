package com.company.Lec16;

import com.company.Lec15.CircularQueue;
import com.company.Lec15.Queue;

public class DyanmicQueue extends CircularQueue {

    @Override
    public boolean enqueue(int value) {
        if(this.isFull()){

            int temp[]= new int[data.length*2];

            for (int i = 0; i <data.length ; i++) {
                temp[i]=data[(front+i)%data.length];
            }

            data=temp;
            front=0;
            end=size;
        }
        return super.enqueue(value);
    }
}
