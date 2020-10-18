package mediatheque;

public class CDVisitor implements ItemVisitor{
    public CDVisitor(){}

    public void visit(Book item) {

    }

    public void visit(CD item) {
        System.out.println(item.toString());
    }
}
