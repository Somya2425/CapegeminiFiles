package primary_qualifier;

import annotation_configuration.pre_and_post_using_annotation.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
    @Autowired
    @Qualifier(value = "bike")

    private Vehicle vehicle1;

    public void start(){
        vehicle1.run();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Main main = context.getBean(Main.class);
        main.start();
      // System.out.println(main);
    }
}
