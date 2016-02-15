import java.util.*;
import java.io.*;


public class ArrayListMerge {
    public static ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();

        for (String w : words) {
            sentence.add(w);
        }

        for (String w : more) {
            sentence.add(w);
        }

        return sentence;
    }

    public static void main(String[] args) {
        String[] words = {"asd", "asd", "asd"};
        String[] more = {"qwe", "qwe", "qwe"};
        System.out.println(merge(words, more));
    }
}