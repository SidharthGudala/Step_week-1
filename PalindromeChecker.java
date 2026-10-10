class PalindromeChecker {
    static boolean iterative(String s) {
        for (int i = 0; i < s.length() / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        return true;
    }

    static boolean recursive(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return recursive(s, l + 1, r - 1);
    }

    static boolean arrayReverse(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length / 2; i++) {
            char t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }
        return s.equals(new String(a));
    }

    public static void main(String[] args) {
        String s = "madam";

        System.out.println("Iterative: " +
                (iterative(s) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Recursive: " +
                (recursive(s, 0, s.length() - 1)
                        ? "Palindrome" : "Not Palindrome"));

        System.out.println("Array Reversal: " +
                (arrayReverse(s) ? "Palindrome" : "Not Palindrome"));
    }
}
