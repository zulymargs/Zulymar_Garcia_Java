/**------------------------------------------------
              ChatterBookController
Controller for the Chatter book application.
Class-level-annotation to handle the Https requests

 Author: Zulymar García Sonera
 ------------------------------------------------*/

package com.company.chatterbook.ChatterbookController;

import com.company.chatterbook.models.ChatterPost;
import com.company.chatterbook.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;


@RestController
public class ChatterbookController {

    private List<User> userList;

    public ChatterbookController() {
        User luis = new User("Luis");
        User sue = new User("Sue");
        User timothy = new User("Timothy");
        User george = new User("George");
        User arturo = new User("Arturo");
        User mariella = new User("Mariella");
        User paolo = new User("Paolo");
        User tri = new User("Tri");
        User jane = new User("Jane");
        User carol = new User("Carol");
        User carl = new User("Carl");

        luis.setChatterPosts(Arrays.asList(new ChatterPost("Hey! This is my first post!"), new ChatterPost("Anybody want to be friends?")));
        sue.setChatterPosts(Arrays.asList(new ChatterPost("I'm bored"), new ChatterPost("Who wants to hang?")));
        timothy.setChatterPosts(Arrays.asList(new ChatterPost("My life is awesome!"), new ChatterPost("Click here to buy my vegan shakes!")));
        george.setChatterPosts(Arrays.asList(new ChatterPost("I like pigs."), new ChatterPost("I love lamp.")));
        arturo.setChatterPosts(Arrays.asList(new ChatterPost("My cat is so cute"), new ChatterPost("My kitten is purr-fect.")));
        mariella.setChatterPosts(Arrays.asList(new ChatterPost("I'll never post again")));
        paolo.setChatterPosts(Arrays.asList(new ChatterPost("Have you ever heard of the band Nirvana?"), new ChatterPost("Pearl Jam 4 Life")));
        tri.setChatterPosts(Arrays.asList(new ChatterPost("You definitely grew up in the 90s if you get these 10 references."), new ChatterPost("I don't get this generation? Everyone expects a participation trophy.")));
        jane.setChatterPosts(Arrays.asList(new ChatterPost("I just wrecked my dad's car. He's going to kill me!"), new ChatterPost("Grounded.... for 5 months :( ")));
        carol.setChatterPosts(Arrays.asList(new ChatterPost("Does anyone have some imodium?")));
        carl.setChatterPosts(Arrays.asList(new ChatterPost("My roommate is awful!!!!"), new ChatterPost("Anyone know a room for rent in Hyde Park?")));

        userList = Arrays.asList(luis, sue, timothy, george, arturo, mariella, paolo, tri, jane, carol, carl);
    }

//------------------------------GET route requests------------------------------

    //GET all users on Chatter Book
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<User> getUserList()
    {
        return userList;
    }

    //GET the information about a specific user
    @RequestMapping(value = "/users/name/{name}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public User getUserByName(@PathVariable String name)
    {
        for (User u : userList)
        {
            if (u.getName().equals(name)) {
                return u;
            }
        }
        return null;
    }

    //GET all chatterPosts of a specific user
    @RequestMapping(value = "/users/chatterPosts/{name}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<ChatterPost> getUserChatterPostsByName(@PathVariable String name)
    {
        for (User u : userList) {
            if (u.getName().equals(name)) {
                return u.getChatterPosts();
            }
        }
        return null;
    }
}
