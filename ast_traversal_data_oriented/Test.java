package ast_traversal_data_oriented;

public class Test {

	public static void main(String[] args) {
		var ast = new MulExp(new SignExp(new IntLiteral(42)), new IntLiteral(2)); // -42*2
		System.out.println(ast.toPrefixNotation().equals("*-42 2"));
		System.out.println( ast.eval() == -84 );
	}

}
