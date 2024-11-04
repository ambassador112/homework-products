import java.util.ArrayList;
import java.util.List;

class Cart implements CartOperations {
    private List<Product> cartProducts;

    public Cart() {
        cartProducts = new ArrayList<>();
    }

    @Override
    public void addProductToCart(Product product) {
        cartProducts.add(product);
    }

    @Override
    public void removeProductFromCart(Product product) {
        cartProducts.remove(product);
    }

    @Override
    public List<Product> getCartProducts() {
        return cartProducts;
    }
}