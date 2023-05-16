package ast_traversal_operation_oriented;

public class ToPrefixNotation implements Visitor<String> {
    @Override
    public String visitInt(int val) {
        return  Integer.toString(val);
    }

    @Override
    public String visitMulExp(AST left, AST right) {
        return "*" + left.accept(this) + " " + right.accept(this);
    }

    @Override
    public String visitSignExp(AST exp) {
        return "-"+exp.accept(this);
    }


}
