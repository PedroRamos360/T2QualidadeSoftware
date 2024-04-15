import { Bhaskara } from "./Bhaskara";

describe("Bhaskara", () => {
  test("Calculates roots for real roots", () => {
    const equation = new Bhaskara(1, -3, 2);
    const roots = equation.calculateRoots();
    expect(roots).toEqual([2, 1]);
  });

  test("Calculates roots for equal real roots", () => {
    const equation = new Bhaskara(1, -2, 1);
    const roots = equation.calculateRoots();
    expect(roots).toEqual([1]);
  });

  test("Calculates roots for imaginary roots", () => {
    const equation = new Bhaskara(1, 1, 1);
    const roots = equation.calculateRoots();
    expect(roots).toEqual([]);
  });

  test("Calculate roots for a = 0", () => {
    const equation = new Bhaskara(0, 1, 1);
    expect(() => equation.calculateRoots()).toThrow(
      new Error("A cannot be zero.")
    );
  });
});
