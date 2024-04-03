import java.util.Scanner;

public class MyThreadTask {
    public static void main(String[] args) {
        MyThread m=new MyThread();

        Thread t1=new Thread(m);
        t1.start();
        // we can not called start() method again for same thread we get illegalStateException
        // t1.start();


//         mythreads m=new mythreads(2);
//         m.start();
    }
}
