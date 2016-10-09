package com.example.takasur.footballscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalTeamA(View view) {
        TextView txtScoreTeamA = (TextView) findViewById(R.id.team_a_score);
        txtScoreTeamA.setText("" + (++scoreTeamA));
    }

    public void goalTeamB(View view) {
        TextView txtScoreTeamB = (TextView) findViewById(R.id.team_b_score);
        txtScoreTeamB.setText("" + (++scoreTeamB));
    }

    public void resetScores(View view) {
        scoreTeamA = scoreTeamB = 0;
        TextView txtScoreTeamA = (TextView) findViewById(R.id.team_a_score);
        txtScoreTeamA.setText("0");
        TextView txtScoreTeamB = (TextView) findViewById(R.id.team_b_score);
        txtScoreTeamB.setText("0");
    }
}
