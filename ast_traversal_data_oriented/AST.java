package ast_traversal_data_oriented;


// traversal-data-oriented: object methods for visiting nodes are defined in a
// single separate class

public interface AST {

	// returns the string corresponding to an expression in prefix notation
	String toPrefixNotation();

	int eval(); // computes and returns the value of an expression
}

/* Pros:
*   - new types of traversal can be implemented without code modification
    - the object methods for visiting nodes are contained in the single class
	  that implements the specific traversal
	- more general solution */


/*Cons:
 * 	  - adding new types of nodes requires modification of all the classes
 * 		implementing the different types of traversals
 *
 * 	  - more complex solution and slightly less efficient code
 */
