public class ProductBuilder {
    
    private Product product;

    public ProductBuilder(){
        product = new Product();
    }

    public ProductBuilder setCode(Integer code) {
        product.setCode(code);
        return this;
    }

    public ProductBuilder setName(String name) {
        product.setName(name);
        return this;
    }

    public ProductBuilder setDescription(String description) {
        product.setDescription(description);
        return this;
    }

    public ProductBuilder setPrice(Double price){
        product.setPrice(price);
        return this;
    }

    public ProductBuilder setCategory(Category category) {
        product.setCategory(category);
        return this;
    }

    public Product build(){
        return product;
    }
}
