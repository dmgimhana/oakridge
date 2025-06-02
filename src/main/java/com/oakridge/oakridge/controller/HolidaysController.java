package com.oakridge.oakridge.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oakridge.oakridge.model.Holiday;


@Controller
public class HolidaysController {
    
    @GetMapping("/holidays")
    public String displayHolidays(
    @RequestParam(required = false) boolean festival ,  
    @RequestParam(required = false) boolean federal, 
    Model model) {

        model.addAttribute("festival", festival);
        model.addAttribute("federal", federal);
        
        List<Holiday> holidays = Arrays.asList(
            new Holiday("January 1", "New Year's Day", Holiday.Type.FESTIVAL),
            new Holiday("January 15", "Martin Luther King Jr. Day", Holiday.Type.FEDERAL),
            new Holiday("February 19", "Presidents' Day", Holiday.Type.FEDERAL),
            new Holiday("May 29", "Memorial Day", Holiday.Type.FEDERAL),
            new Holiday("July 4", "Independence Day", Holiday.Type.FEDERAL),
            new Holiday("September 4", "Labor Day", Holiday.Type.FEDERAL),
            new Holiday("October 9", "Columbus Day", Holiday.Type.FEDERAL),
            new Holiday("November 10", "Veterans Day (Observed)", Holiday.Type.FEDERAL),
            new Holiday("November 23", "Thanksgiving Day", Holiday.Type.FESTIVAL),
            new Holiday("December 25", "Christmas Day", Holiday.Type.FESTIVAL)
        );

        Holiday.Type[] types = Holiday.Type.values();
        for(Holiday.Type type: types){
            model.addAttribute(type.toString() , (holidays.stream().filter(holiday -> holiday.getType().equals(type)).collect(Collectors.toList())));
        }

        
        return "holidays.html"; 
    }

}
