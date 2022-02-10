package com.wcci.MVCExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//take in request from user and send it to a template
@Controller
public class BookController {
    private Book book = new Book("Maus","Someone","123456789","Chicken noodle soups");
    @RequestMapping("/")
    public String showBookTemplate(Model model){
        model.addAttribute("book", book);
        return "BookTemplate";
    }

    @RequestMapping("/name")
    public String showPerson(Model model){
        Person person = new Person();
        person.setName("Anish");
        model.addAttribute("person",person);
        return "Person";
    }
}
