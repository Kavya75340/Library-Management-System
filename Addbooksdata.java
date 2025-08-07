public class Addbooksdata {
    private String id;
    private String title;
    private String author;
    private int noOfBook;

    public Addbooksdata(String id, String title, String author, int noOfBooks) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.noOfBook = noOfBooks;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNoOfBook() {
        return noOfBook;
    }

    public void issbooks() {
        noOfBook--;
    }

    public void returnbooks() {
        noOfBook++;
    }

    public boolean isAvailable() {
        return noOfBook > 0;
    }

}
