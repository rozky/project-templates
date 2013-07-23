package com.rozarltd.sample.webapp.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class HomeController {

    @RequestMapping(Array("/", "/index"))
    def home() {
        println("home")
    }
}
