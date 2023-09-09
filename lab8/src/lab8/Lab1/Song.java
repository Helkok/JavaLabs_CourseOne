package lab8.Lab1;

import java.util.Arrays;

public class Song extends Composition{
    private String text;
    private String authorText;

    public Song() {
    }

    public Song(String name, double duration, String text, String author) throws NazvanieException {
        super(name, duration);
        this.text = text;
        this.authorText = author;
    }

    @Override
    public String formDesc() throws ProdolzhitelnostException {
        String s;
        try {
            if(getDuration() <= 0){
                throw new ProdolzhitelnostException();
            }
            s = this.getName() + " \nдлительность: " + this.getDuration() + "\nText: " + text + "\nAuthor:" + authorText;
        }catch (ProdolzhitelnostException e){
          s = "ProdolzhitelnostException";
            System.out.println(Arrays.toString(e.getStackTrace()));
            throw e;

        } catch (Exception e){
            s = "Exception";
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return s;
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
}
