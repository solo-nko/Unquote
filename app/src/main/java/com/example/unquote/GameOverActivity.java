package com.example.unquote;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameOverActivity extends AppCompatActivity {
	int totalCorrect = getIntent().getIntExtra("total_correct", 0);
	int totalQuestions = getIntent().getIntExtra("total_questions", 0);
	Button playAgainButton;
	Button backToStartButton;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_gameover);
		playAgainButton = findViewById(R.id.btn_replay);
		backToStartButton = findViewById(R.id.btn_backToStart);

		backToStartButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent introIntent = new Intent(GameOverActivity.this, IntroActivity.class);
			}
		});
	}
}
