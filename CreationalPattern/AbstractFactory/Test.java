package AbstractFactory;

import AbstractFactory.Computer.Computer;
import AbstractFactory.Computer.ComputerFactory;
import AbstractFactory.Phone.Phone;
import AbstractFactory.Phone.PhoneFactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory phoneFactory = new PhoneFactory();
        Phone phoneHuaWei = phoneFactory.createPhone("Huawei");
        Phone phoneApple = phoneFactory.createPhone("Apple");
        System.out.println(phoneHuaWei.call());
        System.out.println(phoneApple.call());

        AbstractFactory computerFactory = new ComputerFactory();
        Computer computerHuawei = computerFactory.createComputer("Huawei");
        Computer computerApple = computerFactory.createComputer("Apple");
        System.out.println(computerHuawei.internet());
        System.out.println(computerApple.internet());
    }

}
