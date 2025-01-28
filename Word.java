import java.util.List;
import java.util.ArrayList;

public class Word
{
	private String word;
	private static final String VOWELS = "AEIOUaeiou";   //static means only one


	public Word()
	{
		word = "triangle";
	}

	public Word(String newWord)
	{
		setWord(newWord);
	}

	public void setWord(String newWord)
	{
		word = newWord;
	}

	
	public int getNumVowels()
	{
		
		int count = 0;
		//Loop for every letter in "word"
		for(int i = word.length() - 1; i >= 0; i--)
		{
			if(VOWELS.indexOf(word.charAt(i)) > -1) 
			{
				count++;
			}
		}
		//Use indexOf to see if the letter is in the string "vowels"
			
			
		return count;
	}
			
				
			
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word;
	}
}