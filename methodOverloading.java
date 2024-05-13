
class A{
    int add(int a, int b){
        return (a+b);
    }
    long add(int a, int b, int c){
        return (a+b+c);
    }
}

public class methodOverloading {
    public static void main(String[] agrs){
        System.out.println(new A().add(2,3));
        System.out.println(new A().add(2,3,4));
    }
}
