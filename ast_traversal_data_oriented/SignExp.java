package ast_traversal_data_oriented;

import static java.util.Objects.requireNonNull;

public class SignExp implements AST {
	private final AST exp;

	public SignExp(AST exp) {
		this.exp = requireNonNull(exp);
	}

	@Override
	public String toPrefixNotation() {
		return "-" + exp.toPrefixNotation();
	}

	@Override
	public int eval() {
		return -exp.eval();
	}

}
