class ReverseCustomerName {
    static String reverseCustomerName(String name) {
        String reversed = "";

        for (int i = name.length() - 1; i >= 0; i--)
            reversed += name.charAt(i);

        return reversed;
    }

    public static void main(String[] args) {
        String name = "Sunil";

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reverseCustomerName(name));
    }
}
