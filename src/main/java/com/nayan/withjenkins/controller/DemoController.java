package com.nayan.withjenkins.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public ResponseEntity<Map<String, String>> getData()
    {
        Map<String,String> data = new HashMap<>();
        data.put("name","Sourav Hatai");
        data.put("age","26");
        data.put("address","Radhaballavchak");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

}
