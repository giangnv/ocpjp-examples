
// Static Nested Class
// ■ The nesting creates a namespace because the enclosing class name must be used to refer
// to it.
// ■ It can be made private or use one of the other access modifiers to encapsulate it.
// ■ The enclosing class can refer to the fields and methods of the static nested class.

public class StaticNestedClass {
    static int priceOuter = 100;
    static class Inner {
        private int price = 10;
        void test() {
            System.out.println(priceOuter);
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        System.out.println(inner.price);
    }
}