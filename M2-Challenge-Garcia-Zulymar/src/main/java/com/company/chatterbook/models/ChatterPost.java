/**------------------------------------------------
                ChatterPost Class
 -This class have the chatter post of a user

 Author: Zulymar García Sonera
 ------------------------------------------------*/

package com.company.chatterbook.models;

public class ChatterPost {
    private String text;

    public ChatterPost(String text)
    {
        this.text=text;

    }

    public String getChatterPost() {
        return text;
    }

    private void setChatterPost(String text) {
        this.text = text;
    }
}
