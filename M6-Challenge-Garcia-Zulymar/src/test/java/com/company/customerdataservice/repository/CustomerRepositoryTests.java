/**---------------------------------------------------------
                    Customer Repository Tests
-To test that our Customer repository is doing what it's
 asked to do
 Author: Zulymar Garcia Sonera
 ---------------------------------------------------------*/
package com.company.customerdataservice.repository;
import com.company.customerdataservice.model.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTests {
    @Autowired
    CustomerRepository customerRepo;

    @Before
    public void setUp()throws Exception
    {
     customerRepo.deleteAll();
    }

    //Should add a new customer into database
    @Test
    public void addCustomer()
    {
        Customer customer= new Customer();

        customer.setFirstName("Lola");
        customer.setLastName("Perez");
        customer.setAddress_1("1234 Somestreet Drive");
        customer.setAddress_2("Dreamland 456");
        customer.setCompany("Netflix");
        customer.setCity("Los Angeles");
        customer.setState("CA");
        customer.setPostalCode("54321");
        customer.setPhone("123-123-1234");
        customer.setEmail("l.perez33@Netflix.com");
        customer.setCountry("USA");

        customer=customerRepo.save(customer);
        Optional<Customer> customer1=customerRepo.findById((customer.getId()));

        assertEquals(customer1.get(), customer);
    }


    //Should get a specific customer by Id from the database
    @Test
    public void shouldGetSpecificCustomerById()
    {
        Customer customer= new Customer();

        customer.setFirstName("Lola");
        customer.setLastName("Perez");
        customer.setAddress_1("1234 Somestreet Drive");
        customer.setAddress_2("Dreamland 456");
        customer.setCompany("Netflix");
        customer.setCity("Los Angeles");
        customer.setState("CA");
        customer.setPostalCode("54321");
        customer.setPhone("123-123-1234");
        customer.setEmail("l.perez33@Netflix.com");
        customer.setCountry("USA");

        customerRepo.save(customer);

        Optional<Customer> customer1=customerRepo.findById((customer.getId()));

        assertEquals(customer1.get(), customer);

    }

    //Should update a specific customer by Id from the database
    @Test
    public void shouldUpdateSpecificCustomerById()
    {
        Customer customer= new Customer();

        customer.setFirstName("Lola");
        customer.setLastName("Perez");
        customer.setAddress_1("1234 Somestreet Drive");
        customer.setAddress_2("Dreamland 456");
        customer.setCompany("Netflix");
        customer.setCity("Los Angeles");
        customer.setState("CA");
        customer.setPostalCode("54321");
        customer.setPhone("123-123-1234");
        customer.setEmail("l.perez33@Netflix.com");
        customer.setCountry("USA");

        customerRepo.save(customer);
        customer.setEmail("zulymar.garcia@netflix.com");

        customerRepo.save(customer);
        Optional<Customer> customer1=customerRepo.findById((customer.getId()));

        assertEquals(customer1.get(), customer);

    }

    //Should deletes a specific customer by Id from the database
    @Test
    public void shouldshouldDeleteCustomer()
    {
        Customer customer= new Customer();

        customer.setFirstName("Lola");
        customer.setLastName("Perez");
        customer.setAddress_1("1234 Somestreet Drive");
        customer.setAddress_2("Dreamland 456");
        customer.setCompany("Netflix");
        customer.setCity("Los Angeles");
        customer.setState("CA");
        customer.setPostalCode("54321");
        customer.setPhone("123-123-1234");
        customer.setEmail("l.perez33@Netflix.com");
        customer.setCountry("USA");

        customerRepo.save(customer);

        Optional<Customer> customer1 = customerRepo.findById(customer.getId());

        assertEquals(customer1.get(), customer);

        customerRepo.deleteById(customer.getId());

        customer1 = customerRepo.findById(customer.getId());

        assertFalse(customer1.isPresent());

    }

    //Should get customers by state
    @Test
    public void shouldGetCustomersByState()
    {
        Customer customer= new Customer();

        customer.setFirstName("Lola");
        customer.setLastName("Perez");
        customer.setAddress_1("1234 Somestreet Drive");
        customer.setAddress_2("Dreamland 456");
        customer.setCompany("Netflix");
        customer.setCity("Los Angeles");
        customer.setState("CA");
        customer.setPostalCode("54321");
        customer.setPhone("123-123-1234");
        customer.setEmail("l.perez33@Netflix.com");
        customer.setCountry("USA");

        customerRepo.save(customer);

        Customer customer2= new Customer();

        customer2.setFirstName("Lola");
        customer2.setLastName("Perez");
        customer2.setAddress_1("1234 Somestreet Drive");
        customer2.setAddress_2("Dreamland 456");
        customer2.setCompany("Netflix");
        customer2.setCity("Los Angeles");
        customer2.setState("CA");
        customer2.setPostalCode("54321");
        customer2.setPhone("123-123-1234");
        customer2.setEmail("l.perez33@Netflix.com");
        customer2.setCountry("USA");
        customerRepo.save(customer2);

        Set<Customer> customersList=customerRepo.findByState((customer.getState()));

        assertEquals(customersList.size(), 2);

    }


}

