public class Triangle {
    public static int triangleType(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0 ) {
            if (a + b > c && b + c > a && a + c > b) {
                if (a == b && b == c) {
                    return 0;
                }
                else if (a == b || a == c || b == c) {
                    return 1;
                }
                else {
                    return 2;
                }
            }
            else {
                return 3;
            }
        }
        return 4;
    }
}
