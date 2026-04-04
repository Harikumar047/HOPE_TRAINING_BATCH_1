package model;

public class Reader extends Person {
    public Reader(String name, String email) {
        super(name, email);
    }

    public void comment(BlogPost post, String text) {
        if (text == null || text.isEmpty()) {
            System.out.println("Error: Comment cannot be empty.");
            return;
        }
        post.addComment(new Comment(text, this));
        System.out.println(getName() + " commented on: " + post.getTitle());
    }

    @Override
    public String getRole() { return "Reader"; }
}