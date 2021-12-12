package com.example.dfa_game;

public class Data {
    Object[][] database = new Object[50][5];

    public Data(){
        //        Question 1
        database[0][0] = R.drawable.even0s;
        database[0][1] = "Input string has an even number of 1's";
        database[0][2] = "Input string has an odd number of 1's";
        database[0][3] = "Input string has an even number of 0's";
        database[0][4] = "Input string has an odd number of 0's";

//        Question 2
        database[1][0] = R.drawable.strings_odd_length;
        database[1][1] = "Input string has odd length";
        database[1][2] = "Input string has even length";
        database[1][3] = "Only the input string \"ab\"";
        database[1][4] = "Only input strings wontaining sequences of \"ab\"";

    }

}
