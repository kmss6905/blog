package variablesfinal.field;

public class OrderService {
    private final ProductRepository productRepository;

    public OrderService() {
    }

    public void order(int id) {
        Product product = productRepository.findId(id);
        // etc
    }
}
