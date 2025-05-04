package com.learning.First.journalApp.controller;

import com.learning.First.journalApp.controller.healthcheck.Entity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long,Entity>journalEntries=new HashMap<>();

    @GetMapping
    public List<Entity> getAll(){

        return new ArrayList<>(journalEntries.values());

    }
    @PostMapping
    public boolean createEntry(@RequestBody Entity myentry){

        journalEntries.put((long) myentry.getId(), myentry);

        return true;
    }
    @GetMapping("id/{myId}")
    public Entity getEntryById(@PathVariable Long myId){

        return journalEntries.get(myId);
    }
    @DeleteMapping("/remove/{myId}") public Entity deleteEntryById(@PathVariable Long myId){

        return journalEntries.remove(myId);
    }
    @PutMapping("/id/{myId}")
    public Entity updateEntryByID(@PathVariable Long myId,@RequestBody Entity myentry){
        return journalEntries.put(myId,myentry);

    }
    }
