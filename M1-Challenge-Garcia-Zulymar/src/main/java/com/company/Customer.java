/**--------------------------------------------------
                Customer Class
 -This class have all the information of the customer:
 id,name,list of charges and date of charge

 Author:Zulymar García Sonera
 ------------------------------------------------- */

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<AccountRecord> charges = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        int sum=0;
        for(AccountRecord a : charges)
            sum += a.getCharge();
        return sum;
    }

    public List<AccountRecord> getCharges() {
        return charges;
    }

    @Override
    public String toString() {
        return String.valueOf(getId())+", "+getName()+", "+String.valueOf(getBalance());
    }
}
