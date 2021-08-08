import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int pid;
    String pName;
    double pPrice;

    public Product(int pid, String pName, double pPrice) {
        this.pid = pid;
        this.pName = pName;
        this.pPrice=pPrice;
    }
}
public class Stream_map {
    public static void main(String[] args) {
        List<Product> pList=new ArrayList<Product>();
        pList.add(new Product(201, "Laptop", 425));
        pList.add(new Product(202, "HeadPhones", 22));
        pList.add(new Product(203, "Charger", 365));
        pList.add(new Product(204, "Pendrive", 365));
        pList.add(new Product(205, "KeyChain", 256));

        //map()
        List<Double> newPrice=pList.stream().map(p->p.pPrice+20).collect(Collectors.toList());
        System.out.println("New Product Prices");
        newPrice.forEach((pr)-> System.out.println(pr));

        //map() + reduce(): Sum of all product new prices
        double newPriceTotal=pList.stream().map(p->p.pPrice).reduce(0.0d, (p1, p2)->p1+p2);
        System.out.println("newPriceTotal :"+newPriceTotal);

        long myCount=pList.stream().count();
        System.out.println("Count of Objects in Stream:"+myCount);

    }
}
