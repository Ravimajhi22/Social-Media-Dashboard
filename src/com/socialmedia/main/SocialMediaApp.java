package com.socialmedia.main;

import com.socialmedia.model.*;
import java.util.Scanner;

public class SocialMediaApp 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        User currentUser = new User("ravi");

        while (true) 
        {
            System.out.println("\n=== Social Media Dashboard ===");
            
            System.out.println("1. Create Post");
            
            System.out.println("2. View My Posts");
            
            System.out.println("3. Like a Post");
            
            System.out.println("4. Analytics");
            
            System.out.println("5. Exit");
            
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter post content: ");
                    String content = sc.nextLine();
                    currentUser.addPost(new Post(content));
                    System.out.println("Post created!");
                    break;
                case 2:
                    for (int i = 0; i < currentUser.getPosts().size(); i++) {
                        Post p = currentUser.getPosts().get(i);
                        System.out.println(i + ". " + p.getContent() + " ❤️ " + p.getLikes());
                    }
                    break;
                case 3:
                    System.out.print("Enter post index to like: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < currentUser.getPosts().size()) {
                        currentUser.getPosts().get(index).like();
                        System.out.println(" Post liked!");
                    }
                    break;
                case 4:
                    int totalPosts = currentUser.getPosts().size();
                    int totalLikes = currentUser.getPosts().stream().mapToInt(Post::getLikes).sum();
                    System.out.println("Total Posts: " + totalPosts);
                    System.out.println("Total Likes: " + totalLikes);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
