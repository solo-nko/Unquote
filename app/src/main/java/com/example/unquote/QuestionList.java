package com.example.unquote;
import java.util.ArrayList;

public class QuestionList
{
	private ArrayList<Question> qList;

	public QuestionList() {
		qList = new ArrayList<Question>();

		Question advice1 = new Question(R.drawable.img_quote_0, "Pretty good advice, and perhaps a scientist did say it... Who actually did?", "Albert Einstein", "Isaac Newton", "Rita Mae Brown", "Rosalind Franklin", 2);
		qList.add(advice1);

		Question advice2 = new Question(R.drawable.img_quote_1, "Was honest Abe honestly quoted? Who authored this pithy bit of wisdom?", "Edward Stieglitz", "Maya Angelou", "Abraham Lincoln", "Ralph Waldo Emerson", 0);
		qList.add(advice2);

		Question advice3 = new Question(R.drawable.img_quote_2, "Easy advice to read, difficult advice to follow; who actually said it?", "Martin Luther King Jr.", "Mother Teresa", "Fred Rogers", "Oprah Winfrey", 1);
		qList.add(advice3);

		Question advice4 = new Question(R.drawable.img_quote_3, "Insanely inspiring, insanely incorrect (maybe). Who is the true source of this inspiration?", "Nelson Mandela", "Harriet Tubman", "Mahatma Ghandhi", "Nicholas Klein", 3);
		qList.add(advice4);

		Question advice5 = new Question(R.drawable.img_quote_4, "A peace worth striving for - who actually reminded us of this?", "Malala Yousafzai", "Martin Luther King Jr.", "Liu Xiaobo", "Dalai Lama", 1);
		qList.add(advice5);

		Question advice6 = new Question(R.drawable.img_quote_5, "Unfortunately, true - but did Marilyn Monroe convey it or did someone else?", "Laurel Thatcher Ulrich", "Eleanor Roosevelt", "Marilyn Monroe", "Queen Victoria", 0);
		qList.add(advice6);



		Question eiffel = new Question(921238, "How tall is the Eiffel Tower?", "1024ft", "1063ft", "1124ft", "1163ft", 1);
		//qList.add(eiffel);

		Question computerAlgorithm = new Question(107343, "Who invented the computer algorithm?", "Charles Babbage", "John Carmack", "Alan Turing", "Ada Lovelace", 3);
		//qList.add(computerAlgorithm);

		Question britTank = new Question(453829, "What is the name of the United Kingdom's current Main Battle Tank?", "Comet", "Centurion", "Challenger", "Chieftain", 2);
		//qList.add(britTank);

		Question photoExp = new Question(839226, "Which of the following settings affects depth of field in photography?", "Aperture", "ISO", "Shutter Speed", "White Balance", 1);
		//qList.add(photoExp);

		Question smashChar = new Question(509281, "Which of the following characters has NOT appeared in Nintendo's Super Smash Bros. series?", "Cloud Strife", "Sonic the Hedgehog", "Crash Bandicoot", "Mewtwo", 2);
		//qList.add(smashChar);
	}
	public ArrayList<Question> getList() {
		return qList;
	}
}
