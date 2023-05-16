package ast_traversal_operation_oriented;

public interface Visitor<T> {

    // for each node we have to define an object method
T visitInt(int val);
T visitMulExp(AST left , AST right);
T visitSignExp (AST exp);


}
