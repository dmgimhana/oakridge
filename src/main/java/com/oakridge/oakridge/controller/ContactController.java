package com.oakridge.oakridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oakridge.oakridge.model.Contact;
import com.oakridge.oakridge.service.ContactService;



@Controller
public class ContactController {

   
    private final ContactService contactService;


    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    @RequestMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }
    

    // @RequestMapping(value="/saveMsg", method = RequestMethod.POST)
    // public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum, @RequestParam String email, @RequestParam String subject, @RequestParam String message){

    //     log.info("Name : " + name);
    //     log.info("Mobile Number : " + mobileNum);
    //     log.info("Email Address : " + email);
    //     log.info("Subject : " + subject);
    //     log.info("Message : " + message);

    //     return new ModelAndView("redirect:/contact");
    // }

     @RequestMapping(value="/saveMsg", method = RequestMethod.POST)
    public ModelAndView saveMessage(Contact contact){

        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }
    

}
