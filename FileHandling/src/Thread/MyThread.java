package Thread;

public class MyThread extends Thread{
//    @override
    public void run(){
        for(int i =0; i<11; i++){
            System.out.println(i);
        }
        try{
            Thread.sleep(100000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        MyThread sleep = new MyThread();
        sleep.start();
    }

}

