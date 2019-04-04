package construct;

class Base { // line n3
  public Base(int x) {
    System.out.println("Base constructor");
  }
}

class Sub extends Base { // line n2
  int getInstanceValue() { return 99; }
  static int getVal() { return 99; }
  Sub(int x) {
//    getVal();
    super(99 + getVal());
  }
  // compiler generated:
  Sub() { // <-- "zero argument constructor"
//    super(); // if not explicitly coded, compiler provides
    this(99);
  }
  // if generated by compiler (because zero provided constructors)
  // then called "default constructor"
}

public class Ex1 {
  public static void main(String[] args) {
    new Sub(); // line n1
  }
}
