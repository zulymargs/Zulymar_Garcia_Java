/**------------------------------------------------
                    User Class
-This class have all the information of a user:
 name and a list of chatter posts

 Author: Zulymar García Sonera
 ------------------------------------------------*/
package com.company.chatterbook.models;

import java.util.ArrayList;
import java.util.List;

public class User {

   private String name;
   private List<ChatterPost> chatterPosts=new ArrayList<>();

    public User(String name)
    {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public List<ChatterPost> getChatterPosts() {
        return chatterPosts;
    }
    public void setChatterPosts(List<ChatterPost> chatterPosts) {
        this.chatterPosts = chatterPosts;
    }





}
