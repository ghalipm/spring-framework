package com.cydeo.controller;

import com.cydeo.model.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dogs")
public class DogController {
@RequestMapping("/dog")
    public String showDog(Model model){
    List<Dog> dogList=new ArrayList<>();
    dogList.add(new Dog("HushPuppy", "Aplarslan")); // localhost:8080/dogs/dog
    dogList.add(new Dog("TeleTuby", "Filinta"));

    model.addAttribute("dogs",dogList);
    return "dog/dog-info";
}
}
