import java.util.LinkedHashSet;
import java.util.Set;

public class Exemplo001 {
    public static void main(String[] args) {
        //SET -> eh um tipo conjunto
        Set<Integer> conjunto = new LinkedHashSet<Integer>();
        conjunto.add(6);
        conjunto.add(15);
        conjunto.add(6);
        System.out.println(conjunto);
    }
}
