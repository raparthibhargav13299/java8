import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_distinct {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,5,6,2,5,4,8,9,3,6,4,56,96,41);
        List<Integer> distinctValues=list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctValues);

        long count=list.stream().distinct().count();

        System.out.println(count);

    }
}
