package IC.AST;

import java.util.List;

import IC.LIR.*;

/**
 * Statements block AST node.
 * 
 * @author Tovi Almozlino
 */
public class StatementsBlock extends Statement {

	private List<Statement> statements;

	public Object accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
	public LIRUpType accept(PropagatingVisitor<Integer,LIRUpType> visitor, Integer downInt){
		return visitor.visit(this, downInt);
	}

	/**
	 * Constructs a new statements block node.
	 * 
	 * @param line
	 *            Line number where block begins.
	 * @param statements
	 *            List of all statements in block.
	 */
	public StatementsBlock(int line, List<Statement> statements) {
		super(line);
		this.statements = statements;
	}

	public List<Statement> getStatements() {
		return statements;
	}

}
