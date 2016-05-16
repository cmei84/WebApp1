package startup;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartupListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent e) {

    }

    @Override
    public void contextInitialized(ServletContextEvent e) {
        System.out.println("StartupListener executed...");
    }
}
