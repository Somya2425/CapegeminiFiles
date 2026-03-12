package ioc.xmlconfig;

import PostConstructorPreDestroyer.Vehicle;
import dependancy_injection.Library;
import dependancy_injection.Person;
import dependency_injection_usingMap.Kit;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
    public static void main(String[] args) {
        BeanFactory beanFactory1 = new XmlBeanFactory(new ClassPathResource("bean_configuration.xml"));
        Laptop l1 = (Laptop) beanFactory1.getBean("b1");
        System.out.println(l1);

//        BeanFactory beanFactory2 = new XmlBeanFactory(new ClassPathResource("bean_configuration.xml"));
//        Laptop l2 = beanFactory2.getBean(Laptop.class);
//        System.out.println(l2);

      //  Laptop laptop2 = (Laptop) beanFactory.get("bean_id");
       // System.out.println(laptop2);

       // ApplicationContext context = new ClassPathXmlApplicationContext("bean_configuration.xml");
       // Laptop laptop3 = (Laptop) context.getBean("bean_id");
       // System.out.println(laptop3);

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean_configuration.xml");

        Laptop l3 = context.getBean("b1", Laptop.class);
        System.out.println(l3);

        Laptop l4 = context.getBean("bean_id", Laptop.class);
        System.out.println(l4);

        ApplicationContext con = new ClassPathXmlApplicationContext("dependency_injection.xml");
        Person person1 = con.getBean("per1", Person.class);
        System.out.println(person1);


        BeanFactory beanFactory2 =new XmlBeanFactory(new ClassPathResource("dependency_injection.xml"));
        Person person2 = (Person) beanFactory2.getBean("per1");
        System.out.println(person2);

        BeanFactory beanFactory3 = new XmlBeanFactory(new ClassPathResource("list_dependency_injection.xml"));
        Library lib = (Library) beanFactory3.getBean("list1");
        System.out.println(lib);

        BeanFactory beanFactory4 = new XmlBeanFactory(new ClassPathResource("map_kit.xml"));
        Kit kit = (Kit) beanFactory4.getBean("map1");
        System.out.println(kit);

        BeanFactory beanFactory6 = new XmlBeanFactory(new ClassPathResource("post_and_pre.xml"));
        Vehicle vehicle = (Vehicle) beanFactory6.getBean("id1");
        System.out.println(vehicle);


        ApplicationContext con1 = new ClassPathXmlApplicationContext("post_and_pre.xml");
        Vehicle v1 = con1.getBean("id1", Vehicle.class);
        ( (AbstractApplicationContext) con1).close();
        System.out.println(v1);

    }

}
