package J_collection;

import java.util.ArrayList;

public class J_collection {
    public static void main(String[] args) {
        ArrayList<student>arr=new ArrayList<>();

        arr.add(new student(1,"bhargav"));
        arr.add(new student(2,"sivanesan"));
        arr.add(new student(3,"nani"));


        System.out.println("*****before removeing******");
        for (student student:arr){
            System.out.println(student.getRollno());
            System.out.println(student.getName());

        }
        System.out.println("*****after removeing******");
        arr.remove(2);
        for (student student:arr){
            System.out.println(student.getRollno());
            System.out.println(student.getName());

        }
    }
}
