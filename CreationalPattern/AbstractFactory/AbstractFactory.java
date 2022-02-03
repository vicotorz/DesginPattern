package AbstractFactory;

import AbstractFactory.Computer.Computer;
import AbstractFactory.Phone.Phone;

public interface AbstractFactory {
    public abstract Phone createPhone(String brand);
    public abstract Computer createComputer(String brand);
}
