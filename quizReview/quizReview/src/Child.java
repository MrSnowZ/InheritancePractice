public class Child extends Parent {
    public Child(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I am the child.");
    }
}

