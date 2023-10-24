package G_thread;

public class G_thread extends Thread {
    public void run(){
        System.out.println("Running");
    }
    public static void main(String[] args) {
        G_thread obj=new G_thread();
        obj.run();

    }
}
