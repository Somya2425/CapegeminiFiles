package annotation_configuration.entity;

import annotation_configuration.configuration.AppConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("${id}")
   // @Value("2")
    private int id;
    @Value("${name}")
   // @Value(value = "abc")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return (id+" "+name);
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println( person.id);
        System.out.println(person.name);
    }
}
