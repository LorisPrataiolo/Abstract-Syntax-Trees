package ast_traversal_operation_oriented;

public class Eval implements Visitor<Integer> {
    @Override
    public Integer visitInt(int val) {
        return val;
    }

    @Override
    public Integer visitMulExp(AST left, AST right) {
        return left.accept(this) * right.accept(this);
    }

    @Override
    public Integer visitSignExp(AST exp) {
        return -exp.accept(this);
    }


}
