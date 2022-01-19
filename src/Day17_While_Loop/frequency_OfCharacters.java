package Day17_While_Loop;

public class frequency_OfCharacters {
    public static void main(String[] args) {
        String str = "AAABBBC";
        int frequency=0;
        char ch = 'A';
        for (int i = 0; i < str.length(); i++) { // i: index of str
            char eachChar = str.charAt(i);            //eachChar: each character of str.
            if(ch==eachChar){//if given ch is matching with the eachChar,
                frequency++;
            }
            System.out.println(frequency);
        }
    }
}
