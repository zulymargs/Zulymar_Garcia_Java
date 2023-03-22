/**---------------------------------------------------------
                    Customer Controller
-Let the user create, get, update,and delete a customer

 Author: Zulymar Garcia Sonera
 ---------------------------------------------------------*/

package com.company.customerdataservice.controller;

import com.company.customerdataservice.model.Customer;
import com.company.customerdataservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository repo;

//    Creates a new customer.
@PostMapping("/customers")
@ResponseStatus(HttpStatus.CREATED)
public Customer addCustomer(@RequestBody Customer customer) {
    return repo.save(customer);
}

//    Updates an existing customer.
@PutMapping("/customers")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void updateCustomer(@RequestBody Customer customer) {
    repo.save(customer);
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

    Optional<Customer> value = repo.findById(id);
    if (value.isPresent()) {
        return value.get();
    } else {
        return null;
    }
}

//    Returns all customers for a specific state.
@GetMapping("/customers/state/{state}")
public Set<Customer> getCustomersByState(@PathVariable String state) {
    Set<Customer> customerList= new HashSet<>();
    for(Customer c: repo.findAll())
    {
        if(c.getState() == state)
        {
            customerList.add(c);
        }
    }

    return customerList;
}

// Returns all customers
@GetMapping("/customers")
public List<Customer> getAllCustomers() {
    return repo.findAll();
}
{}


}
