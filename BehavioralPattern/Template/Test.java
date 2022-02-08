package Template;

public class Test {
    public static void main(String[] args) {
        AbstractTemplate template = new TakeMoney();
        template.templateMethod();

        AbstractTemplate template1 = new SaveMoney();
        template1.templateMethod();
    }
}
