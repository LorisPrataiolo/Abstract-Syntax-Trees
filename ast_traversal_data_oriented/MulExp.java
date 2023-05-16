package ast_traversal_data_oriented;

import static java.util.Objects.requireNonNull;

public class MulExp implements AST {
	private final AST left, right;

	// siccome stiamo creando un'albero abbiamo bisogno di un figlio destro e uno sinistro
	// il cui nodo interno è làoperatore *
	public MulExp(AST left, AST right) {
		this.left = requireNonNull(left);
		this.right = requireNonNull(right);
	}

	@Override
	public String toPrefixNotation() {
		return "*" + left.toPrefixNotation() + " " + right.toPrefixNotation();
	}

	@Override
	public int eval() {
		return left.eval() * right.eval();
	}

}
