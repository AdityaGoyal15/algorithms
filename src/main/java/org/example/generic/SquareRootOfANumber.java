package org.example.generic;

public class SquareRootOfANumber {

    public double sqrt(double x) {
        double low = 0, high = x;

        if (x < 1) {
            high = 1;
        }
        double tolerance = (double) 1 / (10 ^ 7);

        while (Math.abs(high - low) > tolerance) {
            double mid = (high + low) / 2;

            if (mid * mid > x) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return (low + high) / 2;
    }
}
