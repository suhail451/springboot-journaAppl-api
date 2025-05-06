package com.suhail.journalapp.controller;

import com.suhail.journalapp.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void getByID(@PathVariable int id){
        journalService.getJournalById(id);

    }
    @DeleteMapping("/delete/{id}")
    public boolean delteById(@PathVariable int id){
        journalService.deleteJournalById(id);
        return true;

    }
    @PutMapping("/journals/{id}")
    public void updateJournal(@PathVariable int id, @RequestBody Journal journal) {
        journalService.updateJournal(id, journal);
    }


}

