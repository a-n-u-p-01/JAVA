class Sum{
    public int a = 2;
    public int b = 3;
    public int add(){
        return (a+b);
    }
}
class ClassObject {
    public static void main(String[] args){
        Sum obj = new Sum();
        System.out.println(obj.add()); //add is not in the class ClassObject it is in Sum class 
    }
}