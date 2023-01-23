/**--------------------------------------------------
        Module #1 Challenge: Account Balancing
 -This application is a command-line application
 that will parse accounting information and output
 user-readable reports.

 Author:Zulymar García Sonera
 ------------------------------------------------- */

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Main {

    private static List<String[]> customerData = Arrays.asList(
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"},
            new String[]{"2", "Daily Planet", "-7500", "01-10-2022"},
            new String[]{"1", "Wayne Enterprises", "18000", "12-22-2021"},
            new String[]{"3", "Ace Chemical", "-48000", "01-10-2022"},
            new String[]{"3", "Ace Chemical", "-95000", "12-15-2021"},
            new String[]{"1", "Wayne Enterprises", "175000", "01-01-2022"},
            new String[]{"1", "Wayne Enterprises", "-35000", "12-09-2021"},
            new String[]{"1", "Wayne Enterprises", "-64000", "01-17-2022"},
            new String[]{"3", "Ace Chemical", "70000", "12-29-2022"},
            new String[]{"2", "Daily Planet", "56000", "12-13-2022"},
            new String[]{"2", "Daily Planet", "-33000", "01-07-2022"},
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"},
            new String[]{"2", "Daily Planet", "33000", "01-17-2022"},
            new String[]{"3", "Ace Chemical", "140000", "01-25-2022"},
            new String[]{"2", "Daily Planet", "5000", "12-12-2022"},
            new String[]{"3", "Ace Chemical", "-82000", "01-03-2022"},
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"}
    );

    private static List<Customer> customersRecord = new ArrayList<>();

    public static void main(String[] args) {

        /* ---------------------Create a record for each customer---------------------
          -Transfer the raw data in customerData list to customerRecord list
        */

        for (int i = 0; i < customerData.size(); i++) {
            if (customersRecord.isEmpty()) //This is the first customer
            {
                Customer customer = new Customer();
                customer.setId(Integer.parseInt(customerData.get(i)[0]));
                customer.setName(customerData.get(i)[1]);

                AccountRecord accountRecord = new AccountRecord();
                accountRecord.setCharge(Integer.parseInt(customerData.get(i)[2]));
                accountRecord.setChargeDate(customerData.get(i)[3]);

                customer.getCharges().add(accountRecord);
                customersRecord.add(customer);

            } else //More than one customerData, have to check if it's id is stored or if it's a new one
            {
                boolean inRecord = FALSE; //Flag to recognize if it's a new customer
                int id_index = 0; //if it's an already stored customer, then we store it's index position within the customersRecord list

                for (Customer c : customersRecord)
                {
                    if (c.getId() == Integer.parseInt(customerData.get(i)[0])) {
                        inRecord = TRUE;
                        break;
                    } else {
                        id_index++;
                    }
                }

                if (inRecord) //just update the Account record of this customer
                {
                    AccountRecord accountRecord = new AccountRecord();
                    accountRecord.setCharge(Integer.parseInt(customerData.get(i)[2]));
                    accountRecord.setChargeDate(customerData.get(i)[3]);
                    customersRecord.get(id_index).getCharges().add(accountRecord);
                }

                else //new customer
                {
                    Customer customer = new Customer();
                    customer.setId(Integer.parseInt(customerData.get(i)[0]));
                    customer.setName(customerData.get(i)[1]);

                    AccountRecord accountRecord = new AccountRecord();
                    accountRecord.setCharge(Integer.parseInt(customerData.get(i)[2]));
                    accountRecord.setChargeDate(customerData.get(i)[3]);

                    customer.getCharges().add(accountRecord);
                    customersRecord.add(customer);
                }
            }
        }

        /* -----------------------Let user get access to a list of positive accounts and a list of negative accounts-----------------------*/

        //All positive accounts
        List<Customer> positiveAccounts = customersRecord.stream().filter(customer -> customer.getBalance() >= 0).collect(Collectors.toList());

        System.out.println("Positive accounts:");
        for (Customer c : positiveAccounts) {
            System.out.println(c.toString());
        }

        //All negative accounts
        List<Customer> negativeAccounts = customersRecord.stream().filter(customer -> customer.getBalance() < 0).collect(Collectors.toList());

        System.out.println("\nNegative accounts:");
        for (Customer c : negativeAccounts) {
            System.out.println(c.toString());
        }

    }
}
