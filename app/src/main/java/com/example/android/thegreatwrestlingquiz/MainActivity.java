package com.example.android.thegreatwrestlingquiz;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    int correctAnswers = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view) {
        correctAnswers += 1;
    }

    public void decrement(View view) {
        correctAnswers -= 1;
    }

    /*Method to validate answers for question 1*/

    public void question1Validate(View view) {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.Question_1_answer_1);
        if (checkBox1.isChecked()) {
            increment(view);
        }
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.Question_1_answer_2);
        if (checkBox2.isChecked()) {
            increment(view);
        }
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.Question_1_answer_3);
        if (checkBox3.isChecked()) {
            increment(view);
        }
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.Question_1_answer_4);
        if (checkBox4.isChecked()) {
            increment(view);
        }
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.Question_1_answer_5);
        if (checkBox5.isChecked()) {
            decrement(view);
        }
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.Question_1_answer_6);
        if (checkBox6.isChecked()) {
            decrement(view);
        }

    }

    /*Method to validate answer for question 2*/

    public void question2Validate(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.Question_2_radioGroup);
        RadioButton rb1 = (RadioButton) findViewById(R.id.Question_2_rb1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.Question_2_rb2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.Question_2_rb3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.Question_2_rb4);
        if (rb3.isChecked()) {
            increment(view);
        } else {
            decrement(view);
        }
    }

    /*Method to validate answer for question 3*/

    public void question3Validate(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.Question_3_radioGroup);
        RadioButton rb1 = (RadioButton) findViewById(R.id.Question_3_rb1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.Question_3_rb2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.Question_3_rb3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.Question_3_rb4);
        if (rb2.isChecked()) {
            increment(view);
        } else {
            decrement(view);
        }
    }

    public void question4Validate(View view) {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.Question_4_answer_1);
        if (checkBox1.isChecked()) {
            increment(view);
        }
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.Question_4_answer_2);
        if (checkBox2.isChecked()) {
            decrement(view);
        }
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.Question_4_answer_3);
        if (checkBox3.isChecked()) {
            decrement(view);
        }
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.Question_4_answer_4);
        if (checkBox4.isChecked()) {
            increment(view);
        }


    }

    public void question5Validate(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.Question_5_radioGroup);
        RadioButton rb1 = (RadioButton) findViewById(R.id.Question_5_rb1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.Question_5_rb2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.Question_5_rb3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.Question_5_rb4);
        if (rb3.isChecked()) {
            increment(view);
        } else {
            decrement(view);
        }
    }

    public void question6Validate(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.Question_6_radioGroup);
        RadioButton rb1 = (RadioButton) findViewById(R.id.Question_6_rb1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.Question_6_rb2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.Question_6_rb3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.Question_6_rb4);
        if (rb4.isChecked()) {
            increment(view);
        } else {
            decrement(view);
        }
    }

    public void question7Validate(View view) {
        EditText editor = (EditText) findViewById(R.id.Question_7_textInput);
        String answer = editor.toString();
        if (answer == "Hulk") {
            increment(view);
        } else if (answer == "hulk") {
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

    }
}