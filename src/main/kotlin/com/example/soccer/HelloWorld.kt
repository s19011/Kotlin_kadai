package com.example.soccer

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloWorld {
    @GetMapping("/users" )
    fun hello() = "hello"
}