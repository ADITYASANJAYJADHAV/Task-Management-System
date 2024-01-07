/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.addy.taskmangement.controller;

import ch.qos.logback.core.model.Model;
import com.addy.taskmanagement.domain.task;
import com.addy.taskmanagement.service.taskservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author admin
 */
@Controller
public class taskcontroller {
    
    @Autowired
        private taskservice  service;
        @GetMapping("/")
        public String viewHomePage(Model model) {
            List<task> liststudent = (List<task>) service.listAll();
            model.addAttribute("liststudent", liststudent);
            System.out.print("Get / ");    
            return "index";
        }
        @GetMapping("/new")
        public String add(Model model) {
            model.addAttribute("task", new task());
            return "new";
        }
        @RequestMapping(value = "/save", method = RequestMethod.POST)
        public String savetask(@ModelAttribute("taskname") description) {
        Object description = null;
            service.save(description);
            return "redirect:/";
        }
        @RequestMapping("/edit/{id}")
        public ModelAndView showEdittaskPage(@PathVariable(name = "id") int id) {
            ModelAndView mav = new ModelAndView("new");
            task name = (task) service.get(id);
            mav.addObject("task", name);
            return mav;
            
        }
        @RequestMapping("/delete/{id}")
        public String deletetask(@PathVariable(name = "id") int id) {
            service.delete(id);
            return "redirect:/";
        }
}
