package com.example.myapplication;

public class phpquestions {

    public String questions [] =
            {" What does PHP stand for? ",
                    " PHP server scripts are surrounded by delimiters, which? ",
                    " How do you write \"Hello World\" in PHP ",
                    " All variables in PHP start with which symbol? ",
                    " What is the correct way to end a PHP statement? ",
                    " The PHP syntax is most similar to: ",
                    " What is the correct way to include the file \"time.inc\" ? ",
                    " Which superglobal variable holds information about headers, paths, and script locations? ",
                    " What is the correct way to add 1 to the $count variable? ",
                    " What is a correct way to add a comment in PHP? ",""};

    private String choices [][] = {
            {"Personal Hypertext Processor", "PHP: Hypertext Preprocessor","Private Home Page","Public High Language"},
            {"<?php>...</?>","<&>...</&>","<?php...?>","<script>...</script>"},
            {"Print(\"Hello World\")","echo \"Hello World\";","Document.Write(\"Hello World\");","\"Hello World\";"},
            {"@","#","!","$"},
            {"New line",".",";","</php>"},
            {"CSS","Perl and C","JavaScript","None of these"},
            {"<!-- include file=\"time.inc\" -->","<?php include file=\"time.inc\"; ?>","<?php include \"time.inc\"; ?>","<?php include:\"time.inc\"; ?>"},
            {"$_GET","$_SERVER","$_SESSION","$GLOBALS"},
            {"$count =+1","++count","$count++;","5"},
            {"*\\...\\*","/*...*/","<!--...-->","None of these"}
            ,{"","","",""}};
    private  String correct_answer[]={"PHP: Hypertext Preprocessor ","<?php...?>","echo \"Hello World\";","$",";","Perl and C","<?php include \"time.inc\"; ?>","$_SERVER","$count++;","/*...*/",""};
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
