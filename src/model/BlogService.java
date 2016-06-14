package model;

import java.util.ArrayList;

/**
 * Created by larsd on 20-May-16.
 */
public class BlogService {

    private ArrayList<User> allUsers = new ArrayList<User>();

    public void addBlogForUser(String subject, String text, User user) {
        if(subject != null && !subject.equals("") && text != null && !text.equals("") && user != null) {
            user.addBlogPost(new BlogPost(subject, text));
        }
        else {
            throw new IllegalArgumentException("Please fill in all the fields");
        }
    }

    public boolean registerUser(String username, String password, String email, String name) {

        for(User u : allUsers) {
            if(u.getUsername().equals(username)) {
                return false;
            }
        }
        allUsers.add(new User(username, password, email, name));

        return true;
    }

    public User loginUser(String username, String password) {

        for(User u : allUsers) {
            if(u.getUsername().equals(username)) {
                if(u.checkPassword(password)) {

                    return u;

                }
            }
        }
        return null;
    }


    public ArrayList<BlogPost> getAllPosts() {
        ArrayList<BlogPost> allPosts = new ArrayList<BlogPost>();

        for(User u : allUsers) {
            allPosts.addAll(u.getMyPosts());
        }

        return allPosts;
    }
}
