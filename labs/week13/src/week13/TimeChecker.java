package week13;

class TimeChecker extends Thread{
    long timeWork = lab13.time;
    public void run(){
        long start = System.currentTimeMillis();
        while( System.currentTimeMillis() - start < timeWork){

        }
        System.out.println("Program duration: " +(System.currentTimeMillis() - start));
        System.exit(0);
    }
}
