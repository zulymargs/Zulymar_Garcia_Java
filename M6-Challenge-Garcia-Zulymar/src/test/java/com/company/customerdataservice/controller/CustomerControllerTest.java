package com.company.customerdataservice.controller;

import com.company.customerdataservice.model.Customer;
import com.company.customerdataservice.repository.CustomerRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    CustomerRepository repo;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() throws Exception {
    }
    // Create
    @Test
    public void shouldCreateCustomer() throws Exception{
        Customer customer = new Customer();

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


        String inputJson = mapper.writeValueAsString(customer);

        mockMvc.perform(post("/customers")
                .content(inputJson)
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isCreated());
    }


    // Read by Id
    @Test
    public void shouldGetSpecificCustomerById() throws Exception{
        Customer customer = new Customer();

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

        mockMvc.perform(get("/customers/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }


    // Read All
    @Test
    public void shouldGetAllCustomers() throws Exception{
        Customer customer1 = new Customer();

        customer1.setFirstName("Lola");
        customer1.setLastName("Perez");
        customer1.setAddress_1("1234 Somestreet Drive");
        customer1.setAddress_2("Dreamland 456");
        customer1.setCompany("Netflix");
        customer1.setCity("Los Angeles");
        customer1.setState("CA");
        customer1.setPostalCode("54321");
        customer1.setPhone("123-123-1234");
        customer1.setEmail("l.perez33@Netflix.com");
        customer1.setCountry("USA");

        Customer customer2 = new Customer();

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

        Customer customer3 = new Customer();

        customer3.setFirstName("Lola");
        customer3.setLastName("Perez");
        customer3.setAddress_1("1234 Somestreet Drive");
        customer3.setAddress_2("Dreamland 456");
        customer3.setCompany("Netflix");
        customer3.setCity("Los Angeles");
        customer3.setState("CA");
        customer3.setPostalCode("54321");
        customer3.setPhone("123-123-1234");
        customer3.setEmail("l.perez33@Netflix.com");
        customer3.setCountry("USA");

        mockMvc.perform(get("/customers"))
                .andDo(print())
                .andExpect(status().isOk());
    }



    // Update
    @Test
    public void shouldUpdateCustomer() throws Exception {
        Customer customer = new Customer();

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


        String inputJson = mapper.writeValueAsString(customer);



        mockMvc.perform(put("/customers")
                .content(inputJson)
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isNoContent());

    }


    //Delete
    @Test
    public void shouldDeleteExistingCustomerByID() throws Exception{
        mockMvc.perform(delete("/customers/2"))
                .andDo(print())
                .andExpect(status().isNoContent());
    }


    // Search Customers by State
    @Test
    public void shouldSearchCustomerByState () throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/customers/state/CA")).andDo(print()).andExpect(status().isOk());
    }


}
