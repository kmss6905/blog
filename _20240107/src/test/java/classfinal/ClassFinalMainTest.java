package classfinal;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClassFinalMainTest {

    @Test
    @DisplayName("final 클래스의 맴버변수는 바꿀 수 있다.")
    void mainTest() {
        Moeny moeny = new Moeny();
        moeny.setValue(100);

        assertEquals(100, moeny.getValue());
        assertDoesNotThrow(() -> moeny.setValue(200));
        assertEquals(200, moeny.getValue());
    }

    final class Moeny {
        private int value;

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}