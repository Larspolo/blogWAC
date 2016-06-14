package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by larsd on 20-May-16.
 */
public class User {

    private String username;
    private String password;
    private String email;
    private String name;

    private ArrayList<BlogPost> myPosts;

    public User(String username, String password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.myPosts = new ArrayList<BlogPost>();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public boolean checkPassword(String password) {
        return (this.password.equals(password));
    }

    public void addBlogPost(BlogPost blogPost) {
        myPosts.add(blogPost);
    }

    public List<BlogPost> getMyPosts() {
        return Collections.unmodifiableList(myPosts);
    }
}
