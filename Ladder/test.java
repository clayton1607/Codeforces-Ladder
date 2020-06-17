import java.util.Scanner;

class A{
    void callme(){
        System.out.println("A");
    }
}

class B extends A{
    void callme(){
        System.out.println("B");
    }
}
public class test {
    public static void main(final String[] args) {
        final A a = new A();
        a.callme();
        final B b = new B();
        b.callme();
        final Object c = new B();
        c.callme();

    }
}