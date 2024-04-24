public class Base {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
	return a - b;
    }

    public int div(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("Cannot divide by zero");
      }
    return a / b;
    }

    public int mult(int a, int b) {
	return a * b;
    }

    public double sqrt(int a) {
    if (a < 0) {
        throw new IllegalArgumentException("Cannot calculate square root of a negative number");
  	}
  	return Math.sqrt(a);
    }
}
