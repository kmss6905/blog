package variablesfinal.field;

public class OrderService {
    private final ProductRepository productRepository;

    public OrderService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void order(int id) {
        Product product = productRepository.findId(id);
        // etc
    }
}
