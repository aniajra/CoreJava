package test;

public class WordCount {

    public static void main(String args[]) {

        String str = "Clean World Green World Green ";

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
