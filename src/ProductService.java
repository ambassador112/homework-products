import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ProductService {
    private List<Product> products;

    public ProductService() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> filterByPrice(double minPrice, double maxPrice) {
        return products.stream()
                .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<Product> filterByManufacturer(String manufacturer) {
        return products.stream()
                .filter(p -> p.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Product> getAllProducts() {
        return products;
    }
}