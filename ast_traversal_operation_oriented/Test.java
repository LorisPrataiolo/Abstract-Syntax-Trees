package ast_traversal_operation_oriented;

public class Test {

	public static void main(String[] args) {
		var ast = new MulExp(new SignExp(new IntLiteral(42)), new IntLiteral(2)); // -42*23
		System.out.println( ast.accept(new ToPrefixNotation()).equals("*-42 2"));
		System.out.println( ast.accept(new Eval()).equals(-84));
	}

}
