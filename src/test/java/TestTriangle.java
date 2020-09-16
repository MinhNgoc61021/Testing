import org.junit.Test;
import static org.junit.Assert.*;

public class TestTriangle {
    @Test
    public void isEquilateralTriangle() {
        int result = Triangle.triangleType(2, 2 ,2);
        assertSame ("Tam giác này đều", 0, result);
    }

    @Test
    public void isIsoscelesTriangle() {
        int result = Triangle.triangleType(2, 2 ,3);
        assertSame ("Tam giác này cân", 1, result);
    }

    @Test
    public void isNormalTriangle() {
        int result = Triangle.triangleType(2, 3 ,4);
        assertSame ("Tam giác này thường", 2, result);
    }

    @Test
    public void isNotTriangle() {
        int result = Triangle.triangleType(2, 2 ,4);
        assertSame ("Không phải tam giác", 3, result);
    }

    @Test
    public void isNegativeOrZero() {
        int result = Triangle.triangleType(0, 3, 4);
        assertSame ("Tam giác này có cạnh <= 0", 4, result);
    }

}
