package com.example.unquote;
import java.util.ArrayList;

public class QuestionList
{
	private ArrayList<Question> qList;

	public QuestionList() {
		qList = new ArrayList<Question>();
		Question eiffel = new Question(921238, "How tall is the Eiffel Tower?", "1024ft", "1063ft", "1124ft", "1163ft", 1);
		qList.add(eiffel);

		Question computerAlgorithm = new Question(107343, "Who invented the computer algorithm?", "Charles Babbage", "John Carmack", "Alan Turing", "Ada Lovelace", 3);
		qList.add(computerAlgorithm);

		Question britTank = new Question(453829, "What is the name of the United Kingdom's current Main Battle Tank?", "Comet", "Centurion", "Challenger", "Chieftain", 2);
		qList.add(britTank);

		Question photoExp = new Question(839226, "Which of the following settings affects depth of field in photography?", "Aperture", "ISO", "Shutter Speed", "White Balance", 1);
		qList.add(photoExp);

		Question smashChar = new Question(509281, "Which of the following characters has NOT appeared in Nintendo's Super Smash Bros. series?", "Cloud Strife", "Sonic the Hedgehog", "Crash Bandicoot", "Mewtwo", 2);
		qList.add(smashChar);
	}
	public ArrayList<Question> getList() {
		return qList;
	}
}
