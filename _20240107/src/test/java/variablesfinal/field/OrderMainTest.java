package variablesfinal.field;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OrderMainTest {

    @Test
    @DisplayName("초기화 하지 않아서 order() 호출 시 NullPointException 예외 발생")
    void noFinalTest() {
        OrderServiceA orderService = new OrderServiceA();

        assertThrows(NullPointerException.class, () -> orderService.order(1));
    }

    @Test
    @DisplayName("초기화 해서 NullPointException 예외 발생 하지 않음")
    void withFinalTest() {
        OrderRepository orderRepository = new OrderRepository();
        OrderServiceB orderService = new OrderServiceB(orderRepository);

        assertDoesNotThrow(() -> orderService.order(1));
    }

    class OrderServiceA {
        // 참조하지 않다고 친절하게 알려주고 있지만, 강제하지는 않는다.
        private OrderRepository orderRepository;

        public Order order(int orderId){
            return orderRepository.findOrderById(orderId);
        }
    }

    class OrderServiceB {
        private final OrderRepository orderRepository;

        OrderServiceB(OrderRepository orderRepository) {
            this.orderRepository = orderRepository;
        }

        Order order(int orderId){
            return orderRepository.findOrderById(orderId);
        }
    }

    class OrderRepository{

        public Order findOrderById(int orderId) {
            return new Order();
        }
    }

    class Order{

        public Order() {
        }
    }

}