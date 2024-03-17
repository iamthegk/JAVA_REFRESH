/**
 * overload
 */
//same function name different params, it is compile time polymorphism

 class t{
    public int add(int a,int b){
        return a+b;
    }

    public float add(int a,float b, int c){
        return a+b+c;
    }
 }
 public class overload {

    public static void main(String[] args) {
        t tt = new t();
        System.out.println(tt.add(5, 10));
        System.out.println(tt.add(5, 5.5f, 6));
    }

}


