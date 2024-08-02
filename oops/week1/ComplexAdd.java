class ComplexNumber {
  public ComplexNumber(int real, int imag) {
    this.real = real;
    this.imag = imag;
  }

  public ComplexNumber add(ComplexNumber other) {
    return new ComplexNumber(this.real + other.real, this.imag + other.imag);
  }

  public int real, imag;
}

public class ComplexAdd {
  public static void main(String[] args) {
    ComplexNumber a = new ComplexNumber(1,2); 
    ComplexNumber b = new ComplexNumber(2,3);
    System.out.printf("A: %d + %di\n",a.real, a.imag);
    System.out.printf("B: %d + %di\n",b.real, b.imag);

    ComplexNumber res = a.add(b);

    System.out.printf("Result: %d + %di\n",res.real, res.imag);

  }
}
