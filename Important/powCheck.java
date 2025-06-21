class PowerCheck {
    public static boolean isPower(int x, int y) {
        if (x == 1) return y == 1; // Only 1^0 = 1
        int value = 1;
        while (value < y) {
            value *= x;
        }
        return value == y;
    }


public static boolean isPowerDivide(int x, int y) {
    if (x == 1) return y == 1;

    while (y % x == 0) {
        y = y / x;
    }
    return y == 1;
}
}
