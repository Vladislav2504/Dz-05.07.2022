import java.util.List;

public class Sonnet {

    private List<Author> author;
    private String title;
    private List<Lines> lines;

    public Sonnet(List<Author> author, String title, List<Lines> lines) {
        this.author = author;
        this.title = title;
        this.lines = lines;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Lines> getLines() {
        return lines;
    }

    public void setLines(List<Lines> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Sonnet{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", lines=" + lines +
                '}';
    }
}
