class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "swiss";
        char result = 0;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++)
                if (s.charAt(i) == s.charAt(j))
                    count++;

            if (count == 1) {
                result = s.charAt(i);
                break;
            }
        }

        if (result != 0)
            System.out.println("First Non-Repeating Character: '" + result + "'");
        else
            System.out.println("No Non-Repeating Character Found");
    }
}
