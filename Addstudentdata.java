import java.util.ArrayList;
import java.util.List;

public class Addstudentdata {
    private String id;
    private String name;
    private List<Addbooksdata> issubooks;

    public Addstudentdata(String id, String name) {
        this.id = id;
        this.name = name;
        this.issubooks = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void issueTheBook(Addbooksdata book) {
        issubooks.add(book);
        book.issbooks();
    }

    public void returnTheBook(Addbooksdata book) {
        issubooks.remove(book);
        book.returnbooks();
    }
}
