class InventoryBalancer {
    public static void main(String[] args) {
        int[] a = {20, 15, 30};
        int[] b = {25, 10, 30};
        int sumA = 0, sumB = 0, max = Integer.MIN_VALUE;
        String section = "";
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
            sumB += b[i];

            if (a[i] > max) {
                max = a[i];
                section = "Section A";
                index = i + 1;
            }

            if (b[i] > max) {
                max = b[i];
                section = "Section B";
                index = i + 1;
            }
        }

        System.out.print("Section A Total: " + sumA);
        System.out.print(" | Section B Total: " + sumB);
        System.out.print(" | Status: " +
                (sumA == sumB ? "Balanced" : "Not Balanced"));
        System.out.println(" | Highest Quantity: " + max +
                " (" + section + ", Item " + index + ")");
    }
}
