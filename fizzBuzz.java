package com.company;

public class fizzBuzz {
    public static void fizz() {

        System.out.println("Fizz");

    }
    public static void buzz() {

        System.out.println("Buzz");
    }
    public static void fizzbuzz() {

        System.out.println("FizzBuzz");
    }

    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            if(i % 5 == 0 && i % 3 == 0){
                fizzbuzz();
            }
            else if(i % 5 == 0){
                buzz();
            }
            else if(i % 3 == 0){
                fizz();
            }
            else{
                System.out.println(i);
            }
        }
    }
}
