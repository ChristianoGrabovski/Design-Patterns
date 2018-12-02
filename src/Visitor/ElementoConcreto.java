package Visitor;

public class ElementoConcreto extends Elemento {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		super.accept(visitor);
	}
}
