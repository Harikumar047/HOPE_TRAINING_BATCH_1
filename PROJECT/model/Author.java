package model;

public class Author extends Person {
    private BlogPost[] posts;
    private int count;

    public Author(String name, String email) {
        super(name, email);
        this.posts = new BlogPost[10];
        this.count = 0;
    }

    public void writePost(String title, String content) {
        if (title == null || title.isEmpty()) {
            System.out.println("Error: Title cannot be empty.");
            return;
        }
        posts[count] = new BlogPost(title, content, this);
        count++;
        System.out.println("Post created: " + title);
    }

    public BlogPost getPost(int index) { return posts[index]; }
    public int getCount() { return count; }

    @Override
    public String getRole() { return "Author"; }
}