class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            while (start < end && !isVowel(arr[start])) {
                start++;
            }

            while (start < end && !isVowel(arr[end])) {
                end--;
            }

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }

    public boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna