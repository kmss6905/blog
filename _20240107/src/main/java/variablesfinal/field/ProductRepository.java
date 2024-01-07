package variablesfinal.field;

public class ProductRepository {

    public ProductRepository() {
    }

    public Product findId(int id) {
        return new Product(id);
    }
}
