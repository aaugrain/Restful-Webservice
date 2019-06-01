package API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import customers.*;

@RestController
public class CustomerController {

    private String name;

    @RequestMapping("/customers/{name}")
    public String showCustomer(@PathVariable String name) {
        extracted(name);
        return name;
    }

    private void extracted(String name) {
        this.name = name;
    }
}