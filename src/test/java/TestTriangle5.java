import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Math;

public class TestTriangle5 {

    @Test
    public void isEquilateralTriangle() {
        int result = Triangle.triangleType((int)Math.ceil(98.95),(int)Math.floor(99.20),99);
        assertSame ("Tam giác này đều", 0, result);
    }

    @Test
    public void isIsoscelesTriangle() {
        int result = Triangle.triangleType(Math.abs(-10),Math.abs(10),15);
        assertSame ("Tam giác này cân", 1, result);
    }

    @Test
    public void isNormalTriangle() {
        int result = Triangle.triangleType(97,98,99);
        assertSame ("Tam giác này thường", 2, result);
    }

    @Test
    public void isNotTriangle() {
        int result = Triangle.triangleType((int)Math.round(99.95),5, 200);
        assertSame ("Không phải tam giác", 3, result);
    }

    @Test
    public void isNegativeOrZero() {
        int result = Triangle.triangleType(-Math.abs(-1),10,100);
        assertSame ("Tam giác này có cạnh <= 0", 4, result);
    }

}
