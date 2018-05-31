public class LeetCodeSolution344 {

    public String reverseString(String s) {
        // null / empty and less than 2 check
        if (s == null || s.length() < 2) { return s; }
        StringBuilder sb = new StringBuilder();
        // append to the new string starting from end.
        for (int i = s.length() - 1; i > -1; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) { }
}