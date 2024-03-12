public class TypeCasting {
    /*
     * Implicit type casting, also known as widening conversion,
     * is done automatically by the compiler when there is no loss of data.
     * Explicit type casting in Java, on the other hand, requires manual
     * intervention
     * and is used when there is a possibility of data loss.
     */
    public static void main(String[] args) {

        int a = 5;
        float b = a; // Implicit - No data loss,compiler will automatically take care of it. WIDENING
        System.out.println(b);
        float f = 5.6f;
        int c = (int) f;// explicit - we will loose data : NARROWING
        System.out.println(c);
    }

}
