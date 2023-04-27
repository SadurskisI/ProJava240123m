package javaPro.lesson4.task5;

public class Book implements Cloneable{

    private String name;
    private Author author;

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public Book(Book book) {
        this.name = book.getName();
        this.author = new Author(book.getAuthor());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
