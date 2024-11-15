class Demo extends Thread
{
    public void run()
    {
        System.out.println("thread is running"+Thread.currentThread().getName());
        System.out.println("thread priority is : "+Thread.currentThread().getPriority());
    } 
}

class ThreadDemo8
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("inside main thread  : "+Thread.currentThread().getName());

        Demo dobj1 = new Demo();
        Thread tobj1 = new Thread(dobj1);
        tobj1.setName("PPA");
        tobj1.setPriority(10);
        tobj1.start();
    }
}