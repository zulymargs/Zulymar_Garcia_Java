/**---------------------------------------------------------
 Customer Test
 -To test the Customer model class

 Author: Zulymar Garcia Sonera
 ---------------------------------------------------------*/

package com.company.customerdataservice.model;

import org.junit.Before;
import org.junit.Test;

import javax.persistence.Column;

import static org.junit.Assert.*;

public class CustomerTest {

     int id;
     String firstName;
     String lastName;
     String email;
     String company;
     String phone;
     String address_1;
     String address_2;
     String city;
     String state;
     String postalCode;
     String country;
    Customer customer1;
    Customer customer2;
    Customer customer3;

    @Before
    public void setUp() throws Exception {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        customer2 = new Customer();
        customer2.setId(id);
        customer2.setFirstName(firstName);
        customer2.setLastName(lastName);
        customer2.setEmail(email);
        customer2.setCompany(company);
        customer2.setPhone(phone);
        customer2.setAddress_1(address_1);
        customer2.setAddress_2(address_2);
        customer2.setCity(city);
        customer2.setState(state);
        customer2.setPostalCode(postalCode);
        customer2.setCountry(country);

        customer3 = new Customer();
        customer3.setId(id);
        customer3.setFirstName(firstName);
        customer3.setLastName(lastName);
        customer3.setEmail(email);
        customer3.setCompany(company);
        customer3.setPhone(phone);
        customer3.setAddress_1(address_1);
        customer3.setAddress_2(address_2);
        customer3.setCity(city);
        customer3.setState(state);
        customer3.setPostalCode(postalCode);
        customer3.setCountry(country);

    }

    @Test
    public void getId() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        assertEquals(customer1.getId(), id);

    }

    @Test
    public void setId() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        int newId=567;

        assertEquals(customer1.getId(), id);
        customer1.setId(newId);
        assertEquals(customer1.getId(), newId);
    }

    @Test
    public void getFirstName() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        assertEquals(customer1.getFirstName(), firstName);

    }

    @Test
    public void setFirstName() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        String newFirstName="Lola";
        assertEquals(customer1.getFirstName(), firstName);
        customer1.setFirstName(newFirstName);
        assertEquals(customer1.getFirstName(), newFirstName);
    }

    @Test
    public void getEmail() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);



        assertEquals(customer1.getEmail(), email);
    }

    @Test
    public void setEmail() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        String newEmail="zgarcia22@upr.edu";
        assertEquals(customer1.getEmail(), email);
        customer1.setEmail(newEmail);
        assertEquals(customer1.getEmail(), newEmail);
    }

    @Test
    public void getCompany() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);



        assertEquals(customer1.getCompany(), company);
    }

    @Test
    public void setCompany() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        String newCompany="UPR";
        assertEquals(customer1.getCompany(), company);
        customer1.setCompany(newCompany);
        assertEquals(customer1.getCompany(), newCompany);
    }

    @Test
    public void getPhone() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);



        assertEquals(customer1.getPhone(), phone);
    }

    @Test
    public void setPhone() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        String newPhone="000-000-0000";
        assertEquals(customer1.getPhone(), phone);
        customer1.setPhone(newPhone);
        assertEquals(customer1.getPhone(), newPhone);
    }

    @Test
    public void getAddres1() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);



        assertEquals(customer1.getAddress_1(), address_1);
    }

    @Test
    public void setAddres1() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        String newAddress1="Happy Land 1234 ";
        assertEquals(customer1.getAddress_1(), address_1);
        customer1.setAddress_1(newAddress1);
        assertEquals(customer1.getAddress_1(), newAddress1);
    }
    @Test
    public void getAddres2() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);



        assertEquals(customer1.getAddress_2(), address_2);
    }

    @Test
    public void setAddres2() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        String newAddress2="Happy Land 1234 ";
        assertEquals(customer1.getAddress_2(), address_2);
        customer1.setAddress_2(newAddress2);
        assertEquals(customer1.getAddress_2(), newAddress2);
    }
    @Test
    public void getCity() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);



        assertEquals(customer1.getCity(), city);
    }

    @Test
    public void setCity() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        String newCity="Camuy";
        assertEquals(customer1.getCity(), city);
        customer1.setCity(newCity);
        assertEquals(customer1.getCity(), newCity);
    }
    @Test
    public void getState() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);



        assertEquals(customer1.getState(), state);
    }

    @Test
    public void setState() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        String newState="PR";
        assertEquals(customer1.getState(), state);
        customer1.setState(newState);
        assertEquals(customer1.getState(), newState);
    }

    @Test
    public void getpostalCode() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);



        assertEquals(customer1.getPostalCode(), postalCode);
    }

    @Test
    public void setPostalCode() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        String newPostalCode="00612";
        assertEquals(customer1.getPostalCode(), postalCode);
        customer1.setPostalCode(newPostalCode);
        assertEquals(customer1.getPostalCode(), newPostalCode);
    }

    @Test
    public void getCountry() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);



        assertEquals(customer1.getCountry(), country);
    }

    @Test
    public void setCountry() {
        id = 1234;
        firstName = "Zulymar";
        lastName = "Garcia";
        email = "zgarcia@gmail.com";
        company = "Netflix";
        phone = "123-345-6789";
        address_1 = "Somewhere";
        address_2 = "Somewhere";
        city = "Los Angeles";
        state = "CA";
        postalCode = "12345";
        country = "USA";

        customer1 = new Customer();
        customer1.setId(id);
        customer1.setFirstName(firstName);
        customer1.setLastName(lastName);
        customer1.setEmail(email);
        customer1.setCompany(company);
        customer1.setPhone(phone);
        customer1.setAddress_1(address_1);
        customer1.setAddress_2(address_2);
        customer1.setCity(city);
        customer1.setState(state);
        customer1.setPostalCode(postalCode);
        customer1.setCountry(country);

        String newCountry="Puerto Rico";
        assertEquals(customer1.getCountry(), country);
        customer1.setCountry(newCountry);
        assertEquals(customer1.getCountry(), newCountry);
    }

    @Test
    public void testEquals() {


        // Reflexive
        assertTrue(customer1.equals(customer1));

        // Symmetric
        assertTrue(customer1.equals(customer2));
        assertTrue(customer2.equals(customer1));

        // Transitive
        assertTrue(customer1.equals(customer2));
        assertTrue(customer2.equals(customer3));
        assertTrue(customer1.equals(customer3));
    }

    @Test
    public void testHashCode() {
        // Reflexive
        assertEquals(customer1.hashCode(), customer1.hashCode());

        // Symmetric
        assertEquals(customer1.hashCode(), customer2.hashCode());
        assertEquals(customer2.hashCode(), customer1.hashCode());

        // Transitive
        assertEquals(customer1.hashCode(), customer2.hashCode());
        assertEquals(customer2.hashCode(), customer3.hashCode());
        assertEquals(customer1.hashCode(), customer3.hashCode());
    }

    @Test
    public void testToString() {
        // Reflexive
        assertEquals(customer1.toString(), customer1.toString());

        // Symmetric
        assertEquals(customer1.toString(), customer2.toString());
        assertEquals(customer2.toString(), customer1.toString());

        // Transitive
        assertEquals(customer1.toString(), customer2.toString());
        assertEquals(customer2.toString(), customer3.toString());
        assertEquals(customer1.toString(), customer3.toString());
    }
}