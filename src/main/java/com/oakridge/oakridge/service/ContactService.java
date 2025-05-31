package com.oakridge.oakridge.service;

import org.springframework.stereotype.Service;

import com.oakridge.oakridge.model.Contact;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ContactService {

    //  private static Logger log = LoggerFactory.getLogger(ContactService.class);

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
