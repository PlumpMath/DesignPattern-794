package Singleton.ThreadSafeEarly;

import Singleton.Singleton;

/**
 * Created by mayurkale on 9/30/15.
 */
public class SingletonClient {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("singleton = " + singleton.getDesciption());

    }
}
