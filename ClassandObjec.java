
class Newclass {

    int a = 10;

    public void test() {
        System.out.println("Test");
    }

}

public class ClassandObjec {

    public static void main(String[] args) {
        Newclass newclass = new Newclass();// object creation. so here jvm will create an object
        newclass.test();

    }
}
