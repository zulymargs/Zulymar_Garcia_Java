/**---------------------------------------------------------
                    Customer Repository
 -Used to implements JPA functionality an the connection
 with the customer database.

 Author: Zulymar Garcia Sonera
 ---------------------------------------------------------*/


package com.company.customerdataservice.repository;

import com.company.customerdataservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Set;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    //JPA query for finding a customer record by state.
    Set<Customer> findByState(String state);

}
