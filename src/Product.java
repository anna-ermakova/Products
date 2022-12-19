import java.util.Objects;
import java.util.Set;

public class Product {
    private String name;
    private Double price;
    private Double mass;//кг

    public Product(String name, Double price, Double mass) {
        setName(name);
        setPrice(price);
        setMass(mass);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Заполните все поля товара");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Заполните все поля товара");
        }
        this.price = price;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        if (mass <= 0) {
            throw new IllegalArgumentException("Заполните все поля товара");
        }
        this.mass = mass;
    }


    public void addProduct(Set<Product> product) {
        if (!product.contains(this)) {
            product.add(this);
        } else {
            throw new IllegalArgumentException("продукт " + this.name + " уже есть в списке");
        }
    }

    public void remove(Product product) {
        product.remove(product);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", mass=" + getMass() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
