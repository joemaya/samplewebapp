package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "test"  // MVC @Configuration
})
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}