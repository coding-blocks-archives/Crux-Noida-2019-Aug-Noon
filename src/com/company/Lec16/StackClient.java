package com.company.Lec16;


public class StackClient {
    public static void main(String[] args) {

        DynamicStack stack = new DynamicStack();
        for (int i = 0; i <15 ; i++) {
            stack.push(i);
        }

        for (int i = 0; i <15 ; i++) {
            System.out.println(stack.pop());
        }

//        catch (ArithmeticException e){
//
//            System.out.println(e.getMessage());
//        }


    }
}
