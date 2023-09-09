package lab8.Lab5;

public class Song extends Composition {
    private String text;
    private String authorText;

    public Song() {
    }

    public Song(String name, double duration, String text, String author)  {
        super(name, duration);
        this.text = text;
        this.authorText = author;
    }

    @Override
    public String formDesc() {
        return this.getName() + " /// dur: " + this.getDuration() + "\nText: " + text + "///Author :" + authorText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthorText() {
        return authorText;
    }

    public void setAuthorText(String authorText) {
        this.authorText = authorText;
    }

    @Override
    public String toString() {
        return "Song{" + "name='" + getName() + '\'' +
                ", duration=" + getDuration() +
                "authorText='" + authorText + '\'' +
                '}';
    }
}
