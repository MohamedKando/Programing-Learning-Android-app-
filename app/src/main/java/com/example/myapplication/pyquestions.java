package com.example.myapplication;

public class pyquestions {

    public String questions [] =
            {" Who developed the Python language? ",
                    " In which year was the Python language developed? ",
                    " Which character is used in Python to make a single line comment? ",
                    " In which year was the Python 3.0 version developed? ",
                    " What is the method inside the class in python language? ",
                    " Which of the following declarations is incorrect? ",
                    " Which of the following declarations is incorrect in python language? ",
                    " Which of the following words cannot be a variable in python language? ",
                    " What will be the output of this function?:-  round(4.576); ",
                    " What will be the output of this code? " +
                            "x = 1\n" +
                            "while True:  \n" +
                            "    if x % 5 = = 0:  \n" +
                            "        break  \n" +
                            "    print(x)   \n" +
                            "    x + = 1   ",""};

    private String choices [][] = {
            {"Zim Den", "Guido van Rossum","Niene Stom","Wick van Rossum"},
            {"1995","1972","1981","1989"},
            {"/","//","#","!"},
            {"2008","2000","2010","2005"},
            {"Object","Function","Attribute","Argument"},
            {"_x = 2","__x = 3","__xyz__ = 5","None of these"},
            {"xyzp = 5,000,000","x y z p = 5000 6000 7000 8000","x,y,z,p = 5000, 6000, 7000, 8000","x_y_z_p = 5,000,000"},
            {"_val","val","try","_try_"},
            {"4",".6","576","5"},
            {"error","2 1","0 3 1","None of these"}
            ,{"","","",""}};
    private  String correct_answer[]={"Guido van Rossum","1989","#","2008","Function","None of these","x y z p = 5000 6000 7000 8000","try","5","error",""};
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
