package spring.crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example1Controller {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Meghana!";
    }
}
