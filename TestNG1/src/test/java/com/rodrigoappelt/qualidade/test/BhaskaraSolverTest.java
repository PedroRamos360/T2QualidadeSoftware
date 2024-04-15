package com.rodrigoappelt.qualidade.test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BhaskaraSolverTest {

    @Test
    public void testSolve_twoRealRoots() {
        BhaskaraSolver solver = new BhaskaraSolver();
        double[] expected = {2.0, 1.0};
        double[] actual = solver.solve(1, -3, 2);
        assertEquals(actual.length, 2, "There should be two roots.");
        assertTrue(Math.min(actual[0], actual[1]) == expected[1], "Smaller root should match expected.");
        assertTrue(Math.max(actual[0], actual[1]) == expected[0], "Larger root should match expected.");
    }

    @Test
    public void testSolve_oneRealRoot() {
        BhaskaraSolver solver = new BhaskaraSolver();
        double[] expected = {-1.0};
        double[] actual = solver.solve(1, 2, 1);
        assertEquals(actual.length, 1, "There should be one root.");
        assertEquals(actual[0], expected[0], "The root should match expected.");
    }

    @Test
    public void testSolve_noRealRoots() {
        BhaskaraSolver solver = new BhaskaraSolver();
        double[] actual = solver.solve(1, 0, 1);
        assertEquals(actual.length, 0, "There should be no real roots.");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSolve_aIsZero() {
        BhaskaraSolver solver = new BhaskaraSolver();
        solver.solve(0, 1, 1); // This should throw IllegalArgumentException
    }
}