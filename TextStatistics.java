package textanalyzer;

import java.util.Map;

public class TextStatistics {

    private final int wordCount;
    private final int sentenceCount;
    private final int letterCount;
    private final int charCountNoSpaces;
    private final int charCountWithSpaces;

    public TextStatistics(int wordCount,
                          int sentenceCount,
                          int letterCount,
                          int charCountNoSpaces,
                          int charCountWithSpaces) {

        this.wordCount = wordCount;
        this.sentenceCount = sentenceCount;
        this.letterCount = letterCount;
        this.charCountNoSpaces = charCountNoSpaces;
        this.charCountWithSpaces = charCountWithSpaces;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getSentenceCount() {
        return sentenceCount;
    }

    public int getLetterCount() {
        return letterCount;
    }

    public int getCharCountNoSpaces() {
        return charCountNoSpaces;
    }

    public int getCharCountWithSpaces() {
        return charCountWithSpaces;
    }

    @Override
    public String toString() {
        return "TextStatistics {" +
                "\n  words=" + wordCount +
                ",\n  sentences=" + sentenceCount +
                ",\n  letters=" + letterCount +
                ",\n  chars (no spaces)=" + charCountNoSpaces +
                ",\n  chars (with spaces)=" + charCountWithSpaces +
                "\n}";
    }
}
