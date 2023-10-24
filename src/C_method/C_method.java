package C_method;

public class C_method {
    void method(){
        System.out.println("method");
    }
    void method(String msg){
        System.out.println(msg);
    }
    static int add(){
        return 2+3;
    }

    public static void main(String[] args) {
        C_method obj1=new C_method();
        obj1.method();
        obj1.method("bhargav");

        int sum=C_method.add();{
            System.out.println("the sum = "+sum);
        }
    }
}
