public class HiddenWord {
    
    private String word;

    public HiddenWord(String word) {
        this.word = word;
    }
    
    public String getHint(String guess) {
        String hint = "";
        for (int i = 0; i <= guess.length() - 1; i++) {
            if (guess.charAt(i) == word.charAt(i)) {
                hint += String.valueOf(guess.charAt(i));
            } else if (word.contains(CharSequence.valueOf(guess.charAt(i)))) {
                hint += "+";
            } else {
                hint += "*";
            }
        }
        return hint;
    }
    
}