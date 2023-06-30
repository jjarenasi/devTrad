package com.example.testrequest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/user")

public class RequestController {
    @PostMapping
    public ResponseEntity<String> saveUser(@RequestBody String user) {
        // Implement
        String uri = "https://uno1kuewrh.execute-api.us-east-2.amazonaws.com/prod/items";
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "ndmgozALnU6l2n16YZrjta01wbXVn2oGQS0MWQe0");
        HttpEntity<Object> entity = new HttpEntity<Object>(headers); 
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
        //String result = restTemplate.getForObject(uri,entityString.class); 
        return response;
    }
}
