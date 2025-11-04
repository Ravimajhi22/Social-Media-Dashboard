package com.socialmedia.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Post> posts;
    private List<User> followers;
    private List<User> following;

    public User(String username) {
        this.username = username;
        this.posts = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }

    public String getUsername() { return username; }
    public List<Post> getPosts() { return posts; }

    public void addPost(Post post) { posts.add(post); }
}
