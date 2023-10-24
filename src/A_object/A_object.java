package A_object;

import org.w3c.dom.ls.LSOutput;

public class A_object {
    String name = "Bhargav";
    int age = 22;

    public static void main(String[] args) {
        A_object object1 = new A_object();
        System.out.println(object1);
        System.out.println(object1.name);
        System.out.println(object1.age);

        A_object obj2 = new A_object();
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2);

    }


}
