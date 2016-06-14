package model;

/**
 * Created by larsd on 20-May-16.
 */
public class ServiceProvider {

    private static BlogService blogService = new BlogService();

    public static BlogService getBlogService() {
        return blogService;
    }
}
