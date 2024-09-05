import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            numbers.add(sc.nextInt());
        }
        System.out.println("Before :"+numbers);
        System.out.println("After :"+even(numbers));
    }

    public static List<Integer> even(List<Integer> numbers){
        return numbers.stream()
                .filter(number -> number%2==0)
                .collect(Collectors.toList());
    }

}
