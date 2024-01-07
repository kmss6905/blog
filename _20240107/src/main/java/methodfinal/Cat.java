package methodfinal;

public class Cat {
    private int weight;

    public void meow() {
        System.out.println("누구나 야옹~");
    }

    final public void finalMeow() {
        System.out.println("나만 야옹~");
    }

    private void privateMeow() {
        System.out.println("내부 야옹~");
    }
}
