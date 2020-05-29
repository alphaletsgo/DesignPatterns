package cn.isif.single;

/**
 * 这是Double Check单例安全版本
 * 使用了volatile关键字修饰实例
 */
public class DCLSingleSafe {
    private static volatile DCLSingleSafe instance = null;
    public static DCLSingleSafe getInstance(){
        if (instance==null){
            synchronized (DCLSingleSafe.class){
                if (instance==null){
                    instance = new DCLSingleSafe();
                }
                return instance;
            }
        }
        return instance;
    }

    private DCLSingleSafe(){}
}
