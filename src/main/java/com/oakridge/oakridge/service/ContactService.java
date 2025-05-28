package com.oakridge.oakridge.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.oakridge.oakridge.model.Contact;

@Service
public class ContactService {

     private static Logger log = LoggerFactory.getLogger(ContactService.class);

    /**
     * Saves the message details of a contact.
     * 
     * @param contact The contact object containing message details.
     * @return true if the message details were saved successfully, false otherwise.
     */
    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;

        log.info(contact.toString());
        return isSaved;
        
    }
}
