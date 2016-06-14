package utils;

import model.BlogService;
import model.ServiceProvider;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by larsd on 20-May-16.
 */
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        BlogService blogService = ServiceProvider.getBlogService();

        blogService.registerUser("asd", "asd", "asd@asd", "asd");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

}
