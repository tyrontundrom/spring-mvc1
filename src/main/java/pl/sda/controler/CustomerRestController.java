package pl.sda.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.dto.CustomerDto;

import java.util.List;

@RestController
public class CustomerRestController {

    @GetMapping("/customers")
    public List<CustomerDto> getCustomers() {
        List<CustomerDto> customers = List.of(createCustomer("Adam", "Nowak"),
                createCustomer("Kasia", "Bagińska"));

        return customers;
    }

    private CustomerDto createCustomer(String firstName, String lastName) {
        return CustomerDto.builder().firstName(firstName).lastName(lastName).build();
    }
}
