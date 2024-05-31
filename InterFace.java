
interface Computer {
    public void code();
}

class Laptop implements Computer {
    public void code(){
        System.out.println("coding... using laptop");
    }
}
class Desktop implements Computer {
    public void code(){
        System.out.println("coding... using desktop");
    }
}
class Employee {
    public void work(Computer d){
        d.code();
    }
}


public class InterFace {
    public static void main(String[] args){
        Computer desk = new Desktop();
        Computer Lap = new Laptop();
        Employee e = new Employee();
        e.work(desk);
    }
}
