package model;

import manager.BlogManager;

public class Admin extends Author {
    public Admin(String name, String email) {
        super(name, email);
    }

    public void deletePost(BlogPost post, BlogManager manager) {
        manager.remove(post);
        System.out.println("[Admin] Removed post: " + post.getTitle());
    }

    @Override
    public String getRole() { return "Admin"; }
}