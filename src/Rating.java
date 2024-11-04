class Rating {
    private Product product;
    private int rating;

    public Rating(Product product, int rating) {
        this.product = product;
        this.rating = rating;
    }

    public Product getProduct() {
        return product;
    }

    public int getRating() {
        return rating;
    }
}