package Visitor;

public class Tester {

	public static void main(String[] args) {
		ElementoConcreto elementoConcreto = new ElementoConcreto();
		VisitorConcreto visitorConcreto = new VisitorConcreto();
		elementoConcreto.accept(visitorConcreto);

	}

}
