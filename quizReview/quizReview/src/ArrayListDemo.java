import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        Parent parent = new Parent("Parent");
        Child child = new Child("Child");

        ArrayList<Parent> list = new ArrayList<Parent>();
        list.add(parent);
        list.add(child);

        for (Parent p : list) {
            p.speak();
        }
    }
}