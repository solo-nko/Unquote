package com.example.unquote;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {
	int totalCorrect;
	int totalQuestions;
	double scorePercentage;
	Button playAgainButton;
	Button backToStartButton;
	TextView scoreEvalText;
	TextView scoreSummaryText;
	TextView scorePercentText;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_gameover);
		scoreEvalText = findViewById(R.id.gameover_summary_evaltext);
		scoreSummaryText = findViewById(R.id.gameover_summary_scoretext);
		scorePercentText = findViewById(R.id.gameover_summary_scorepercent);
		playAgainButton = findViewById(R.id.btn_replay);
		backToStartButton = findViewById(R.id.btn_backToStart);

		totalCorrect = getIntent().getIntExtra("total_correct", 0);
		totalQuestions = getIntent().getIntExtra("total_questions", 0);

		backToStartButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent introIntent = new Intent(GameOverActivity.this, IntroActivity.class);
				startActivity(introIntent);
			}
		});

		score();
	}

	/*Credit:
	* https://stackoverflow.com/a/8487819 */
	public double roundDown2(double d) {
		return Math.floor(d * 1e2) / 1e2;
	}

	public void score() {
		double totalCorrectDouble = totalCorrect;
		double totalQuestionsDouble = totalQuestions;
		scorePercentage = roundDown2(((totalCorrectDouble/totalQuestionsDouble)*100));
		if (scorePercentage == 100) {
			scoreEvalText.setText("You got all of them right!");
		} else {
			scoreEvalText.setText("Good game!");
		}
		scoreSummaryText.setText("You got " + totalCorrect + " out of " + totalQuestions + " right, for a final score of...");
		scorePercentText.setText(scorePercentage + "%");
	}
}
