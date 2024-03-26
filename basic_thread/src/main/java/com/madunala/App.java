package com.madunala;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
}
