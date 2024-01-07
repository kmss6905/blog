package variablesfinal;

public class RFinal {

    public static void main(String[] args) {
        String name = "jimin";
        final User user = new User(name);
//        user = new User("junguk"); 할당 불가능
    }
}
