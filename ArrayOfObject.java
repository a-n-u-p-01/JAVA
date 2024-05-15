
class Student{
 String name;
 int mark;
}

public class ArrayOfObject {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[0].name = "anupam";
        students[0].mark = 100;
        students[1].name = "Rahul";
        students[1].mark = 100;
        students[2].name = "Bikash";
        students[2].mark = 100;
        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + " : " + students[i].mark);
        }

    };
};
