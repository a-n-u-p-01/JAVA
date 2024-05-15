
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

           // normal for loop : It uses an iterator or counter
        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + " : " + students[i].mark);
            System.out.println(students[i]); //this will print the hashcode which is refereced to the object
        }

        //for each loop : It will select each element one by one 
        for(Student i : students){
            System.out.println(i.name + " : " + i.mark);
        }

    };
};
