import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Product> product = new HashSet<>();
        Product banan = new Product("бананы", 85.9, 1.5);
        Product apple = new Product("яблоки", 150.99, 1.2);
        Product tomat = new Product("томаты", 122.0, 1.0);
        Product egg = new Product("яйца", 70.0, 10.0);
        banan.addProduct(product);
        apple.addProduct(product);
        tomat.addProduct(product);
        egg.addProduct(product);
        product.remove(apple);
    }
}