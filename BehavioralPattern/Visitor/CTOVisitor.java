package Visitor;

import java.util.Date;

public class CTOVisitor implements Visitor {
    @Override
    public void visit(ProjectElement element) {
        System.out.println("CTO visitor element");
        element.signature("CTO", new Date());
    }
}
