import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Math;

public class TestTriangle4 {

    @Test
    public void isEquilateralTriangle() {
        int result = Triangle.triangleType(99,99,99);
        assertSame ("Tam giác này đều", 0, result);
    }

    @Test
    public void isIsoscelesTriangle() {
        int result = Triangle.triangleType(Math.abs(-10),Math.abs(-10),15);
        assertSame ("Tam giác này cân", 1, result);
    }

    @Test
    public void isNormalTriangle() {
        int result = Triangle.triangleType(4,5,6);
        assertSame ("Tam giác này thường", 2, result);
    }

    @Test
    public void isNotTriangle() {
        int result = Triangle.triangleType(4,5, 200);
        assertSame ("Không phải tam giác", 3, result);
    }

    @Test
    public void isNegativeOrZero() {
        int result = Triangle.triangleType(99,100,0);
        assertSame ("Tam giác này có cạnh <= 0", 4, result);
    }

}
