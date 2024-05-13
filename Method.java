class A{
    public String print(int x){
        return "hello";
    }
}

public class Method {
    public static void main(String[] args){
        A obj = new A();
        System.out.println(obj.print(2));
    }
}
