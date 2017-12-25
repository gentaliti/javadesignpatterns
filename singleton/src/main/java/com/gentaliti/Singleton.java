package com.gentaliti;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class Singleton {

    /**
     * Keyword volatile used for concurrency issues
     * see: https://stackoverflow.com/a/106787
     */
    private volatile static Singleton INSTANCE;

    /**
     * Private constructor to disable class instantiation
     */
    private Singleton() {
    }

    /**
     * To be called for obtaining the INSTANCE
     */
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

}
