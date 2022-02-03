package Factory;

public class Factory {

    public Phone createPhone(String phoneNames) {
        if ("Huawei".equals(phoneNames)) {
            return new HuaWei();
        } else if ("Apple".equals(phoneNames)) {
            return new Iphone();
        } else {
            return null;
        }
    }


    //使用main
    public static void main(String[] args) {
        Factory factory = new Factory();
        Phone huawei = factory.createPhone("Huawei");
        Phone iphone = factory.createPhone("Apple");
        System.out.println(huawei.brand());
        System.out.println(iphone.brand());
    }
}
