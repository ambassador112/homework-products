import java.util.List;

interface CartOperations {
    void addProductToCart(Product product);

    void removeProductFromCart(Product product);

    List<Product> getCartProducts();
}