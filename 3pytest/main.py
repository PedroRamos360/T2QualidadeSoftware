import math


class Bhaskara:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def calculate_roots(self):
        discriminant = self.b**2 - 4 * self.a * self.c

        if discriminant < 0:
            return None
        elif discriminant == 0:
            root = -self.b / (2 * self.a)
            return (root,)
        else:
            sqrt_discriminant = math.sqrt(discriminant)
            root1 = (-self.b + sqrt_discriminant) / (2 * self.a)
            root2 = (-self.b - sqrt_discriminant) / (2 * self.a)
            return (root1, root2)


# Test cases
def test_bhaskara_real_roots():
    bhaskara = Bhaskara(1, -3, 2)
    assert bhaskara.calculate_roots() == (2.0, 1.0)


def test_bhaskara_complex_roots():
    bhaskara = Bhaskara(1, 1, 1)
    assert bhaskara.calculate_roots() == None


def test_bhaskara_one_root():
    bhaskara = Bhaskara(1, -2, 1)
    assert bhaskara.calculate_roots() == (1.0,)
