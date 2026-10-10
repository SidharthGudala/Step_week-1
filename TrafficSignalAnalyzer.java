class TrafficSignalAnalyzer {
    public static void main(String[] args) {
        String log = "RRGGGYRR";
        int count = 1, max = 1;
        char color = log.charAt(0), best = color;

        for (int i = 1; i < log.length(); i++) {
            if (log.charAt(i) == log.charAt(i - 1))
                count++;
            else
                count = 1;

            if (count > max) {
                max = count;
                best = log.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + best +
                "' repeated " + max + " times");
    }
}
