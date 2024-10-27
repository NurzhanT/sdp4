// Visitor Interface
interface Visitor {
    void visitElementA(ElementA element);
    void visitElementB(ElementB element);
}

// Concrete Visitor
class ConcreteVisitor implements Visitor {
    @Override
    public void visitElementA(ElementA element) {
        System.out.println("Visiting " + element.getName() + " of type A");
    }

    @Override
    public void visitElementB(ElementB element) {
        System.out.println("Visiting " + element.getName() + " of type B");
    }
}

// Element Interface
interface Element {
    void accept(Visitor visitor);
}

// Concrete Elements
class ElementA implements Element {
    private String name;

    public ElementA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }
}

class ElementB implements Element {
    private String name;

    public ElementB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }
}

// Example Usage
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Element elementA = new ElementA("Element A");
        Element elementB = new ElementB("Element B");

        Visitor visitor = new ConcreteVisitor();
        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}
