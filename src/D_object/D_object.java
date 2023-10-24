package D_object;

public class D_object {

    public static void main(String[] args) {
        System.out.println("******Car Details********");
        car obj2 = new car();
        obj2.name();
        obj2.model();
        obj2.getcolor();
        obj2.getwheels();
        obj2.mileage();

        float num = 2.9f;

        int number = (int) num;//float to int type casting
        System.out.println(number);


    }
}
