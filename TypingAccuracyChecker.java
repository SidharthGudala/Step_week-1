class TypingAccuracyChecker {
    public static void main(String[] args) {
        String original = "hello world";
        String typed = "hello worlt";
        int matched = 0, first = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i))
                matched++;
            else if (first == -1)
                first = i;
        }

        double accuracy = matched * 100.0 / original.length();

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%",
                matched, original.length(), accuracy);

        if (first == -1)
            System.out.println(" | No Mismatches");
        else
            System.out.printf(" | First Mismatch at position %d ('%c' vs '%c')%n",
                    first + 1, original.charAt(first), typed.charAt(first));
    }
}
