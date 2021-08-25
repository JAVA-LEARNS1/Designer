package com.ld.Singleton;

public class LazySingleton {
    public static void main(String[] args) {

    }
}
//懒汉模式
class Lazy{
    //volatile防止指令重排
    private volatile static Lazy instance;

    private Lazy() {
    }

    public static Lazy getInstance() {
        //volatile
        if(null==instance){
            synchronized (Lazy.class){
                if(null==instance){
                    instance=new Lazy();
                    //jvm操作  在不影响结果的情况下，下面的123指令可能从排序
                    //有两个线程进来当第一个线程到3的步骤时 此时第二个线程到//valatile的步骤时会直接返回instance
                    //但此时的instance还没有执行2的操作，会产生未知的错误，如果避免
                    //就需要使用关键字volatile来修饰变量，这样指令就不会重拍，会按照123的顺序执行
                    //1.开辟空间

                    //3.赋值 instance

                    //2.初始化空间
                }
            }
        }
        return instance;
    }
}
