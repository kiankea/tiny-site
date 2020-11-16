package kcn.kea.tinysite.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Tiny Site Project Running");
    }

}
