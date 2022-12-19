import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Product> product = new HashSet<>();
        Product banan = new Product("бананы", 88.0, 1.5);
        Product apple = new Product("яблоки", 150.99, 1.2);
        Product tomat = new Product("томаты", 122.0, 1.0);
        Product egg = new Product("яйца", 70.0, 10.0);
        banan.addProduct(product);
        apple.addProduct(product);
        tomat.addProduct(product);
        egg.addProduct(product);
        product.remove(apple);

        Set<Recipe> recipeBook = new HashSet<>();
        Recipe eggInTomat = new Recipe("Яйцо в томате");
        Recipe bananInEgg = new Recipe("Банан в яйце");

        eggInTomat.addProductInRecipe(egg, tomat);
        bananInEgg.addProductInRecipe(egg, banan);

        eggInTomat.addRecipe(recipeBook);
        bananInEgg.addRecipe(recipeBook);
        System.out.println(bananInEgg.toString());


        //ДЗ 2. Задание 2
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i <= 20; i++) {
            integerSet.add((int) (Math.random() * 1000) + 1);
        }
        integerSet.removeIf(Integer -> Integer % 2 != 0);
        System.out.println(integerSet);
    }
}