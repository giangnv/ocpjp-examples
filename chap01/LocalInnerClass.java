public class LocalInnerClass {
    private int length = 10;

    public void multiply() {
        int width = 20;
        class Inner {
            final static int area = 10;
            public void doMultiply() {
                System.out.println(length * width);
            }

            private void test() {}
        }

        Inner inner = new Inner();
        inner.doMultiply();
    }

    public static void main(String[] args) {
        LocalInnerClass outer = new LocalInnerClass();
        outer.multiply();
    }
}