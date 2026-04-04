package manager;

import model.BlogPost;

public class BlogManager {
    private BlogPost[] posts;
    private int count;

    public BlogManager() {
        this.posts = new BlogPost[20];
        this.count = 0;
    }

    public void add(BlogPost p) {
        posts[count] = p;
        count++;
    }

    public void remove(BlogPost p) {
        for (int i = 0; i < count; i++) {
            if (posts[i] == p) {
                for (int j = i; j < count - 1; j++)
                    posts[j] = posts[j + 1];
                posts[count - 1] = null;
                count--;
                return;
            }
        }
    }

    public void showAll() {
        System.out.println("--- All Posts ---");
        if (count == 0) { System.out.println("  No posts."); return; }
        for (int i = 0; i < count; i++)
            System.out.println("  " + posts[i].getTitle() + " [" + posts[i].getStatus() + "]");
    }
}