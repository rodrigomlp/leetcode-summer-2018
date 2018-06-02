public public class LeetCodeSolution412 {
    public List<String> fizzBuzz(int n) {
        // less than 1 check
        if (n < 1) { return null; }
        // FIZZBUZZ
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(i + "");
            }
        }
        return list;
    }

    public static void main(String[] args) { }
}