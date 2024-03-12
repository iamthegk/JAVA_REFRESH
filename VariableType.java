public class VariableType {
    // instance variable

    int a = 5;// instance var
    static int c = 15;

    static int test() {// method with return type
        // loal variable
        int b = 10;
        return b;
    }

    public static void main(String[] args) {
        VariableType variabletype = new VariableType();// object creation
        System.out.println(variabletype.a);
        System.out.println(VariableType.c);
        System.out.println(test());

    }

}