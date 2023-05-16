package ast_traversal_operation_oriented;

import static java.util.Objects.requireNonNull;

public class SignExp implements AST {
	private final AST exp;

	public SignExp(AST exp) {
		this.exp = requireNonNull(exp);
	}


	@Override
	public <T> T accept(Visitor<T> v) {
		return  v.visitSignExp(exp);
	}
}
