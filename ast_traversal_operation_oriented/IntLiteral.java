package ast_traversal_operation_oriented;

public class IntLiteral implements AST {

	private final int value;

	public IntLiteral(int value) {
		this.value = value;
	}


	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visitInt(value);
	}
}
