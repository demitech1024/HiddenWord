public class HiddenWord {
    
    private String word;

    public HiddenWord(String word) {
        this.word = word;
    }
    
    public static String getHint(String guess) {
        String hint = "";
        String words = word;
        for (int i = 0; i <= guess.length() - 1; i++) {
            if (guess.charAt(i) == words.charAt(i)) {
                hint += String.valueOf(guess.charAt(i));
            } else if (words.contains(String.valueOf(guess.charAt(i)))) {
                hint += "+";
            } else {
                hint += "*";
            }
        }
        return hint;
    }
}