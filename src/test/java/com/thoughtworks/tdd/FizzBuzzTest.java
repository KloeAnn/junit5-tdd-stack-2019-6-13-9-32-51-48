package com.thoughtworks.tdd;

import com.thoughtworks.tdd.Dependency;
import com.thoughtworks.tdd.HelloWorld;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_student_is_1(){
        //given
        int student=1;
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(student);

        //then
        assertThat(result,is("1"));
    }

    @Test
    public void should_return_2_when_student_is_2(){
        //given
        int student=2;
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(student);

        //then
        assertThat(result,is("2"));
    }

    @Test
    public void should_return_Fizz_when_student_is_3(){
        //given
        int student=3;
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(student);

        //then
        assertThat(result,is("Fizz"));
    }

    @Test
    public void should_return_Fizz_when_student_is_6(){
        //given
        int student=6;
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(student);

        //then
        assertThat(result,is("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_student_is_5(){
        //given
        int student=5;
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(student);

        //then
        assertThat(result,is("Buzz"));
    }

    @Test
    public void should_return_Whizz_when_student_is_7(){
        //given
        int student=7;
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(student);

        //then
        assertThat(result,is("Whizz"));
    }

    @Test
    public void should_return_FizzBuzz_when_student_is_15(){
        //given
        int student=15;
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(student);

        //then
        assertThat(result,is("FizzBuzz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_student_is_105(){
        //given
        int student=105;
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(student);

        //then
        assertThat(result,is("FizzBuzzWhizz"));
    }
}
