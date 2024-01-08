package variablesfinal.field;

public class OrderMain {

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        OrderService orderService = new OrderService(productRepository);
        orderService.order(1);
    }

}
