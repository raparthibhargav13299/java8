import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_reduce {
    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(1, 2, 5, 6, 8, 6, -9, 5);
        List<String> nameList=Arrays.asList("Angelina Gordon", "Tom", "Parker","Elle Golding", "Michael Jackson","Lena Rose");

        //finding the sum of elements
        int sum=numList.stream().reduce(0,(element1, element2)->element1+element2);
        System.out.println("Sum of List items is ="+sum);

        Optional<String> longestString=nameList.stream().reduce((n1, n2)->n1.length()>n2.length()?n1:n2);
        longestString.ifPresent(System.out::println);
    }
}
