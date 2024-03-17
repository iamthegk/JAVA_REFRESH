import java.util.*;

public class DynamicArray {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size");
        int size=scanner.nextInt();
       int myArray[] = new int[size];
       for(int i=0;i<size;i++)
       {
        System.out.println("enter Element");
         myArray[i]=scanner.nextInt();
       }
       int j=0;
       System.out.println("YOUR ARRAY IS");
       do{
        System.out.println(myArray[j]);
        j++;
       }
       while(j<size);
       


    }
}
