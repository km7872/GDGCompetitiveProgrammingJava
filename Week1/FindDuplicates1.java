package Week1;

import java.util.List;

public class FindDuplicates1 {

    /**
     * This function finds all characters in the string `s` that appear more than `k` times.
     *
     * @param s The input string.
     * @param k The threshold for occurrences.
     * @return A list of characters that appear more than `k` times.
     */
    public static List<Character> findDuplicates(String s, int k) {
        // code goes here :)
        return null;
    }

    public static void main(String[] args) {
        // Test case 1
        System.out.println(findDuplicates("abcaabcc", 2));  // Expected Output: [a, c]

        // Test case 2
        System.out.println(findDuplicates("abcdefg", 1));  // Expected Output: []

        // Test case 3
        String longString = "a".repeat(1000) + "b".repeat(500) + "c".repeat(200) + "d".repeat(100);
        System.out.println(findDuplicates(longString, 100));  // Expected Output: [a, b]

        // Test case 4
        longString = "a".repeat(1000);
        System.out.println(findDuplicates(longString, 100));  // Expected Output: [a]

        // Test case 5
        longString = "ababababab".repeat(100);
        System.out.println(findDuplicates(longString, 5));  // Expected Output: [a, b]

        // Test case 6
        longString = "abccbaabcabcabcabca".repeat(100);
        System.out.println(findDuplicates(longString, 10));  // Expected Output: [a, b, c]

        // Test case 7
        longString = "a".repeat(1000) + "b".repeat(500) + "c".repeat(200);
        System.out.println(findDuplicates(longString, 0));  // Expected Output: [a, b, c]

        // Test case 8
        longString = ("a".repeat(500) + "b".repeat(300) + "c".repeat(200)).repeat(50);
        System.out.println(findDuplicates(longString, 300));  // Expected Output: [a, b]

        // Test case 9
        System.out.println(findDuplicates("", 1));  // Expected Output: []

        // Test case 10
        longString = "abcdefghij".repeat(100);
        System.out.println(findDuplicates(longString, 1));  // Expected Output: []
    }
}
