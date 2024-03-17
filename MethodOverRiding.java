
/**
 * InnerMethodOverRiding
 */
class test {

    void one() {
        System.out.println("walking");
    }

}

class two extends test {
    void one() {
        System.out.println("running");// over riding - Runtime polymorphism
    }

}

public class MethodOverRiding {
    public static void main(String[] args) {
        
    
    two t2 = new two();
    test t1 = new test();
    t2.one();
    t1.one();
    }


}
