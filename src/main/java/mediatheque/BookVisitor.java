package mediatheque;

public class BookVisitor implements ItemVisitor{
    public BookVisitor(){}

    public void visit(Book item) {
        System.out.println(item.toString());
    }

    public void visit(CD item) {

    }
}
