package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int student){
        if(student%3==0){
            return "Fizz";
        }
        return student+"";
    }
}
