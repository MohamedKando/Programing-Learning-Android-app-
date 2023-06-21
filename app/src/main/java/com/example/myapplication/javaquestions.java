package com.example.myapplication;

public class javaquestions {
    public String questions [] =
            {" Who invented Java language? ",
                    " What is a correct syntax to output \"Hello World\" in Java? ",
                    " Which data type is used to create a variable that should store text? ",
                    " How do you create a variable with the numeric value 5? ",
                    " How do you create a variable with the floating number 2.8? ",
                    " Which method can be used to find the length of a string? ",
                    " Which method can be used to return a string in upper case letters? ",
                    " Which operator can be used to compare two values? ",
                    " To declare an array in Java, define the variable type with: ",
                    " How do you create a method in Java? ",""};

    private String choices [][] = {
            {"Dennis Ritchie", "James Gosling","Larry Page","Serge Page"},
            {"Console.WriteLine(\"Hello World\");","echo(\"Hello World\");","System.out.println(\"Hello World\");","print (\"Hello World\");"},
            {"Byte","Txt","mystring","String"},
            {"int x = 5;","num x = 5;","Float x = 5;","x = 5;"},
            {"byte x = 2.8f","x = 2.8f;","int x = 2.8f;","float x = 2.8f;"},
            {"length()","getSize()","len()","getLength()"},
            {"tolowercase()","toUpperCase()","upperCase()","tuc()"},
            {"<>","><","==","="},
            {"()","{}","([])","[]"},
            {"methodName.","methodName()","methodName[]","(methodName)"}
            ,{"","","",""}};
    private  String correct_answer[]={"James Gosling","System.out.println(\"Hello World\");","String","int x = 5;","float x = 2.8f;","length()","toUpperCase()","==","[]","methodName()",""};
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
