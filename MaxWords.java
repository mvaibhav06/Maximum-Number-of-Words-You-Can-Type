public class MaxWords {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] input = text.split(" ");
        int out = 0;
        for(int i=0; i<input.length; i++){
            String temp = input[i];
            int j = 0;
            for(j=0; j<temp.length(); j++){
                if(brokenLetters.contains(temp.charAt(j)+"")){
                    break;
                }
            }
            if(j == temp.length()) out++;
        }
        return out;
    }
}
