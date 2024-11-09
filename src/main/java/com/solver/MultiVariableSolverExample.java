package com.solver;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer;

public class MultiVariableSolverExample {
    public static void main(String[] args) {
        // Define the target function with two variables (x, y)
        MultivariateFunction function = variables -> {
            double x = variables[0];
            double y = variables[1];
            return Math.abs(4 * Math.pow(x, 0.4 * x) + 9 * x + 2 * y - 8); // Minimize the absolute value of Y
        };

        // Set up the optimizer
        MultivariateOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);

        // Define an initial guess for (x, y)
        double[] startPoint = new double[] { 1.0, 1.0 }; // Initial guesses for x and y
        double[][] simplex = new double[][] {
                {1.0, 1.0}, {1.5, 1.0}, {1.0, 1.5}
        };

        try {
            // Optimize to find (x, y) values that minimize |Y|
            PointValuePair solution = optimizer.optimize(
                    new MaxEval(1000),
                    new org.apache.commons.math3.optim.InitialGuess(startPoint),
                    GoalType.MINIMIZE,
                    new NelderMeadSimplex(simplex),
                    new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(function)
            );

            double[] point = solution.getPoint();
            System.out.println("Solution found: x = " + point[0] + ", y = " + point[1]);
            System.out.println("Function value (approx. 0): Y = " + solution.getValue());
        } catch (Exception e) {
            System.out.println("No solution found: " + e.getMessage());
        }
    }
}
