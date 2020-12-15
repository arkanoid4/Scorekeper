package cl.ucn.disc.dsm.dsuares.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mScore1;
    private int mScore2;
    private TextView mScoreText1;
    private TextView mScoreText2;

    /**
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * @param view
     */
    public void decreaseScore(View view) {
        // Get the ID of the button that was clicked.
        int viewID = view.getId();
        switch (viewID) {
            // If it was on Team 1:
            case R.id.decreaseTeam1:
                // Decrement the score and update the TextView.
                mScore1--;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
            // If it was Team 2:
            case R.id.decreaseTeam2:
                // Decrement the score and update the TextView.
                mScore2--;
                mScoreText2.setText(String.valueOf(mScore2));
        }
    }

    /**
     *
     * @param view
     */
    public void increaseScore(View view) {
        // Get the ID of the button that was clicked.
        int viewID = view.getId();
        switch (viewID) {
            // If it was on Team 1:
            case R.id.increaseTeam1:
                // Increment the score and update the TextView.
                mScore1++;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
            // If it was Team 2:
            case R.id.increaseTeam2:
                // Increment the score and update the TextView.
                mScore2++;
                mScoreText2.setText(String.valueOf(mScore2));
        }
    }


}