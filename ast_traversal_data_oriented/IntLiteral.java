package ast_traversal_data_oriented;

public class IntLiteral implements AST {

	private final int value;

	public IntLiteral(int value) {
		this.value = value;
	}

	@Override
	public String toPrefixNotation() {
		return Integer.toString(value);
	}

	@Override
	public int eval() {
		return value;
	}

}
