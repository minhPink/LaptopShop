package vn.project.laptopshop;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/user")
    public String userPage() {
        return "Hello World user!";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Hello World admin!";
    }
}
