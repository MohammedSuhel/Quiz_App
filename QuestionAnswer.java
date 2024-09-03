package com.example.quiz_app;

public class QuestionAnswer {

    public static String question []={
            "What does JVM stand for?",
            "Which data type is used to store whole numbers in Java?",
            "what is 5+3*2 ?",
            "who is the default value of a boolean variable in Java?",
            "In the given options, which is the Example of System Software?"
    };
    public static String choices [][]={
            {"Java Virtual Machine" , "Java Visual Model" , "Java Variable Manager" , "Java Version Manager"},
            {"float" , "double" , "int" , "char"},
            {"16" , "11" , "13" , "26"},
            {"1" , "0" , "false" , "true"},
            {"Windows" , "Linux" , "MacOS" , "All of the above"}
    };
    public static String correctAnswers []={
            "Java Virtual Machine" ,
            "int",
            "11",
            "false",
            "All of the above"};
}