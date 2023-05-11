package com.example.unquote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {

	Button startButton;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_intro);
		startButton = findViewById(R.id.btn_gameStartBtn);
		startButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent mainIntent = new Intent(IntroActivity.this, MainActivity.class);
				startActivity(mainIntent);
			}
		});
	}
}
