package AbstractFactory.Phone;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Computer.Computer;

public class PhoneFactory implements AbstractFactory {

    @Override
    public Phone createPhone(String brand) {
        if ("Huawei".equals(brand)) {
            return new PhoneHuaWei();
        } else if ("Apple".equals(brand)) {
            return new PhoneApple();
        } else {
            return null;
        }
    }

    @Override
    public Computer createComputer(String brand) {
        return null;
    }
}
