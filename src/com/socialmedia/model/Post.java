package com.socialmedia.model;

import java.time.LocalDateTime;

public class Post {
    private String content;
    private int likes;
    private LocalDateTime createdAt;

    public Post(String content) {
        this.content = content;
        this.likes = 0;
        this.createdAt = LocalDateTime.now();
    }

    public void like() { likes++; }
    public int getLikes() { return likes; }
    public String getContent() { return content; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
