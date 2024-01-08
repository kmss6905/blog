package classfinal;

public class Car {
    private String colorName = "black";

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}

/*
 * 클래스에 final 선언 시 해당 클래스는 어느 곳에서도 상속하여 사용할 수 없다. complie error 발생
 * final public class Car {
 *
 * }
 */
