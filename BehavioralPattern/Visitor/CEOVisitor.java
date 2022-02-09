package Visitor;

import java.util.Date;

public class CEOVisitor implements Visitor {
    @Override
    public void visit(ProjectElement element) {
        System.out.println("CEO visitor element");
        element.signature("CEO", new Date());
    }
}
