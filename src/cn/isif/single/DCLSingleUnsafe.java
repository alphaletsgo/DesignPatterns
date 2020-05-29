package cn.isif.single;

/**
 * 不安全的Double Check 单例
 * 为什么不安全呢?
 *      因为Java虚拟机会有指令重排序问题（jvm在对代码进行优化的时候，会对前后没有影响的代码进行指令重排序，也叫指令乱序），因为有指令重排序
 *      的问题，我们可能在这种单例实现中获得了一个未初始化的实例对象。
 *  解决办法
 *      使用volatile
 */
public class DCLSingleUnsafe {
    private static DCLSingleUnsafe instance = null;
    public static DCLSingleUnsafe getInstance(){
        if (instance==null){
            synchronized (DCLSingleUnsafe.class){
                if (instance==null){
                    instance = new DCLSingleUnsafe();
                }
                return instance;
            }
        }
        return instance;
    }

    private DCLSingleUnsafe(){}
}
