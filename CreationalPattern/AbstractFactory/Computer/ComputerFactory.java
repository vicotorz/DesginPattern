package AbstractFactory.Computer;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Phone.Phone;

public class ComputerFactory implements AbstractFactory {
    @Override
    public Phone createPhone(String brand) {
        return null;
    }

    @Override
    public Computer createComputer(String brand) {
        if ("Huawei".equals(brand)) {
            return new ComputerHuaWei();
        } else if ("Apple".equals(brand)) {
            return new ComputerApple();
        } else {
            return null;
        }
    }
}
