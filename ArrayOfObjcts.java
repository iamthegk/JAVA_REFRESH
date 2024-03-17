class Student{
    int roll;
    String name;
}



public class ArrayOfObjcts {
    public static void main(String[] args) {
        Student s1 = new Student();
        //first student s1
        s1.roll=5;
        s1.name="Gopi";
        //second data
         Student s2 = new Student();
        s2.roll=6;
        s2.name="Appu";


        Student student[]=new Student[2]; // this is an array of objcts
        student[0]=s1; // in the array of object we are assigning values
        student[1]=s2;


        for(int i=0;i<student.length;i++){
            System.out.println(student[i].name+" "+student[i].roll);
        }
        

        
    }
}
