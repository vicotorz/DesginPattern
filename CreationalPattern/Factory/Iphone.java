package Factory;

import Factory.Phone;

public class Iphone implements Phone {


    @Override
    public String brand() {
        return "this is a Apple phone";
    }
}