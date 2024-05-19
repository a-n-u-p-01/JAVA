class A{
    String name;
    int age;
    A(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
       System.out.println(this.name + " : " + this.age);
    }
}
public class constructor {
    public static void main(String[] args){
      A obj1 = new A("Anupam", 22);
      obj1.display();
    }
}
/**
 * A constructor in Java is a special type of method which is used to
 * initialize an object. It is called when an object is created and it
 * allows you to set the state of the object. A constructor should have
 * the same name as the class and it should not have any return type.
 * 
 * A constructor can take arguments which are used to set the state of
 * the object. The order of the arguments should be the same as the
 * order of the fields in the class.
 * 
 * A class can have multiple constructors. This is known as constructor
 * overloading. Each constructor should have a different set of
 * arguments.
 * 
 * 
 * A constructor is used to set the state of an object which is used
 * by other methods to perform their operations.
 * 
 * Example of constructor overloading:
 * 
 * public class Person {
 *     private String name;
 *     private int age;
 * 
 *     public Person(String name, int age) {
 *         this.name = name;
 *         this.age = age;
 *     }
 * 
 *     public Person(String name) {
 *         this(name, 0);
 *     }
 * }
 * 
 * Example of constructor with argument:
 * 
 * public class Student {
 *     private String name;
 *     private int age;
 * 
 *     public Student(String name, int age) {
 *         this.name = name;
 *         this.age = age;
 *     }
 * }
 * 
 * Question which may be asked in an interview:
 * 
 * 1. What is a constructor in Java?
 * 2. What is the difference between a constructor and a normal method?
 * 3. Can a class have multiple constructors?
 * 4. What is constructor overloading?
 * 5. How can you set the state of an object using a constructor?
 * 6. What is the purpose of a constructor?
 */
