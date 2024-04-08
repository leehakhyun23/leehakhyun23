package test1;

public class BookDTO {
    private static int nextId = 1;
    private int id;
    private String name;
    private String author;

    public BookDTO(String name, String author) {
        this.id = BookDTO.nextId++;
        this.name = name;
        this.author = author;
    }

    public BookDTO(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
