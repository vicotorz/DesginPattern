package Visitor;

public class Test {
    public static void main(String[] args) {
        Element element = new ProjectElement("mobike", "share bike");
        element.accept(new CEOVisitor());
        element.accept(new CTOVisitor());
    }
}
