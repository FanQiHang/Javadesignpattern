public class A {

    public A() {
    }

    public void method1() {
        System.out.println("A method1");
    }

    public void method2() {
        System.out.println("A method2");
    }

    public static void method3() { //静态方法不能被继承
        System.out.println("static code");
    }

}

class B extends A {
    @Override
    public void method1() {
        System.out.println("B method1");
    }

    public void hello() {

        System.out.println("hello");

    }


}

// 子类即父类，父类不是子类
class Test {
    public static void main(String[] args) {

        A.method3(); //

        A a = new A();
        a.method1();

        B b = new B(); // 自动继承父类的方法
        b.method1();

        A c = b; // 相当于 A c =new B();
        c.method1(); //父类对象调用子类的方法
        c.method2();

        A f = new B();
        f.method1(); //调用的是子类的方法，但是无法调用子类特有方法

        A d = new B();
        B e = (B) d;  // 可以调用子类中特有的方法
        e.method1();
        e.hello();


        // 子类重写父类的方法后，子类对象调用父类中的此方法如何实现?

        // 子类调用父类方法，可以使用super关键字

        A g = new A();
        B h = (B) g; //强制类型转换错误，父类对象不能强转成子类


        // 子类对象不能用父类实例化
        // java.lang.ClassCastException: A cannot be cast to B


    }
}

