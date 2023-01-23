/**--------------------------------------------------
                    Customer Test
 -To test getBalance and toString methods from
 Customer class

 Author:Zulymar García Sonera
 ------------------------------------------------- */


package com.company;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CustomerTest {

    //----------------------Verification of getBalance() functionality----------------------
    @Test
    public void shouldGetBalanceOfTwoCharges()
    {
        Customer customer = new Customer();

        AccountRecord accountRecord_1Test = new AccountRecord();
        accountRecord_1Test .setCharge(100);
        customer.getCharges().add(accountRecord_1Test );

        AccountRecord accountRecord_2Test = new AccountRecord();
        accountRecord_2Test .setCharge(200);
        customer.getCharges().add(accountRecord_2Test );

        assertEquals(300,customer.getBalance());
    }

    @Test
    public void shouldGetBalanceOfOneCharge()
    {
        Customer customer = new Customer();

        AccountRecord accountRecord_1Test = new AccountRecord();
        accountRecord_1Test .setCharge(25);
        customer.getCharges().add(accountRecord_1Test );

        assertEquals(25,customer.getBalance());
    }

    @Test
    public void shouldGetBalanceOfOneNegativeandOnePositiveCharges()
    {
        Customer customer = new Customer();

        AccountRecord accountRecord_1Test = new AccountRecord();
        accountRecord_1Test .setCharge(-100);
        customer.getCharges().add(accountRecord_1Test );

        AccountRecord accountRecord_2Test = new AccountRecord();
        accountRecord_2Test .setCharge(50);
        customer.getCharges().add(accountRecord_2Test );

        assertEquals(-50,customer.getBalance());
    }


    //---------------------------Verification of toString() functionability----------------------

    @Test
    public void shouldReturnString()
    {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("John");

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setCharge(22);

        customer.getCharges().add(accountRecord);

        assertEquals("1, John, 22", customer.toString() );
    }

    @Test
    public void shouldReturnStringWithNegativeBalance()
    {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("John");

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setCharge(22);
        customer.getCharges().add(accountRecord);

        AccountRecord secondAccountRecord = new AccountRecord();
        secondAccountRecord.setCharge(-100);
        customer.getCharges().add(secondAccountRecord);

        assertEquals("1, John, -78", customer.toString() );
    }
}