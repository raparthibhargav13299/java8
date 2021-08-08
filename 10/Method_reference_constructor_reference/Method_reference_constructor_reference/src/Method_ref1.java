import java.util.function.BiFunction;

class Arithmetic{
    public static int add(int num1, int num2){
        return num1+num2;
    }
}
public class Method_ref1 {
    public static void main(String[] args) {
        // JVM internally writing a lambda expression and will take the logic of add method
        BiFunction<Integer, Integer, Integer> adder=Arithmetic::add;
        System.out.println(adder.apply(20,30));
    }
}
