package com.example.android.thegreatwrestlingquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    /*int to keep track of correct answers*/
    int correctAnswers = 0;


    //View variables for each question

    CheckBox question_1_answer_1;
    CheckBox question_1_answer_2;
    CheckBox question_1_answer_3;
    CheckBox question_1_answer_4;
    CheckBox question_1_answer_5;
    CheckBox question_1_answer_6;


    RadioGroup radioGroup2;
    RadioButton question_2_answer_1;
    RadioButton question_2_answer_2;
    RadioButton question_2_answer_3;
    RadioButton question_2_answer_4;


    RadioGroup radioGroup3;
    RadioButton question_3_answer_1;
    RadioButton question_3_answer_2;
    RadioButton question_3_answer_3;
    RadioButton question_3_answer_4;


    CheckBox question_4_answer_1;
    CheckBox question_4_answer_2;
    CheckBox question_4_answer_3;
    CheckBox question_4_answer_4;


    RadioGroup radioGroup5;
    RadioButton question_5_answer_1;
    RadioButton question_5_answer_2;
    RadioButton question_5_answer_3;
    RadioButton question_5_answer_4;


    RadioGroup radioGroup6;
    RadioButton question_6_answer_1;
    RadioButton question_6_answer_2;
    RadioButton question_6_answer_3;
    RadioButton question_6_answer_4;


    EditText editor;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*View variable initializations*/

        /*Question 1*/
        question_1_answer_1 = (CheckBox) findViewById(R.id.Question_1_answer_1);
        question_1_answer_2 = (CheckBox) findViewById(R.id.Question_1_answer_2);
        question_1_answer_3 = (CheckBox) findViewById(R.id.Question_1_answer_3);
        question_1_answer_4 = (CheckBox) findViewById(R.id.Question_1_answer_4);
        question_1_answer_5 = (CheckBox) findViewById(R.id.Question_1_answer_5);
        question_1_answer_6 = (CheckBox) findViewById(R.id.Question_1_answer_6);

        /*Question 2*/

        radioGroup2 = (RadioGroup) findViewById(R.id.Question_2_radioGroup);
        question_2_answer_1 = (RadioButton) findViewById(R.id.Question_2_rb1);
        question_2_answer_2 = (RadioButton) findViewById(R.id.Question_2_rb2);
        question_2_answer_3 = (RadioButton) findViewById(R.id.Question_2_rb3);
        question_2_answer_4 = (RadioButton) findViewById(R.id.Question_2_rb4);

        /*Question 3*/

        radioGroup3 = (RadioGroup) findViewById(R.id.Question_3_radioGroup);
        question_3_answer_1 = (RadioButton) findViewById(R.id.Question_3_rb1);
        question_3_answer_2 = (RadioButton) findViewById(R.id.Question_3_rb2);
        question_3_answer_3 = (RadioButton) findViewById(R.id.Question_3_rb3);
        question_3_answer_4 = (RadioButton) findViewById(R.id.Question_3_rb4);

        /*Question 4*/

        question_4_answer_1 = (CheckBox) findViewById(R.id.Question_4_answer_1);
        question_4_answer_2 = (CheckBox) findViewById(R.id.Question_4_answer_2);
        question_4_answer_3 = (CheckBox) findViewById(R.id.Question_4_answer_3);
        question_4_answer_4 = (CheckBox) findViewById(R.id.Question_4_answer_4);

        /*Question 5*/

        radioGroup5 = (RadioGroup) findViewById(R.id.Question_5_radioGroup);
        question_5_answer_1 = (RadioButton) findViewById(R.id.Question_5_rb1);
        question_5_answer_2 = (RadioButton) findViewById(R.id.Question_5_rb2);
        question_5_answer_3 = (RadioButton) findViewById(R.id.Question_5_rb3);
        question_5_answer_4 = (RadioButton) findViewById(R.id.Question_5_rb4);

        /*Question 6*/

        radioGroup6 = (RadioGroup) findViewById(R.id.Question_6_radioGroup);
        question_6_answer_1 = (RadioButton) findViewById(R.id.Question_6_rb1);
        question_6_answer_2 = (RadioButton) findViewById(R.id.Question_6_rb2);
        question_6_answer_3 = (RadioButton) findViewById(R.id.Question_6_rb3);
        question_6_answer_4 = (RadioButton) findViewById(R.id.Question_6_rb4);

        /*Question 7*/

        editor = (EditText) findViewById(R.id.Question_7_textInput);


    }

    public void increment(View view) {
        correctAnswers += 1;
    }

    public void decrement(View view) {
        correctAnswers -= 1;
        if (correctAnswers < 0) {
            correctAnswers = 0;
        }
    }

    /*Method to validate answers for question 1*/

    public void question1Validate(View view) {
        if (question_1_answer_1.isChecked()) {
            increment(view);
        }
        if (question_1_answer_2.isChecked()) {
            increment(view);
        }
        if (question_1_answer_3.isChecked()) {
            increment(view);
        }
        if (question_1_answer_4.isChecked()) {
            increment(view);
        }
        if (question_1_answer_5.isChecked()) {
            decrement(view);
        }
        if (question_1_answer_6.isChecked()) {
            decrement(view);
        }

    }

    /*Method to validate answer for question 2*/

    public void question2Validate(View view) {
        if (question_2_answer_3.isChecked()) {
            increment(view);
        } else {
            decrement(view);
        }
    }

    /*Method to validate answer for question 3*/

    public void question3Validate(View view) {
        if (question_3_answer_2.isChecked()) {
            increment(view);
        } else {
            decrement(view);
        }
    }

    /*Method to validate answers for question 4*/

    public void question4Validate(View view) {
        if (question_4_answer_1.isChecked()) {
            increment(view);
        }
        if (question_4_answer_2.isChecked()) {
            decrement(view);
        }
        if (question_4_answer_3.isChecked()) {
            decrement(view);
        }
        if (question_4_answer_4.isChecked()) {
            increment(view);
        }


    }

    /*Method to validate answers for question 5*/

    public void question5Validate(View view) {
        if (question_5_answer_3.isChecked()) {
            increment(view);
        } else {
            decrement(view);
        }
    }

    /*Method to validate answers for question 6*/

    public void question6Validate(View view) {
        if (question_6_answer_4.isChecked()) {
            increment(view);
        } else {
            decrement(view);
        }
    }

    /*Method to validate answers for question 7*/

    public void question7Validate(View view) {
        answer = editor.getText().toString();
        if (answer.equals("Hulk")) {
            increment(view);
        } else if (answer.equals("hulk")) {
            increment(view);
        } else {
            decrement(view);
        }

    }
    

    /*Method which checks if answers are correct, and updates score.
     * To be called when Submit button is clicked*/

    public void checkAnswers(View view) {
        question1Validate(view);
        question2Validate(view);
        question3Validate(view);
        question4Validate(view);
        question5Validate(view);
        question6Validate(view);
        question7Validate(view);
        endMessage(ranker(correctAnswers));


    }

    /*Method to give player a rank based on number of correct answers
     * @rank is initialized to empty string and set according to score*/

    public String ranker(int score) {
        String rank = "";

        if (score >= 11) {
            rank = getResources().getString(R.string.rank1);
        } else if (score <= 10 && score >= 8) {
            rank = getResources().getString(R.string.rank2);
        } else if (score <= 7 && score >= 5) {
            rank = getResources().getString(R.string.rank3);
        } else {
            rank = getResources().getString(R.string.rank4);
        }

        return rank;
    }

    /*Method to print out toast message with score and rank at end of quiz*/

    public void endMessage(String rank) {
        String message = getResources().getString(R.string.conclusion1) + correctAnswers + getResources().getString(R.string.conclusion2);
        message += getResources().getString(R.string.rank_title) + rank;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        // Makes app close automatically after toast is displayed
        Timer countDown = new Timer();
        TimerTask quit = new TimerTask() {
            @Override
            public void run() {
                System.exit(0);
            }
        };
        countDown.schedule(quit, 2500);
    }

}