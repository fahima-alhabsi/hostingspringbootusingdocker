package com.example.hosting_jar_using_docker.controlles;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin("*")
public class controller {

    List<String> m = new ArrayList<>();

    @GetMapping(path="/api")
public List<String> showList(){

    m.add("malak");
    m.add("fahima");
    return m;
}
}
