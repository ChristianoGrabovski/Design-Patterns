package Visitor;

public class VisitorConcreto implements Visitor {
	
	@Override
	public void visit(ElementoConcreto elementoConcreto) {
		System.out.println("Estou Visitando com : " + elementoConcreto.getClass().getName());
	}

}
