package ast_traversal_operation_oriented;

public interface AST {

	// unique generic object method for any type of tree visit
	<T> T accept(Visitor<T> v);
}
