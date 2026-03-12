package bean_annotation.config;

import bean_annotation.entity.Person;
import com.sun.tools.jdeprscan.scan.Scan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AppConfig {
    @Scope(value = "prototype")
    @Bean(name = "getPerson")
    public Person getPerson(){
        return new Person();
    }

    @Bean(name = "getScanner")
    public Scanner getScanner(){
        return new Scanner(System.in);
    }


}
