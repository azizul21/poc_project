package org.example;

public class SingletonExample {

    private static SingletonExample singletonExample;

    private SingletonExample(){

    }
    public static SingletonExample getGlobalInstance(){
        return singletonExample!=null ? singletonExample: new SingletonExample();
    }

    public void testMethod(){
        System.out.println("Singleton design Example");
    }
}
