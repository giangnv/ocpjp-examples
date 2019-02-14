public class PrivateInterface {
    private interface InnerInterface {
        void shh();
    }

    class InnerInterfaceImpl implements InnerInterface {
        public void shh() {
            System.out.println("Shhhhh");
        }
    }

    public void callInner() {
        InnerInterface inner = new InnerInterfaceImpl();
        inner.shh();
    }

    public static void main(String[] args) {
        PrivateInterface outer = new PrivateInterface();
        InnerInterface inner = outer.new InnerInterfaceImpl();
        inner.shh();
        outer.callInner();
    }
}