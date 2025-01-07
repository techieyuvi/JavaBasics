public class Practice {

    public String altPairs(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i += 4) {
            res += str.charAt(i);
            if (i + 1 < str.length()) {
                res += str.charAt(i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Practice pair = new Practice();

        System.out.println(pair.altPairs("chocolateboy"));
    }

}
