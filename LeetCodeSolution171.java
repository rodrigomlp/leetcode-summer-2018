public class LeetCodeSolution171 {

    public static int titleToNumber(String s) {
        int ttn = 0;
        for (char c : s.toCharArray()) {
            // get the signicant column numbers
            ttn = ttn * 26;
            // add the score to the accumulator
            ttn = ttn + (s.charAt(i) - 'A' + 1);
        }
        return ttn;
    }

    public static void main(String[] args) { System.out.println((int)'A'); }
}