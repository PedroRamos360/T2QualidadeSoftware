package com.rodrigoappelt.qualidade.test;

public class BhaskaraSolver {
    // Method to calculate the discriminant
    private double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    // Method to solve the quadratic equation
    public double[] solve(double a, double b, double c) {
        double d = discriminant(a, b, c);

        if (a == 0) {
            throw new IllegalArgumentException("Coefficient 'a' cannot be zero in a quadratic equation.");
        }

        if (d < 0) {
            // No real roots
            return new double[0];
        } else if (d == 0) {
            // One real root (double root)
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // Two real roots
            double sqrtD = Math.sqrt(d);
            double root1 = (-b + sqrtD) / (2 * a);
            double root2 = (-b - sqrtD) / (2 * a);
            return new double[]{root1, root2};
        }
    }
}
