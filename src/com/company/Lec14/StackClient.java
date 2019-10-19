package com.company.Lec14;

public class StackClient {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.push(20);

        try {
            int c=5/0;
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
//        catch (ArithmeticException e){
//
//            System.out.println(e.getMessage());
//        }


        System.out.println("hello");
    }
}
