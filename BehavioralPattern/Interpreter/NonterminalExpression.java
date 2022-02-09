package Interpreter;

public class NonterminalExpression implements Expression{
    private Expression left;
    private Expression right;

    public NonterminalExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void interpret(Context cxt) {
        //递归调用每一个组成部分interpret()
        //在递归调用时指定组成部分的链接方式，即非终结符的功能
    }
}
