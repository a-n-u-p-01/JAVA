
class Person {
    
    String name;
    int age;
    
    public Person() {
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}

public class ThisKeyword {
    
    public static void main(String[] args) {
        
        // this keyword is used to refer to current object
        // it is used to avoid ambiguity when we have methods and variables with same name
        // it is used to access non-static variables and methods of current object
        // it is used to call constructor of same class
        
        Person person = new Person();
        Person person2 = new Person("Anupam", 22);
        
        System.out.println(person.getName() + " : " + person.getAge());
        System.out.println(person2.getName() + " : " + person2.getAge());
    }
}
