
class A{
    private String name;
    private int age;
    public void setter(String n,int a){
        name = n;
        age = a;
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
        obj.setter("anupam",22);

        System.out.println(obj.getter("name") + " : " + obj.getter("age"));
        
    }
}
