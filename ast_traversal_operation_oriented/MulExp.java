package ast_traversal_operation_oriented;

import static java.util.Objects.requireNonNull;

public class MulExp implements AST {
	private final AST left, right;

	public MulExp(AST left, AST right) {
		this.left = requireNonNull(left);
		this.right = requireNonNull(right);
	}

	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visitMulExp(left, right);
	}


}
