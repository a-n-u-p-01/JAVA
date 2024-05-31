@FunctionalInterface
interface MyInterface{
     int run(int a, int b);
}

class Lambda{
    public static void main(String[] args){
        MyInterface r = (int a,int b) -> a+b;
       System.out.println(r.run(4,5)); 
    }
}