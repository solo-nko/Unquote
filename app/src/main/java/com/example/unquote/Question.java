package com.example.unquote;

public class Question
{
	int correctAnswer;
	int playerAnswer;
	int imageId;
	String questionText;
	String choice1;
	String choice2;
	String choice3;
	String choice4;

	public Question(int imageIdentifier, String questionString, String answer1, String answer2, String answer3, String answer4, int correctAnswerIndex) {
		imageId = imageIdentifier;
		questionText = questionString;
		choice1 = answer1;
		choice2 = answer2;
		choice3 = answer3;
		choice4 = answer4;
		correctAnswer = correctAnswerIndex;
		playerAnswer = -1;
	}

	public boolean isCorrect() {
		if (playerAnswer == correctAnswer) {
			return true;
		} else {
			return false;
		}
	}
}
