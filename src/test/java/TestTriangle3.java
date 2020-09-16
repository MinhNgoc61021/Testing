import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Math;

public class TestTriangle3 {

    @Test
    public void isEquilateralTriangle() {
        int result = Triangle.triangleType(4,4,4);
        assertSame ("Tam giác này đều", 0, result);
    }

    @Test
    public void isIsoscelesTriangle() {
        int result = Triangle.triangleType(1000,600,600);
        assertSame ("Tam giác này cân", 1, result);
    }

    @Test
    public void isNormalTriangle() {
        int result = Triangle.triangleType(3,4,5);
        assertSame ("Tam giác này thường", 2, result);
    }

    @Test
    public void isNotTriangle() {
        int result = Triangle.triangleType(1000,100, 200);
        assertSame ("Không phải tam giác", 3, result);
    }

    @Test
    public void isNegativeOrZero() {
        int result = Triangle.triangleType(0, 0, -1);
        assertSame ("Tam giác này có cạnh <= 0", 4, result);
    }

}
