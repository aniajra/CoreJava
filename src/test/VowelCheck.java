package test;

import java.util.Locale;

public class VowelCheck {

    public static void main(String args[]) {

        String str = "Clean World Green World";
        str = str.toLowerCase();
        String[] strArray = str.split("");
        String[] vowelArray = {"a", "e", "i", "o", "u"};
        int count = 0;

        for (String ch : strArray) {
            for (String vo : vowelArray) {
                if (vo.equals(ch)) {
                    count++;
                }
            }
        }
        System.out.println("The Vowel Count " + count);

        String[] strArray1 = str.split(" ");
        String word = "";
        int wordCount = 0;

        for (String ab : strArray1){
            wordCount = 0;
            word = ab;
            for (String ch : strArray1) {
                if (word.equals(ch)) {
                    wordCount++;
                }
        }
        System.out.print("Word " + word);
        System.out.println(" and Count " + wordCount);
    }
    }
}
