package org.example;

import org.w3c.dom.ls.LSOutput;

public class SingletonDemo {
    public static void main(String args[]){
        Singleton singleton = Singleton.getInstance();
    }


}

class Singleton{

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
    public void display(){
        System.out.println("In method of singlteon");
    }

}
