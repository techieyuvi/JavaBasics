public class ReverseFromChar {


    static String reverseFromCharacter(String word) {

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == 'i') {
                String split = word.substring(0, i);
                StringBuilder sb = new StringBuilder(split);
                sb.reverse();
                return sb.toString() + word.substring(i + 1);
            }
        }
        return word;
    }

    public static void main(String[] args) {
        String input = "string";

        System.out.println(reverseFromCharacter(input));
    }

}
