package com.example.myapplication;

public class cppquestions {

    public String questions [] =
            {" What is a correct syntax to output \"Hello World\" in C++? ",
                    " How do you insert COMMENTS in C++ code? ",
                    " Which data type is used to create a variable that should store text? ",
                    " How do you create a variable with the numeric value 5? ",
                    " Which method can be used to find the length of a string? ",
                    " Which header file lets us work with input and output objects? ",
                    " Which operator can be used to compare two values? ",
                    " How do you create a function in C++? ",
                    " What is the correct way to create an object called myObj of MyClass? ",
                    " How do you start writing a while loop in C++? ",""};

    private String choices [][] = {
            {"Console.WriteLine(\"Hello World\");", "print (\"Hello World\");","cout << \"Hello World\"; ","System.out.println(\"Hello World\");"},
            {"//","/*","<!--->","#"},
            {"Text","string","mystring","float"},
            {"x = 5;","double x = 5;","int x = 5;","num x = 5;"},
            {"getSize()","length()","len()","getLength()"},
            {"#include <iostream>","#include <inputstr>","#include <iosstring>","#include <stream>"},
            {"=","><","<>","=="},
            {"functionName()","(functionName)","functionName[]","functionName:"},
            {"class MyClass = new myObj();","MyClass myObj;","new myObj = MyClass();","class myObj = new MyClass();"},
            {"while x > y {","x > y while {","while x > y:","while (x > y)"}
            ,{"","","",""}};
    private  String correct_answer[]={"cout << \"Hello World\"; ","//","string","int x = 5;","length()","#include <iostream>","==","functionName()","MyClass myObj;","while (x > y)",""};
    public String get_question(int num)
    {
        String qn = questions[num];
        return qn;
    }

    public String get_ch1(int num)
    {
        String ch = choices[num][0];
        return ch;
    }
    public String get_ch2(int num)
    {
        String ch = choices[num][1];
        return ch;
    }
    public String get_ch3(int num)
    {
        String ch = choices[num][2];
        return ch;
    }
    public String get_ch4(int num)
    {
        String ch = choices[num][3];
        return ch;
    }


    public String get_correct_answer1(int cr)
    {
        String ans = correct_answer[cr];
        return ans;
    }
    public String get_Explanation(int cr)
    {
        String ex = correct_answer[cr];
        return ex;
    }

}
