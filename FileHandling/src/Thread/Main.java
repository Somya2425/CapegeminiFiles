package Thread;

public class Main {

    public static void main(String[] args) {

//        MyThread mt = new MyThread();
//        mt.start();
//        //mt.run();
//        mt.getPriority();
////        System.out.println( mt.getName());
//        mt.getName();
//        mt.join();
//        System.out.println("hello");

          MyThread2 mt2 = new MyThread2();
          Thread t1 = new Thread(mt2);
           t1.start();
    }
}
