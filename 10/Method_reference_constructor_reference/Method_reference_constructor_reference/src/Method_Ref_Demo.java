import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

class A{
    public  void raiseTwoThePowerOfTwo(double num){
        double result=Math.pow(num, 2);
        System.out.println(result);
    }
}
public class Method_Ref_Demo {
    public static void main(String[] args) {
        List<Double> numList=new ArrayList<Double>();
        numList.add(new Double(5));
        numList.add(new Double(2));
        numList.add(new Double(4));
        numList.add(new Double(8));
        numList.add(new Double(9));
        numList.add(new Double(3));
        numList.add(new Double(7));

        numList.forEach(new A()::raiseTwoThePowerOfTwo);

    }
}
