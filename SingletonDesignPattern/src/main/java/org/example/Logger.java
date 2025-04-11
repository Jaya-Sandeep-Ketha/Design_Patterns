package org.example;

public class Logger {
    private static Logger instance;
    private Logger(){
        System.out.println("Logger initialized");
    }

    public static synchronized Logger getInstance(){
        if(instance==null){
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
