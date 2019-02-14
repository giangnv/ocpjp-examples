public class InnerClassEx02 {
    private String greet = "Hi";

    protected class Inner {
        private String greet = "Good morning";

        class InnerInner {
            private String greet = "Xin chao";

            public void sayGreet() {
                System.out.println(greet);
                System.out.println(this.greet);
                System.out.println(Inner.this.greet);
                System.out.println(InnerClassEx02.this.greet);

            }
        }
    }

    public void callInnerInner() {
        Inner inner = new Inner();
        Inner.InnerInner innerInner = inner.new InnerInner();
        innerInner.sayGreet();
    }

    public static void main(String[] args) {
        InnerClassEx02 outer = new InnerClassEx02();
        InnerClassEx02.Inner inner = outer.new Inner();
        InnerClassEx02.Inner.InnerInner innerInner = inner.new InnerInner();
        innerInner.sayGreet();
        System.out.println("==========");
        outer.callInnerInner();
    }
}