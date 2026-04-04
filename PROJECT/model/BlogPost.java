package model;

public class BlogPost {
    private String title, content, status;
    private Author author;
    private int likes;
    private Comment[] comments;
    private int commentCount;

    public BlogPost(String title, String content, Author author) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.status = "draft";
        this.likes = 0;
        this.comments = new Comment[10];
        this.commentCount = 0;
    }

    public void publish() { status = "published"; System.out.println("Published: " + title); }
    public void like() { likes++; }

    public void addComment(Comment c) {
        comments[commentCount] = c;
        commentCount++;
    }

    public String getTitle() { return title; }
    public String getStatus() { return status; }

    public void showPost() {
        System.out.println("Title: " + title + " | By: " + author.getName() + " | Status: " + status + " | Likes: " + likes);
        if (commentCount == 0) {
            System.out.println("  No comments.");
        } else {
            for (int i = 0; i < commentCount; i++)
                System.out.println("  [" + comments[i].getAuthor() + "]: " + comments[i].getText());
        }
    }
}