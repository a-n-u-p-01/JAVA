class Sum{
    public int a = 2;
    public static int b = 3;
    static{
             b=10;
    }
    public int add(){
        return (a+b);
    }
}
class ClassObject {
    public static void main(String[] args){
        class.forName("Sum");
    }
}