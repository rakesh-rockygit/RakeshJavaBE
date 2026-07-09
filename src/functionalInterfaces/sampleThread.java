package functionalInterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

public class sampleThread implements Runnable{
    
   // @Override 
    public void run() {System.out.println("this is a sampleeee runnable thread");}

    public static void main(String[] args) {
        sampleThread sampleThread = new sampleThread();
        sampleThread.run();
    }



}
