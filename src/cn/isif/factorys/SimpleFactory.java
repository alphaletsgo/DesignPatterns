package cn.isif.factorys;

/**
 * 简单工厂属于创建型设计模式，是工厂设计模式中最简单的一种
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Car car = CarFactory.createCar("BMW");
        car.drive();
    }
}

interface Car{
    void drive();
}
class BMW implements Car{

    @Override
    public void drive() {
        System.out.println("BMW drive");
    }
}
class Mercedes implements Car{

    @Override
    public void drive() {
        System.out.println("Mercedes drive");
    }
}
class CarFactory {
    public static Car createCar(String Brand){
        switch (Brand){
            case "BMW":
                return new BMW();
            case "Mercedes":
                return new Mercedes();
            default:
                return null;
        }
    }
}
