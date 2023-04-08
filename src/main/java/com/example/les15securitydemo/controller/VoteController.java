package com.example.les15securitydemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/votes")
public class VoteController {
    public List<String> votes = new ArrayList<>();

    @PostMapping
    public ResponseEntity<String> addVotes(@RequestParam String partij)
    {
        votes.add(partij);

        return new ResponseEntity<>("Party successfully added",HttpStatus.CREATED);

    }


    @GetMapping
    public ResponseEntity<List<String>> getAllVotes() {
        return new ResponseEntity<>(votes, HttpStatus.OK);
    }
}

