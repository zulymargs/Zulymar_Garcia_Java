/**---------------------------------------------------------
                    Customer Controller

 Author: Zulymar Garcia Sonera
 ---------------------------------------------------------*/

package com.company.customerdataservice.controller;

import com.company.customerdataservice.model.Customer;
import com.company.customerdataservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository repo;

//    A POST route that creates a new customer.
@PostMapping("/customers")
@ResponseStatus(HttpStatus.CREATED)
public Customer addCustomer(@RequestBody Customer customer) {
    return repo.save(customer);
}

////    A PUT route that updates an existing customer. 10 pts
@PutMapping("/customer/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void updateCustomer(@PathVariable int id) {
    repo.save(repo.findById(id));
}

//    A DELETE route that deletes an existing customer. 10 pts
@DeleteMapping("/customers/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void deleteCustomer(@PathVariable int id) {
    repo.deleteById(id);
}

//    A GET route that returns a specific customer by id.
@GetMapping("/customers/{id}")
public Customer getCustomerByID(@PathVariable int id) {

    Optional<Customer> returnVal = repo.findById(id);
    if (returnVal.isPresent()) {
        return returnVal.get();
    } else {
        return null;
    }
}

//    A GET route that returns all customers for a specific state.
@GetMapping("/customers/{state}")
public List<Customer> getCustomersByState(@PathVariable String state) {
    return repo.findByState(state);
}

}
