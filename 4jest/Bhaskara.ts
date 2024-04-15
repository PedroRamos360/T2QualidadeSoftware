export class Bhaskara {
  private a: number;
  private b: number;
  private c: number;

  constructor(a: number, b: number, c: number) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  calculateRoots(): number[] {
    const discriminant = this.b * this.b - 4 * this.a * this.c;
    const roots: number[] = [];

    if (discriminant > 0) {
      const root1 = (-this.b + Math.sqrt(discriminant)) / (2 * this.a);
      const root2 = (-this.b - Math.sqrt(discriminant)) / (2 * this.a);
      roots.push(root1, root2);
    } else if (discriminant === 0) {
      const root = -this.b / (2 * this.a);
      roots.push(root);
    }

    return roots;
  }
}
