package org.example.controllers;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class RecipeController {
    @GetMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return Collections.singletonMap("data", "Hello world");
    }
}