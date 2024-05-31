class A{
   static int a = 10;
   static int b = 29;
   int c = 50;
    public static void display(){
        System.out.println(a+" "+b);
    }
}
class B extends A{
  B(int a, int b){
    this.a = a;
    this.b = b;
  }

}
public class methodOverriding {
    public static void main(String[] args){
        A.display();
        B obj = new B(11,22);
        B.display();
    }
}
