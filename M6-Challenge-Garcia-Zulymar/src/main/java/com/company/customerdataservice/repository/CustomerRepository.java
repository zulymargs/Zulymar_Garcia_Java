/**---------------------------------------------------------
                    Customer Repository

 Author: Zulymar Garcia Sonera
 ---------------------------------------------------------*/


package com.company.customerdataservice.repository;

import com.company.customerdataservice.model.Customer;

import java.util.List;

public interface CustomerRepository {
    Customer save(Customer customer);


//    Create a new customer record. 5 pts


//    Update an existing customer record. 5 pts
//
//    Delete an existing customer record. 5 pts
 void deleteById(int id);


//    Find a customer record by id. 5 pts

    Customer findById(int id);

    List<Customer> findByState(String state);


//    Find customer records by state. 5 pts
}
