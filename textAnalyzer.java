package textanalyzer;

import java.text.BreakIterator;
import java.util.Locale;
import java.util.HashMap;
import java.util.Map;

public class textAnalyzer {
	
	
	
	public static TextStatistics analyze(String text) {

        if (text == null || text.trim().isEmpty()) {
            return new TextStatistics(0, 0, 0, 0, 0);
        }

        int words = sumOfWords(text);
        int sentences = sumOfSentences(text);
        int letters = sumOfLetters(text);
        int charsNoSpaces = sumOfChars(text);
        int charsWithSpaces = sumOfAllChars(text);

        return new TextStatistics(words, sentences, letters, charsNoSpaces, charsWithSpaces);
    }

	
//how many words by trimming		
		public static int sumOfWords(String text) {
		    if (text == null || text.trim().isEmpty()) {
		        return 0;
		    }

		    String cleaned = text.replaceAll("[^a-zA-Z ]", "");
		    String[] words = cleaned.trim().split("\\s+");
		    return words.length;
		}
		
	
//how many sentences using breakiterator
		public static int sumOfSentences(String text) {
			if (text == null || text.trim().isEmpty()) {
		        return 0;
		    }
			
			BreakIterator iterator =
	                BreakIterator.getSentenceInstance(Locale.ENGLISH);

	        iterator.setText(text);

	        int count = 0;
	        int start = iterator.first();

	        for (int end = iterator.next();
	             end != BreakIterator.DONE;
	             start = end, end = iterator.next()) {

	            String sentence = text.substring(start, end).trim();

	            if (!sentence.isEmpty()) {
	                count++;
	            }
	        }

	        return count;
		}
		
		
//how many letters (no signs, extra method below)
		public static int sumOfLetters(String text) {
			if (text == null || text.trim().isEmpty()) {
		        return 0;
		    }
			
			int count = 0;

		    for (int i = 0; i < text.length(); i++) {
		        char c = text.charAt(i);

		        if (Character.isLetter(c)) {
		            count++;
		        }
		    }

		    return count;
		}
	
		
//how many chars (whitespace EXcluded)
		public static int sumOfChars(String text) {
			if (text == null || text.trim().isEmpty()) {
		        return 0;
		    }
			
			int count = 0;
			
			for (int i = 0; i < text.length(); i++) {
				if (!Character.isWhitespace(text.charAt(i)))
				count++;
			}
			
			return count;
		}
		
		
//how many chars (whitespace INcluded)
		public static int sumOfAllChars(String text) {
			if (text == null || text.trim().isEmpty()) {
		        return 0;
		    }
			
			return text.length();
		}
		
		
//how often do words occur (upper/lower case ignored)
		public static Map<String, Integer> wordFrequency(String text) {
			if (text == null || text.trim().isEmpty()) {
		        return new HashMap<>();
		    }
			
			 String[] words = text
			            .toLowerCase()
			            .replaceAll("[^a-zA-Z\\s]", "")
			            .trim()
			            .split("\\s+");

			    Map<String, Integer> freq = new HashMap<>();

			    for (String word : words) {
			        if (word.isEmpty()) continue;

			        freq.put(word, freq.getOrDefault(word, 0) + 1);
			    }

			    return freq;		    
		    
		}
		
		
	

	
	public static void main(String[] args) {
	
		String input;

        // CLI 
        if (args.length > 0) {
            input = String.join(" ", args);
        } else {
            input = "Hello world. This is a default text.";
        }

        TextStatistics result = textAnalyzer.analyze(input);

        System.out.println(result);




	}

}
