public class InnerClassEx01 {
    private String greet = "Hi";

    protected class Inner {
        public void go() {
            for (int i = 0; i < 3; i++) {
                System.out.println(greet);
            }
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        InnerClassEx01 outer = new InnerClassEx01();
        Inner inner = outer.new Inner();
        Inner inner2 = new InnerClassEx01().new Inner();
        inner2.go();
        inner.go();
    }
}