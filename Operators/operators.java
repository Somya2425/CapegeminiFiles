public class operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        // Airthmetic operator 
        System.out.println("addition = " + (a+b));
        System.out.println("subtration = " + (a-b));
        
        // Ternary operator
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = " + max);

        // Shift operator
        System.out.println("left shift = " + (a<<1));

    }
}
