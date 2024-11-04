import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Ноутбук", "Apex", 1200.00);
        Product product2 = new Product("Телефон", "Apple", 999.00);
        Product product3 = new Product("Планшет", "Samsung", 450.00);

        ProductService productService = new ProductService();
        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);

        List<Product> filteredByPrice = productService.filterByPrice(500, 1300);
        System.out.println("Filtered by Price: " + filteredByPrice);

        List<Product> filteredByManufacturer = productService.filterByManufacturer("Apple");
        System.out.println("Filtered by Manufacturer: " + filteredByManufacturer);

        Cart cart = new Cart();
        cart.addProductToCart(product1);
        cart.addProductToCart(product3);
        System.out.println("Cart Products: " + cart.getCartProducts());

        Rating rating1 = new Rating(product1, 4);
        System.out.println("Product Rating: " + rating1.getProduct().getName() + " - " + rating1.getRating() + " stars");
    }
}