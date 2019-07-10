package code.challenges401.RepeatedWord;

import code.challenges401.hashtable.Hashtable;

import java.util.ArrayList;

public class RepeatedWord {
    public static String repeatedWord(String input){
        if(input == null) return null;
        Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
        String[] wordList = input.split(" ");
        for(int i = 0; i < wordList.length; i++){
            if(hashtable.contains(wordList[i].toLowerCase())) return wordList[i];
            else hashtable.add(wordList[i].toLowerCase(), 1);
        }
        return null;
    }
}
