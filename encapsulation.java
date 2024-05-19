
class A{
    private String name;
    private int age;
    public void setter(String name,int age, A obj){
        obj.name = name;
        obj.age = age;
    }
    public String getter(String s){
       if(s.equals("name")){
           return name;
       }
       else if(s.equals("age")){
            return String.valueOf(age);
       }
       return null;
    }
}

public class encapsulation {
    public static void main(String[] args){
        A obj = new A();
        obj.setter("anupam",22, obj);
        System.out.println(obj.getter("name") + " : " + obj.getter("age"));
       
        
    }
}
