package com.solver;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;

public class SolverExample {
    public static void main(String[] args) {
        //Y=4*x^(0.4x) +9x-8
        UnivariateFunction function = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return 4 * Math.pow(x, 0.4 * x) + 9 * x - 8;
            }
        };

        // Create the solver
        BrentSolver solver = new BrentSolver();

        try {
            // Search for a solution within a reasonable range, e.g., [0.1, 10.0]
            double solution = solver.solve(1000, function, 0.1, 10.0);
            System.out.println("Solution found: x = " + solution);
        } catch (Exception e) {
            System.out.println("No solution found: " + e.getMessage());
        }
    }
}
