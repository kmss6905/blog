package methodfinal;

public class WhiteCat extends Cat {

    @Override
    public void meow() {
        System.out.println("흰 고양이 야옹");
    }

    /*
     *     // compile error 발생, final method 는 오버라이딩 불가
     *     public void finalMeow() {
     *
     *     }
     */
}
