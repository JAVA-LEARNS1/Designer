package com.ld.Singleton;

public class InnerClassSingleton {
    public static void main(String[] args) {
        InnerClass instance = InnerClass.getInstance();
    }
}
class InnerClass{
    private static class SingletonHolder{
        private static InnerClass instance=new InnerClass();
    }
    private InnerClass(){}

    public static InnerClass getInstance(){
        return SingletonHolder.instance;
    }
}
