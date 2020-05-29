package cn.isif.single;

/**
 * 饿汉式
 * 优缺：
 *  - 无论是否有需要都会加载和实例化
 *  - 线程安全
 */
public class SingleEasy {
    private static SingleEasy instance = new SingleEasy();

    public static SingleEasy getInstance(){
        return instance;
    }
    private SingleEasy(){}
}
