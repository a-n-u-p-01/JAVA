public class stringxbuffer{
    public void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}