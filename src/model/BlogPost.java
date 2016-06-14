package model;

/**
 * Created by larsd on 20-May-16.
 */
public class BlogPost {

    private long creationTime;
    private String subject;
    private String text;

    public BlogPost(String subject, String text) {
        this.subject = subject;
        this.text = text;
        this.creationTime = System.currentTimeMillis();
    }

    public long getCreationTime() {
        return creationTime;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }
}
