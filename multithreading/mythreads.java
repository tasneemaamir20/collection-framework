// package Multithreading;
public class mythreads extends Thread {
    int z;
    
    mythreads(int z)
    {
        this.z=z;
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            System.out.println(z*i);
        }
    }

}
