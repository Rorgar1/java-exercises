package exercises;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.ArrayList;

public class ArrayListandStrings {
    public static void main(String[] args) {
        //program to print all words that are 5 characters in length

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Beach");
        wordList.add("Water");
        wordList.add("Free");
        wordList.add("Bread");
        wordList.add("Shawn");
        wordList.add("Bridge");
        wordList.add("Java");
        wordList.add("Coffee");
        wordList.add("Sleep");
        wordList.add("Jennifer");
        wordList.add("Jeffery");
        wordList.add("Poster");

        printFive(wordList);
    }

    public static void printFive(ArrayList<String> alist) {

        for (String word : alist) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
