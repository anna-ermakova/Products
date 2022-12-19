import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private Set<Product> productSet;
    private String name;
    private int sumProducts;

    public Recipe(String name) {
        this.productSet = new HashSet<>();
        this.name = name;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSumProducts() {
        return sumProducts;
    }

    public void setSumProducts(int sumProducts) {
        this.sumProducts = sumProducts;
    }

    public void addProductInRecipe(Product... product) {
        this.productSet.addAll(Arrays.asList(product));
        for (Product p : this.productSet) {
            this.sumProducts += p.getPrice();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "productSet=" + productSet +
                ", name='" + name + '\'' +
                ", sumProducts=" + sumProducts +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(productSet, name, sumProducts);
    }

    public void addRecipe(Set<Recipe> recipeSet) {
        if (!recipeSet.contains(this)) {
            recipeSet.add(this);
        } else {
            throw new UnsupportedOperationException(this.name + " рецепт уже есть.");
        }


    }
}
