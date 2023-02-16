public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public void methodA() {
        System.out.println("Inside methodA of class A");
        b.methodB();
    }
}