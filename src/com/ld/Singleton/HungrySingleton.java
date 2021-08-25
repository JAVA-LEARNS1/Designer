package com.ld.Singleton;

public class HungrySingleton {
    public static void main(String[] args) {
        //这样没有instance实力化
        Class<Hungry> hungryClass=Hungry.class;
        //访问静态变量时会对instance实例化
        System.out.println(Hungry.name);
        //使用instance时会对instance实例化
        Hungry instance = Hungry.getInstance();
        //当前类是main函数所在类，直接进行new操作，访问静态方法，访问静态变量，用反射访问类，初始化一个类的子类
        //都可以对instance实例化

        //问题：
        //现在初始化instance的方法有很多，导致不想用instance的时候instance也会被初始化，有没有方法，在想用的时候去用
        //有，静态内部类
        //InnerClassSingleton
    }
}
//饿汉模式
class Hungry{
    public static String name="ld";
    static {
        System.out.println("hungry");
    }
    private static Hungry instance=new Hungry();

    private Hungry() {

    }
    public static Hungry getInstance() {
        return instance;
    }
}

