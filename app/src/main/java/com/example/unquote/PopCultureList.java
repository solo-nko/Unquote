package com.example.unquote;

import java.util.ArrayList;

public class PopCultureList extends QuestionList {
	public PopCultureList () {
		qList = new ArrayList<Question>();

		Question advice1 = new Question(R.drawable.img_quote_0, "Pretty good advice, and perhaps a scientist did say it... Who actually did?", "Albert Einstein", "Isaac Newton", "Rita Mae Brown", "Rosalind Franklin", 2);
		qList.add(advice1);

		Question advice2 = new Question(R.drawable.img_quote_1, "Was honest Abe honestly quoted? Who authored this pithy bit of wisdom?", "Edward Stieglitz", "Maya Angelou", "Abraham Lincoln", "Ralph Waldo Emerson", 0);
		qList.add(advice2);

		Question advice3 = new Question(R.drawable.img_quote_2, "Easy advice to read, difficult advice to follow; who actually said it?", "Martin Luther King Jr.", "Mother Teresa", "Fred Rogers", "Oprah Winfrey", 1);
		qList.add(advice3);

		Question advice4 = new Question(R.drawable.img_quote_3, "Insanely inspiring, insanely incorrect (maybe). Who is the true source of this inspiration?", "Nelson Mandela", "Harriet Tubman", "Mahatma Ghandhi", "Nicholas Klein", 3);
		qList.add(advice4);

		Question advice5 = new Question(R.drawable.img_quote_4, "A peace worth striving for - who actually reminded us of this?", "Malala Yousafzai", "Martin Luther\n King Jr.", "Liu Xiaobo", "Dalai Lama", 1);
		qList.add(advice5);

		Question advice6 = new Question(R.drawable.img_quote_5, "Unfortunately, true - but did Marilyn Monroe convey it or did someone else?", "Laurel Thatcher\n Ulrich", "Eleanor Roosevelt", "Marilyn Monroe", "Queen Victoria", 0);
		qList.add(advice6);

		Question advice7 = new Question(R.drawable.img_quote_6, "Here's the truth, Will Smith DID say this, but in which movie?", "Independence Day", "Bad Boys", "Men in Black", "The Pursuit of\n Happiness", 2);
		qList.add(advice7);

		Question advice8 = new Question(R.drawable.img_quote_7, "Which TV funny gal actually quipped this 1-liner?", "Ellen Degeneres", "Amy Poehler", "Betty White", "Tina Fey", 3);
		qList.add(advice8);

		Question advice9 = new Question(R.drawable.img_quote_8, "This mayor won't get my vote - but did he actually give this piece of advice? And if not, who did?", "Forrest Gump", "Dorry\n (Finding Nemo)", "Esther Williams", "The Mayor (Jaws)", 1);
		qList.add(advice9);

		Question advice10 = new Question(R.drawable.img_quote_9, "Her heart will go on, but whose heart is it?", "Whitney Houston", "Diana Ross", "Celine Dion", "Mariah Carey", 0);
		qList.add(advice10);

		Question advice11 = new Question(R.drawable.img_quote_10, "He's the king of something alright - to whom does this self-titling line belong to?", "Tony Montana\n (Scarface)", "Joker \n(The Dark Knight)", "Lex Luthor\n (Batman v Superman)", "Jack (Titanic)", 3);
		qList.add(advice11);

		Question advice12 = new Question(R.drawable.img_quote_11, "Is \"Grey\" synonymous for \"wise\"? If so, maybe Gandalf did preach this advice. If not, who did?", "Yoda (Star Wars)", "Gandalf\n (Lord of the Rings)", "Dumbledore\n (Harry Potter)","Uncle Ben\n (Spider-Man)", 0);
		qList.add(advice12);

		Question advice13 = new Question(R.drawable.img_quote_12, "Houston, we have a problem with this quote - which space-traveler does this catchphrase actually belong to?", "Han Solo (Star Wars)", "Captain Kirk\n (Star Trek)", "Jim Lovell\n (Apollo 13)", "Buzz Lightyear\n (Toy Story)", 2);
		qList.add(advice13);
	}
}
