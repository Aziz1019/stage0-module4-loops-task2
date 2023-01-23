package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String phrase = "";
        int counter = 0;
        while (counter < chars.length) {
            phrase += String.valueOf(chars[counter]);
            counter++;
        }
        System.out.println(phrase);
    }

    public static void main(String[] args) {
        WordsBuilder builder = new WordsBuilder();
        builder.buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');

    }
}
