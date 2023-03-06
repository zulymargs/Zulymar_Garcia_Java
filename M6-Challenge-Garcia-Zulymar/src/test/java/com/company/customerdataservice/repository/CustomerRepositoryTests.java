/**---------------------------------------------------------
                    Customer Repository Tests

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
import java.util.Optional;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTests {
    @Autowired
    CustomerRepository customerRepo;

}

