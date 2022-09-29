package by.OOP1;

public class Cls1 implements inter {

    public Cls1() {

    }

    @Override
    public void Foo() {
        System.out.println(inter.str);
    }

    public static void main(String[] args) {
        Cls1 cls1 = new Cls1();
        cls1.Foo();
    }
}
