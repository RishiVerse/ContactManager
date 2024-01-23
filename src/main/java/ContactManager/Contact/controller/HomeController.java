package ContactManager.Contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ContactManager.Contact.DAO.UserRepository;
import ContactManager.Contact.Entities.User;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/home")
    public String home() {
        // User user = new User();
        // user.setEmail("rishabh@gmail.com");
        // user.setAbout("just testing");

        // user.setName("rishabh");
        // user.setPassword("nopass");
        // user.setRole("superuser");
        // user.setStatus(false);
        // userRepository.save(user);
        return "home.html";
    }

    @RequestMapping(value = "/do_register", method = RequestMethod.POST)
    public String signUp(@RequestParam String name, @RequestParam String email, @RequestParam String password,
            @RequestParam String about) {

        User user = new User(name, email, password, about);
        userRepository.save(user);

        System.out.println(name + "\n" + email + "\n" + password + "\n" + about);
        return "signup.html";
    }

}
