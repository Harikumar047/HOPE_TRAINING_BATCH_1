package model;

public class Comment {
    private String text;
    private String authorName;

    public Comment(String text, Reader reader) {
        this.text = text;
        this.authorName = reader.getName();
    }

    public String getText() { return text; }
    public String getAuthor() { return authorName; }
}