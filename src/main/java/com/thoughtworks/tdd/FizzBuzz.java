package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int student){
        if(student%3==0){
            return "Fizz";
        }
        if(student%5==0){
            return "Buzz";
        }
        if(student%7==0){
            return "Whizz";
        }
        return student+"";
    }
}
