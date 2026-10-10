class WordLengthProfiler {
    public static void main(String[] args) {
        String review = "This movie was absolutely fantastic and thrilling";
        int shortW = 0, medium = 0, longW = 0;

        for (String word : review.split("\\s+")) {
            int n = word.length();

            if (n <= 4)
                shortW++;
            else if (n <= 8)
                medium++;
            else
                longW++;
        }

        System.out.println("Short: " + shortW +
                " | Medium: " + medium + " | Long: " + longW);
    }
}
