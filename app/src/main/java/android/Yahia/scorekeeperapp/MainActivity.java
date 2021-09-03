package android.Yahia.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    int foulsTeamA=0;
    int foulsTeamB=0;
    int cornersTeamA=0;
    int cornersTeamB=0;
    /**
     * Displays the given score for Team A.
     */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goalsTeamA(View view){
        ++scoreTeamA;
        displayTeamAGoals(scoreTeamA);

    }
    public void goalsTeamB(View view){
        ++scoreTeamB;
        displayTeamBGoals(scoreTeamB);

    }
    public void cornersTeamA(View view){
        ++cornersTeamA;
        displayTeamACorners(cornersTeamA);
    }

    public void cornersTeamB(View view){
        ++cornersTeamB;
        displayTeamBCorners(cornersTeamB);
    }
    public void foulsTeamA(View view){
        ++foulsTeamA;
        displayTeamAFouls(foulsTeamA);
    }
    public void foulsTeamB(View view){
        ++foulsTeamB;
        displayTeamBFouls(foulsTeamB);
    }

    public void resetTeamAB(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        foulsTeamA=0;
        foulsTeamB=0;
        cornersTeamA=0;
        cornersTeamB=0;
        resetTeamAB(scoreTeamB,scoreTeamA,foulsTeamA,foulsTeamB,cornersTeamA,cornersTeamB);
    }

    public void displayTeamAGoals (int number){
        TextView goalsCounterTeamA = (TextView)findViewById(R.id.team_a_goals);
        goalsCounterTeamA.setText(""+ number);
    }
    public void displayTeamBGoals (int number){
        TextView goalsCounterTeamB = (TextView)findViewById(R.id.team_b_goals);
        goalsCounterTeamB.setText(""+ number);
    }

    public void displayTeamACorners (int number){
        TextView cornersCounterTeamA = (TextView)findViewById(R.id.team_a_corners);
        cornersCounterTeamA.setText(""+ number);
    }
    public void displayTeamBCorners (int number){
        TextView cornersCounterTeamB = (TextView)findViewById(R.id.team_b_corners);
        cornersCounterTeamB.setText(""+ number);
    }

    public void displayTeamAFouls (int number){
        TextView foulsCounterTeamA = (TextView)findViewById(R.id.team_a_fouls);
        foulsCounterTeamA.setText(""+ number);
    }
    public void displayTeamBFouls (int number){
        TextView foulsCounterTeamB = (TextView)findViewById(R.id.team_b_fouls);
        foulsCounterTeamB.setText(""+ number);
    }

    public void resetTeamAB (int teamAGoals,int teamBGoals, int teamAFouls, int teamBFouls, int teamACorners, int teamBCorners){
        TextView goalsCounterTeamA = (TextView)findViewById(R.id.team_a_goals);
        goalsCounterTeamA.setText(""+ teamAGoals);

        TextView foulsCounterTeamA = (TextView)findViewById(R.id.team_a_fouls);
        foulsCounterTeamA.setText(""+ teamAFouls);

        TextView cornersCounterTeamA = (TextView)findViewById(R.id.team_a_corners);
        cornersCounterTeamA.setText(""+ teamACorners);

        TextView goalsCounterTeamB = (TextView)findViewById(R.id.team_b_goals);
        goalsCounterTeamB.setText(""+ teamBGoals);

        TextView foulsCounterTeamB = (TextView)findViewById(R.id.team_b_fouls);
        foulsCounterTeamB.setText(""+ teamBFouls);

        TextView cornersCounterTeamB = (TextView)findViewById(R.id.team_b_corners);
        cornersCounterTeamB.setText(""+ teamBCorners);

    }
}