package com.tw.api.unit.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tw.api.unit.test.services.ShowService;

@RestController
@RequestMapping("/shows")
public class ShowController {


    private final ShowService showService;

    @Autowired
    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @GetMapping
    public ResponseEntity<String> getAll() {

        return ResponseEntity.ok(this.showService.getShowLable());
    }

}
