
// Anonymous Inner Class
// Must be EXTENDS Abstract class or IMPLEMENTS an interface
// Here is example

public class AnonymousInnerClass {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int addmission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly(){
        
                @Override
                int dollarsOff() {
                    return 3;
                }
        };

        return basePrice - sale.dollarsOff();
    }

    interface Fly {
        void fly();
    }

    public void testFly() {
        Fly f = new Fly(){
        
                @Override
                public void fly() {
                    System.out.println("It's flying..");
                }
        };
        
        f.fly();
    }

    public void testFly(Fly f) {
        f.fly();
    }

    public static void main(String[] args) {
        AnonymousInnerClass outer = new AnonymousInnerClass();
        outer.testFly();
        outer.testFly(new Fly(){
        
                @Override
                public void fly() {
                    System.out.println("Test fly with parameter");
                }
        });

        outer.testFly(() -> System.out.println("Test fly as lambda function"));
        System.out.println(outer.addmission(30));
    }
}