package IC.AST;

import IC.LIR.*;

/**
 * Class field AST node.
 * 
 * @author Tovi Almozlino
 */
public class Field extends ASTNode {

	private Type type;

	private String name;

	public Object accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
	public LIRUpType accept(PropagatingVisitor<Integer,LIRUpType> visitor, Integer downInt){
		return visitor.visit(this, downInt);
	}

	/**
	 * Constructs a new field node.
	 * 
	 * @param type
	 *            Data type of field.
	 * @param name
	 *            Name of field.
	 */
	public Field(Type type, String name) {
		super(type.getLine());
		this.type = type;
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public String getName() {
		return name;
	}

}
