package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamB = 0;
    int scoreTeamA = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayEnd(String text) {
        TextView textof = (TextView) findViewById(R.id.textView);
        textof.setText(text);
    }

    public void threePointer(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointer(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrow(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePoints(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPoints(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrows(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void Reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayEnd("");
    }

    public void teamA(View view) {
        if (scoreTeamA == 0) {
            scoreTeamA = 0;
        } else {
            scoreTeamA -= 1;
            displayForTeamA(scoreTeamA);
        }
    }

    public void teamB(View view) {
        if (scoreTeamB == 0) {
            scoreTeamB = 0;
        } else {
            scoreTeamB -= 1;
            displayForTeamB(scoreTeamB);
        }

    }

    public void endGame(View view) {
        EditText teamA=(EditText)findViewById(R.id.etblue);
        String valueA=teamA.getText().toString();
        EditText teamB=(EditText)findViewById(R.id.etred);
        String valueB=teamB.getText().toString();
        if (scoreTeamA > scoreTeamB) {
            displayEnd(valueA + " wins!");
        } else if (scoreTeamA == scoreTeamB) {
            displayEnd("ITS A DRAW!");
        } else {
            displayEnd(valueB + " wins!");
        }
    }

}
