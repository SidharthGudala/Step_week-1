class BMICalculator {
    static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        double[] height = {1.75, 1.60};
        double[] weight = {70, 90};

        System.out.println("Person | Height | Weight | BMI | Status");

        for (int i = 0; i < height.length; i++) {
            double bmi = weight[i] / (height[i] * height[i]);

            System.out.printf("%d | %.2f | %.2f | %.2f | %s%n",
                    i + 1, height[i], weight[i], bmi, status(bmi));
        }
    }
}
