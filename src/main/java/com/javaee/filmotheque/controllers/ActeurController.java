package com.javaee.filmotheque.controllers;

import com.javaee.filmotheque.services.interfaces.IActeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/acteur")
public class ActeurController {
    @Autowired
    IActeurService iActeurService;
}
