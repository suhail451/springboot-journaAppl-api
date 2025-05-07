package com.suhail.journalapp.controller;

import com.suhail.journalapp.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.suhail.journalapp.model.Journal;

import java.util.List;


@RestController
public class JournalController {
    @Autowired
    private JournalService journalService;

    @GetMapping("/journals")
    public List<Journal> getJournal(){
        return journalService.getAllJournal();

    }
    @PostMapping("/journals")
    public void postJournal(@RequestBody Journal journal){
        journalService.addJournal(journal);



    }
    @GetMapping("/journals/{id}")
    public ResponseEntity<Journal> getJournalById(@PathVariable String id) {
        Journal journal = journalService.getJournalById(id);
        if (journal == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // Return 404 if not found
        }
        return ResponseEntity.ok(journal); // Return 200 with journal data
    }

    @DeleteMapping("/delete/{id}")
    public boolean delteById(@PathVariable String id){
        journalService.deleteJournalById(id);
        return true;

    }
    @PutMapping("/journals/{id}")
    public void updateJournal(@PathVariable String id, @RequestBody Journal journal) {
        journalService.updateJournal(id, journal);
    }


}

