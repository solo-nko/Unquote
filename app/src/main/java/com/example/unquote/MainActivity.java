package com.example.unquote;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

	int currentQuestionIndex = 0;
	int totalCorrect = 0;
	int totalQuestions = 0;

	ArrayList<Question> questions; //an arraylist to hold the Question objects. Or, in humanspeak, a list we can put the questions in.

	ImageView imgQuestion;
	TextView questionText;
	TextView numRemainingQuestions;
	TextView txtRemainingQuestions;
	Button btnAnswer1;
	Button btnAnswer2;
	Button btnAnswer3;
	Button btnAnswer4;
	Button btnSubmit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		imgQuestion = findViewById(R.id.img_questionImage);
		questionText = findViewById(R.id.txt_questionText);
		btnAnswer1 = findViewById(R.id.btn_answer1);
		btnAnswer2 = findViewById(R.id.btn_answer2);
		btnAnswer3 = findViewById(R.id.btn_answer3);
		btnAnswer4 = findViewById(R.id.btn_answer4);
		btnSubmit = findViewById(R.id.btn_submit);
		numRemainingQuestions = findViewById(R.id.txt_numRemainingQuestions);
		txtRemainingQuestions = findViewById(R.id.txt_questionsLeft);

		//code to run on pressing each of the buttons
		btnAnswer1.setOnClickListener(view -> onAnswerSelection(0));
		btnAnswer2.setOnClickListener(view -> onAnswerSelection(1));
		btnAnswer3.setOnClickListener(view -> onAnswerSelection(2));
		btnAnswer4.setOnClickListener(view -> onAnswerSelection(3));

		btnSubmit.setOnClickListener(view -> onAnswerSubmission());

		startNewGame();
	}



	public int generateRandomNumber(int max) { //note that this function's logic rounds down due to how it works.  meaning, if you set max to 100, the highest it will return is 99.
		double test = Math.random()*max; //get a random number between 0 and max.
		int output = (int) test; //cast the random number down to an integer by dropping the decimals
		return output;
	}

	//retrieves the question currently on deck.
	public Question getCurrentQuestion() {
		return questions.get(currentQuestionIndex);
	}

	public Question chooseNewQuestion() {
		int randomQuestion = generateRandomNumber(questions.size()); //todo: verify that the bounds are correct here

		currentQuestionIndex = randomQuestion;
		return getCurrentQuestion();
	}

	private void resetAnswerButtons(Question inputQuestion) {
		btnAnswer1.setText(inputQuestion.choice1);
		btnAnswer2.setText(inputQuestion.choice2);
		btnAnswer3.setText(inputQuestion.choice3);
		btnAnswer4.setText(inputQuestion.choice4);
	}

	public void displayQuestion(Question inputQuestion) {
		imgQuestion.setImageResource(inputQuestion.imageId);
		questionText.setText(inputQuestion.questionText);
		resetAnswerButtons(inputQuestion);
	}

	public void startNewGame() {

		questions = new PopCultureList().getList(6);
		totalCorrect = 0;
		totalQuestions = questions.size();

		Question firstQuestion = chooseNewQuestion();
		displayQuestion(firstQuestion);
		displayQuestionsRemaining(questions.size());
	}

	public void displayQuestionsRemaining(int remainingQuestions) {
		numRemainingQuestions.setText(Integer.toString(remainingQuestions));
		if (remainingQuestions > 1) {
			txtRemainingQuestions.setText(R.string.questionsLeft);
		} else {
			txtRemainingQuestions.setText(R.string.questionLeft);
		}
	}

	public void onAnswerSelection(int answerSelection) {
		Question currentQuestion = getCurrentQuestion();
		currentQuestion.playerAnswer = answerSelection;
		resetAnswerButtons(currentQuestion);
		switch (answerSelection) {
			case 0:
				btnAnswer1.setText("✔ " + currentQuestion.choice1);
				break;
			case 1:
				btnAnswer2.setText("✔ " + currentQuestion.choice2);
				break;
			case 2:
				btnAnswer3.setText("✔ " + currentQuestion.choice3);
				break;
			case 3:
				btnAnswer4.setText("✔" + currentQuestion.choice4);
				break;
		}
	}

	//things to do upon submitting an answer
	public void onAnswerSubmission() {
		//if no answer has been selected yet (as indicated by the playerAnswer still being its default -1), we tell the player that we need an answer, and exit the method.
		if (getCurrentQuestion().playerAnswer == -1) {
			AlertDialog.Builder nothingSelected = new AlertDialog.Builder(MainActivity.this);
			nothingSelected.setTitle("No answer selected!");
			nothingSelected.setMessage("You need to select an answer first.");
			nothingSelected.create().show(); //display popup
			return;
		}

		//if the player's answer matches the correct answer (as determined by the isCorrect() Question method), increment the number of correctly answered questions
		if (getCurrentQuestion().isCorrect() == true) {
			totalCorrect++;
		}
		questions.remove(getCurrentQuestion());
		displayQuestionsRemaining(questions.size());

		//if there are no questions remaining, run gameOverMessage() and then create a new game
		if (questions.size() == 0) {
			Intent gameOverIntent = new Intent(MainActivity.this, GameOverActivity.class);
			gameOverIntent.putExtra("total_correct", totalCorrect);
			gameOverIntent.putExtra("total_questions", totalQuestions);
			startActivity(gameOverIntent);
			System.out.println(gameOverMessage(totalCorrect, totalQuestions));
//			startNewGame();
			//otherwise, determine the next question
		} else {
			chooseNewQuestion();
			displayQuestion(getCurrentQuestion());
		}
	}

	public String gameOverMessage(int totalCorrect, int totalQuestions) {
		String output1 = "You got all " + totalCorrect + " questions! Nice.";
		String output2 = "You got " + totalCorrect + " out of " + totalQuestions + " questions right. Definitely room for improvement!";
		if (totalCorrect == totalQuestions) {
			return output1;
		} else {
			return output2;
		}
	}
}