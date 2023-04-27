package com.example.unquote;
import java.util.ArrayList;

public class QuestionList
{
	protected ArrayList<Question> qList;

	public QuestionList() {
	}

	//I use method overloading to give optional parameters. In JavaScript this is the same as using default parameters. Here you can call getList either with or without the boolean, and it will run differently depending.
	public ArrayList<Question> getList() {
		return qList;
	}

	//return a specified number of randomly picked questions
	public ArrayList<Question> getList(int randomCap)
	{
		ArrayList<Question> randomList = new ArrayList<Question>();
		double max = qList.size();
		int maxInt = (int)max;
		int testCounter = 0; //only for debugging purposes. tests to see if the loop is successfully deflecting duplicates by displaying a counter each time the loop completes.
		if (randomCap <= maxInt && randomCap > 0)
		{
			//check for duplicates
			int i = 0;
			while	(i < randomCap) {
				int randomNumberIndex = (int)(Math.random()*max);
				Question randomQuestion = qList.get(randomNumberIndex);
				boolean isDupe = false; //set a flag, it starts out false
				for (Question test: randomList) { //check the potential new addition against the imageID of each existing addition (test)
					if (randomQuestion.imageId == test.imageId) { //if one is found to match, isDupe is flipped to true
						isDupe = true;
					}
				}

				//if isDuple is still false after checking against the existing arraylist, add randomQuestion
				if (isDupe == false) {
					randomList.add(randomQuestion);
					i++;
				}
				testCounter++; //if the counter is higher than i or the randomList size, we can guess that some duplicates were probably deflected (because the loop ran more times than it actually added to the list)
			}
		}
		return randomList;
	}
}
